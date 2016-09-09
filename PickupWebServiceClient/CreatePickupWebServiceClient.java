import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.math.*;

import org.apache.axis.types.Time;
import org.apache.axis.types.PositiveInteger;

import com.fedex.pickup.stub.*;

/** 
 * Sample code to call the FedEx Pickup service with Axis 
 * <p>
 * com.fedex.Pickup.stub is generated via WSDL2Java, like this:<br>
 * <pre>
 * java org.apache.axis.wsdl.WSDL2Java -w -p com.fedex.Pickup.stub http://www.fedex.com/...../PickupService?wsdl
 * </pre>
 * 
 * This sample code has been tested with JDK 5 and Apache Axis 1.4
 */
public class CreatePickupWebServiceClient {
	//
	private static SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
	//
	public static void main(String[] args) {
		// Build a PickupRequest object
		
		CreatePickupRequest request = new CreatePickupRequest();
        request.setClientDetail(createClientDetail());
        request.setWebAuthenticationDetail(createWebAuthenticationDetail());
        //
	    TransactionDetail transactionDetail = new TransactionDetail();
	    transactionDetail.setCustomerTransactionId("java sample - Pickup Request"); // This is a reference field for the customer.  Any value can be used and will be provided in the response.
	    request.setTransactionDetail(transactionDetail);

        //
        VersionId versionId = new VersionId("disp", 13, 0, 0);
        request.setVersion(versionId);
		//
	    PickupOriginDetail PickupOriginDetail = new PickupOriginDetail(); // Origin Information
	    //Party party = new Party();
	    ContactAndAddress party = new ContactAndAddress();
	    //
	    // Pick up location contact details
	    Contact contact = new Contact();
	    contact.setPersonName("Rahul");
	    contact.setEMailAddress("mistryrahul1988@gmail.com");
	    contact.setCompanyName("Company Name");
	    contact.setPhoneNumber("1234567890");
	    party.setContact(contact);
	    // Pick up location Address 
	    Address address = new Address();
	    String[] street = new String[1];
	    street[0] = "No2,Motilal Colony,P/O-Rajbari";
	    address.setStreetLines(street);
	    address.setCity("KOLKATA");
	    address.setStateOrProvinceCode("");
	    address.setPostalCode("700081");
	    address.setCountryCode("IN");
	    party.setAddress(address);
	    PickupOriginDetail.setPickupLocation(party);
	    PickupOriginDetail.setPackageLocation(PickupBuildingLocationType.FRONT); // Package Location can be NONE, FRONT, REAR, SIDE
	    PickupOriginDetail.setBuildingPart(BuildingPartCode.BUILDING); // BuildingPartCode values are APARTMENT, BUILDING,DEPARTMENT, SUITE, FLOOR, ROOM
	    PickupOriginDetail.setBuildingPartDescription("498");
	    //
        PickupOriginDetail.setReadyTimestamp(getReadyDateTime()); // Package Ready Date and Time
        //
        PickupOriginDetail.setCompanyCloseTime(new Time(getLatestPickupDateTime())); // Package Location Closing Time
        //
        request.setOriginDetail(PickupOriginDetail);
        request.setPackageCount(new PositiveInteger("1")); //Number of Packages to Pickup
	    // Packages Weight 
	    Weight weight = new Weight();
	    weight.setValue(new BigDecimal(1.0));
	    weight.setUnits(WeightUnits.LB);
	    request.setTotalWeight(weight);
	    request.setCarrierCode(CarrierCodeType.FDXE); //CarrierCodeTypes are FDXC(Cargo), FDXE (Express), FDXG (Ground), FDCC (Custom Critical), FXFR (Freight)
	    //request.setOversizePackageCount(new PositiveInteger("1")); // Set this value if package is over sized
	    request.setRemarks("Testing - do not pickup"); // Courier Remarks
	    //
		try {
			// Initialize the service
			PickupServiceLocator service;
			PickupPortType port;
			//
			service = new PickupServiceLocator();
			updateEndPoint(service);
			port = service.getPickupServicePort();
			// This is the call to the web service passing in a PickupRequest and returning a PickupReply
			CreatePickupReply reply = port.createPickup(request);
			//
			if (isResponseOk(reply.getHighestSeverity()))
			{
				System.out.println("PickupConfirmationNumber  : " + reply.getPickupConfirmationNumber()); // Pickup Confirmation Number
				System.out.println("Location :" + reply.getLocation());
				if(reply.getMessageCode()!=null)
				System.out.println("Message Code: " + reply.getMessageCode() + " Message: " + reply.getMessage() );
			}

			printNotifications(reply.getNotifications());

		} catch (Exception e) {
		    e.printStackTrace();
		}
		
	}
	
	private static ClientDetail createClientDetail() {
        ClientDetail clientDetail = new ClientDetail();
        String accountNumber = System.getProperty("accountNumber");
        String meterNumber = System.getProperty("meterNumber");
        
        //
        // See if the accountNumber and meterNumber properties are set,
        // if set use those values, otherwise default them to "XXX"
        //
        if (accountNumber == null) {
        	accountNumber = "510087941"; // Replace "XXX" with clients account number
        }
        if (meterNumber == null) {
        	meterNumber = "118742557"; // Replace "XXX" with clients meter number
        }
        clientDetail.setAccountNumber(accountNumber);
        clientDetail.setMeterNumber(meterNumber);
        return clientDetail;
	}
	
	private static WebAuthenticationDetail createWebAuthenticationDetail() {
        WebAuthenticationCredential userCredential = new WebAuthenticationCredential();
        String key = System.getProperty("key");
        String password = System.getProperty("password");       
        //
        // See if the key and password properties are set,
        // if set use those values, otherwise default them to "XXX"
        //
        if (key == null) {
        	key = "kMmrZ6Ps7z8Ktjer"; // Replace "XXX" with clients key
        }
        if (password == null) {
        	password = "mdrdd8yJpJ81TN6UzudWfPEUo"; // Replace "XXX" with clients password
        }
        userCredential.setKey(key);
        userCredential.setPassword(password);
        
        WebAuthenticationCredential parentCredential = null;
        Boolean useParentCredential=false; //Set this value to true is using a parent credential
        if(useParentCredential){
        
        	String parentKey = System.getProperty("parentkey");
        	String parentPassword = System.getProperty("parentpassword");
        	//
            // See if the parentkey and parentpassword properties are set,
            // if set use those values, otherwise default them to "XXX"
        	//
        	if (parentKey == null) {
        		parentKey = "XXX"; // Replace "XXX" with clients parent key
        	}
        	if (parentPassword == null) {
        		parentPassword = "XXX"; // Replace "XXX" with clients parent password
        	}
        	parentCredential = new WebAuthenticationCredential();
        	parentCredential.setKey(parentKey);
        	parentCredential.setPassword(parentPassword);
        }
		return new WebAuthenticationDetail(parentCredential, userCredential);
	}
	
	private static Calendar stringToCalendar(String theDateStr) {
		Calendar calendar = null;
		Date date = null;
		try {
			date = DATE_FORMAT.parse(theDateStr);
			calendar = Calendar.getInstance();
			calendar.setTime(date);
		} catch (ParseException pe) {
			pe.printStackTrace();
		}
		return calendar;
	}
	
	private static Calendar getReadyDateTime(){
		// See if the readyDateTime property is set
		// otherwise default it
	    if (System.getProperty("readyDateTime") == null){
	    	Calendar nextDay = Calendar.getInstance();
	    	nextDay.add(Calendar.DATE,1);
	    	nextDay.set(Calendar.HOUR_OF_DAY,12);
	    	nextDay.set(Calendar.MINUTE,0);
	    	nextDay.set(Calendar.SECOND,0);
	    	
//	    	System.out.println("-=-=-=-=-===-=-=-=-=-=-<START>=-=-=-=-=-=-=-=-=-=-=-=-=-=");
//	    	System.out.println(nextDay.getTime());
//	    	System.out.println("-=-=-=-=-===-=-=-=-=-=-=<END>-=-=-=-=-=-=-=-=-=-=-=-=");
	    	
	    	return nextDay; // local time
	    }else{
	    	return stringToCalendar(System.getProperty("readyDateTime"));
	    }
	}
	private static Calendar getLatestPickupDateTime(){
		// See if the latestPickupDateTime property is set
		// otherwise default it
	    if (System.getProperty("latestPickupDateTime") == null){
	    	Calendar nextDay = Calendar.getInstance();
	    	nextDay.add(Calendar.DATE,1);
	    	nextDay.set(Calendar.HOUR_OF_DAY,22);
	    	nextDay.set(Calendar.MINUTE,0);
	    	nextDay.set(Calendar.SECOND,0);
	    	return nextDay; // local time
	    }else{
	    	return stringToCalendar(System.getProperty("latestPickupDateTime"));
	    }
	}
	
	private static void printNotifications(Notification[] notifications) {
		System.out.println("Notifications:");
		if (notifications == null || notifications.length == 0) {
			System.out.println("  No notifications returned");
		}
		for (int i=0; i < notifications.length; i++){
			Notification n = notifications[i];
			System.out.print("  Notification no. " + i + ": ");
			if (n == null) {
				System.out.println("null");
				continue;
			} else {
				System.out.println("");
			}
			NotificationSeverityType nst = n.getSeverity();

			System.out.println("    Severity: " + (nst == null ? "null" : nst.getValue()));
			System.out.println("    Code: " + n.getCode());
			System.out.println("    Message: " + n.getMessage());
			System.out.println("    Source: " + n.getSource());
		}
	}

	private static boolean isResponseOk(NotificationSeverityType notificationSeverityType) {
		if (notificationSeverityType == null) {
			return false;
		}
		if (notificationSeverityType.equals(NotificationSeverityType.WARNING) ||
			notificationSeverityType.equals(NotificationSeverityType.NOTE)    ||
			notificationSeverityType.equals(NotificationSeverityType.SUCCESS)) {
			return true;
		}
 		return false;
	}

	private static void updateEndPoint(PickupServiceLocator serviceLocator) {
		String endPoint = System.getProperty("endPoint");
		if (endPoint != null) {
			serviceLocator.setPickupServicePortEndpointAddress(endPoint);
		}
	}
}
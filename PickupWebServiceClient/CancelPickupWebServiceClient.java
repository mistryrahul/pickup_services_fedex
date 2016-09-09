import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import com.fedex.pickup.stub.*;

/** 
 * Sample code to call the FedEx Cancel Pickup Web Service
 * This will cancel the schedule Courier Pickup
 * <p>
 * com.fedex.pickup.stub is generated via WSDL2Java, like this:<br>
 * <pre>
 * java org.apache.axis.wsdl.WSDL2Java -w -p com.fedex.pickup.stub http://www.fedex.com/...../PickupService?wsdl
 * </pre>
 * 
 * This sample code has been tested with JDK 5 and Apache Axis 1.4
 */
public class CancelPickupWebServiceClient {
	//
	private static SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
	//
	public static void main(String[] args) { 
	    //
		// Build a CancelPickupRequest object
		CancelPickupRequest request = new CancelPickupRequest();

        request.setClientDetail(createClientDetail());
        request.setWebAuthenticationDetail(createWebAuthenticationDetail());
        //
        VersionId versionId = new VersionId("disp", 13, 0, 0);
        request.setVersion(versionId);
	    //
	    TransactionDetail transactionDetail = new TransactionDetail();
	    transactionDetail.setCustomerTransactionId("java sample - Cancel Pickup Request"); //This is a reference field for the customer.  Any value can be used and will be provided in the return.
	    request.setTransactionDetail(transactionDetail);
        //
	    request.setCarrierCode(CarrierCodeType.FDXE); //CarrierCodeTypes are FDXC, FDXE (Express), FDXG (Ground), FDCC (Custom Critical), FXFR (Freight)
       
//	    request.setPickupConfirmationNumber(getPickupConfirmationNumber());  // pick up CONFIRMATION NUMBEER
	    request.setPickupConfirmationNumber("1");  // pick up CONFIRMATION NUMBEER
	    
	    
        request.setScheduledDate(getDispathDate().getTime()); // SCHEDULED DATE AND TIME
//        request.setLocation(getLocationId()); // Replace "XXX" with Pickup Location ID
        request.setLocation("CCUA"); // Replace "XXX" with Pickup Location ID
        
        request.setRemarks("This is a test - Cancel Pickup Request");
        //
		try {
			// Initialize the service
			PickupServiceLocator service;
			PickupPortType port;
			//	
			service = new PickupServiceLocator();
			updateEndPoint(service);
			port = service.getPickupServicePort();	
			// This is the call to the web service passing in a CancelPickupRequest and returning a CancelPickupReply
			CancelPickupReply reply = port.cancelPickup(request);
			//
			if (isResponseOk(reply.getHighestSeverity()))
			{
				if(reply.getMessage()!=null)
				System.out.println(reply.getMessage());
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
	
	private static String getPickupConfirmationNumber() {
		// See if pickup confirmation number property is set,
		// if set use that value, otherwise default to "XXX"
		String pickupConfirmationNumber = System.getProperty("PickupConfirmationNumber");
		if (pickupConfirmationNumber == null) {
			pickupConfirmationNumber = "XXX"; // Replace "XXX" with Confirmation Number
		}
		return pickupConfirmationNumber;
	}
	private static String getLocationId() {
		// See if pickup location id property is set,
		// if set use that value, otherwise default to "XXX"
		String locationId = System.getProperty("LocationId");
		if (locationId == null) {
			locationId = "XXX"; // Replace "XXX" with Location Id
		}
		return locationId;
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
	
	private static Calendar getDispathDate(){
		// See if the readyDateTime property is set
		// otherwise default it
	    if (System.getProperty("readyDateTime") == null){
	    	Calendar nextDay = Calendar.getInstance();
	    	nextDay.add(Calendar.DATE,1);
	    	nextDay.set(Calendar.HOUR_OF_DAY,12);
	    	nextDay.set(Calendar.MINUTE,0);
	    	nextDay.set(Calendar.SECOND,0);
	    	return nextDay; // local time
	    }else{
	    	return stringToCalendar(System.getProperty("dispathDate"));
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
import java.math.BigDecimal;

import com.fedex.pickup.stub.*;

import org.apache.axis.types.NonNegativeInteger;

/** 
 * Sample code to call the FedEx Pickup Availability Web Service
 * 
 * <p>
 * com.fedex.pickup.stub is generated via WSDL2Java, like this:<br>
 * <pre>
 * java org.apache.axis.wsdl.WSDL2Java -w -p com.fedex.pickup.stub http://www.fedex.com/...../PickupService?wsdl
 * </pre>
 * 
 * This sample code has been tested with JDK 5 and Apache Axis 1.4
 */
public class PickupAvailabilityWebServiceClient {
//
	public static void main(String[] args) { 
	    //
		// Build a PickupAvailabilityRequest object
		PickupAvailabilityRequest request = new PickupAvailabilityRequest();

        request.setClientDetail(createClientDetail());
        request.setWebAuthenticationDetail(createWebAuthenticationDetail());
        //
        VersionId versionId = new VersionId("disp", 13, 0, 0);
        request.setVersion(versionId);
	    //
	    TransactionDetail transactionDetail = new TransactionDetail();
	    transactionDetail.setCustomerTransactionId("java sample - PickupAvailabilityRequest"); //This is a reference field for the customer.  Any value can be used and will be provided in the return.
	    request.setTransactionDetail(transactionDetail);
        //
	    Address pickupAddress = new Address();
	    
	    String[] addrs={"NO-2,Motilal Colony","P/O-Rajbari, Dum Dum"};
	    
	    pickupAddress.setStreetLines(addrs);
	    pickupAddress.setPostalCode("700001");
	    pickupAddress.setCountryCode("IN");
	    pickupAddress.setCountryName("INDIA");
	    pickupAddress.setResidential(true);
	      
	        
	    
	    request.setPickupAddress(pickupAddress);
	    request.setPickupRequestType(new PickupRequestType[] {PickupRequestType.FUTURE_DAY});
	    java.util.Date dispatchDate = new java.util.Date();
	    request.setDispatchDate(dispatchDate);
	    CarrierCodeType cct[] = new CarrierCodeType[2];
	    cct[0]=CarrierCodeType.FDXE;
	    cct[1]=CarrierCodeType.FDXG;
	    request.setCarriers(cct);
	    
	    PickupShipmentAttributes shipmentAttributes = new PickupShipmentAttributes();
	    shipmentAttributes.setDimensions(new Dimensions(new NonNegativeInteger("1"), new NonNegativeInteger("1"), new NonNegativeInteger("1"), LinearUnits.IN));
	    shipmentAttributes.setWeight(new Weight(WeightUnits.LB, new BigDecimal(2.0)));
	    request.setShipmentAttributes(shipmentAttributes);

        //
		try {
			// Initialize the service
			PickupServiceLocator service;
			PickupPortType port;
			//	
			service = new PickupServiceLocator();
			updateEndPoint(service);
			port = service.getPickupServicePort();	
			// This is the call to the web service passing in a PickupAvailabilityRequest and returning a PickupAvailabilityReply
			PickupAvailabilityReply reply = port.getPickupAvailability(request);
			//
			if (isResponseOk(reply.getHighestSeverity()))
			{
				printReply(reply);
			}

			printNotifications(reply.getNotifications());
			
		} catch (Exception e) {
			
			System.out.println("MESSAGE--->>>"+e.getMessage()+" \n");
		    e.printStackTrace();
		}
	}
	
	private static void printReply(PickupAvailabilityReply reply) 
	{
		if (reply == null) {
			return;
		}
		PickupScheduleOption[] options = reply.getOptions();
		if (options == null) {
			return;
		}
		for (int i=0; i < options.length; i++) 
		{
			System.out.println("  Option " + (i + 1));
			System.out.println("  Carrier: " + options[i].getCarrier());
			System.out.println("  Available: " + options[i].getAvailable());
			System.out.println("  Pickup date: " + options[i].getPickupDate());
			System.out.println("  CutOffTime: " + options[i].getCutOffTime());
			System.out.println("  AccessTime: " + options[i].getAccessTime());
			System.out.println("  ResidentialAvailable: " + options[i].getResidentialAvailable());
			System.out.println("");
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

package application.tools;

import java.util.HashMap;
import application.model.*;

public class Database {

	private static HashMap<String, Carrier> carriers;
	private static HashMap<String, Recipient> recipients;
	private static HashMap<String, Delivery> deliveries;
	
	public Database() {
		carriers = new HashMap<String, Carrier>();
		recipients = new HashMap<String, Recipient>();
		deliveries = new HashMap<String, Delivery>();
		carriers.put("admin", new Carrier("admin", "123", "123@neu.com", "123"));
		recipients.put("muyun", new Recipient("muyun", "456", "456@neu.com", "456"));
		deliveries.put("666", new Delivery("666", "Muyun"));
		deliveries.put("888", new Delivery("888", "Joy"));
	}
	
	public static HashMap<String, Carrier> getCarriers() {
		return carriers;
	}

	public static HashMap<String, Recipient> getRecipients() {
		return recipients;
	}

	public static HashMap<String, Delivery> getDeliveries() {
		return deliveries;
	}

	public void addCarriers(String name, String phone, String email, String password) {
		carriers.put(name, new Carrier(name, phone, email, password));
	}

	public void addRecipients(String name, String phone, String email, String password) {
		recipients.put(name, new Recipient(name, phone, email, password));
	}

	public static void addDeliveries(String trackingNumber, String recipientName) {
		deliveries.put(trackingNumber, new Delivery(trackingNumber, recipientName));
	}

	public static Carrier findCarrier(String userName) {
		for (Carrier carrier : carriers.values()) {
            if (carrier.getName().equals(userName)) {
                return carrier; 
            }
        }
		return null;
	}
	
	public static String getCarrierPasswd(Carrier carrier) {
		return carrier.getPassword();
	}
	
	public static boolean checkCarrierValid(String userName, String password) {
		for (Carrier carrier : carriers.values()) {
            if (carrier.getName().equals(userName) && carrier.getPassword().equals(password)) {
                return true; 
            }
        }
		return false;
	}
	
	public static Recipient findRecipient(String userName) {
		for (Recipient recipient : recipients.values()) {
            if (recipient.getName().equals(userName)) {
                return recipient; 
            }
        }
		return null;
	}
	
	public static String getRecipientPasswd(Recipient recipient) {
		return recipient.getPassword();
	}
	
	public static boolean checkRecipientValid(String userName, String password) {
		for (Recipient recipient : recipients.values()) {
            if (recipient.getName().equals(userName) && recipient.getPassword().equals(password)) {
                return true; 
            }
        }
		return false;
	}
	
	public static Delivery findDelivery(String trackNumber) {
		for (Delivery delivery : deliveries.values()) {
            if (delivery.getTrackingNumber().equals(trackNumber)) {
                return delivery; 
            }
        }
		return null;
	}
	
	public static boolean getPackageStatus(String trackNumber) {
		return deliveries.get(trackNumber).isSigned();
	}
	
	
}

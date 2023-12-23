package application.model;

import application.tools.DeliveryPool;
import application.tools.Preference;

public class Recipient extends Person{
	private String address;
	private Preference preference;
	private DeliveryPool deliveryMap;
	
	
	
	public Recipient(String name, String phone, String email, String password) {
		super(name, phone, email, password);
	}


	public String getAddress() {
		return address;
	}


	public Preference getPreference() {
		return preference;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public void setPreference(Preference preference) {
		this.preference = preference;
	}
	
	public boolean queryDeliveryStatus(String trackingNumber) {
		return deliveryMap.getDeliveryMap().get(trackingNumber).isSigned();
	}


	
}

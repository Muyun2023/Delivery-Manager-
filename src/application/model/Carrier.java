package application.model;

import application.tools.DeliveryPool;

public class Carrier extends Person{
	private int rating;
	private DeliveryPool deliveryMap;

	
	public Carrier(String name, String phone, String email, String password) {
		super(name, phone, email, password);
	}
	
	public void scanDelivery(Delivery delivery) {
		deliveryMap.getDeliveryMap().put(delivery.getTrackingNumber(), delivery);
	}
	
	public void changeStatus(String trackingNumber, boolean signed) {
		if (deliveryMap.getDeliveryMap().containsKey(trackingNumber)) {
			deliveryMap.getDeliveryMap().get(trackingNumber).setSigned(signed);
        }
		else {
			System.out.println("Delivery with tracking number " + trackingNumber + " not found.");
		}
    }
	
	public void printCarrierInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Phone: " + getPhone());
        System.out.println("Rating: " + rating);
    }
	
	public void uploadDestinationImage() {
        System.out.println("Destination image uploaded successfully.");
    }

		
}



 
    
	





//+ tell receiver(): checkbox


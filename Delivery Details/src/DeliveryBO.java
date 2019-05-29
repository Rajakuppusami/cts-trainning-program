
public class DeliveryBO {
	public void displayAllDeliveryDetails(Delivery[] deliveryList){
		for (int i = 0; i < deliveryList.length; i++) {
			System.out.println("Delivery Details");
			System.out.println("Delivery -- "+(i+1));
			System.out.println(deliveryList[i]);
		}
		
	}
}

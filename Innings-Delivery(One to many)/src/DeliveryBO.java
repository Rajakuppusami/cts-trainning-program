class DeliveryBO
{
  
     public Delivery createDelivery(String data,Innings[] inningsList) {
      
           //fill your code
    	 String[] value= data.split(",");
    	 Delivery delivery = new Delivery();
    	 delivery.setDeliveryNumber(Long.parseLong(value[0]));
    	 delivery.setBatsman(value[1]);
    	 delivery.setBowler(value[2]);
    	 delivery.setRuns(Long.parseLong(value[3]));
    	 delivery.setInningsNumber(Long.parseLong(value[4]));
    	 for (int i = 0; i < inningsList.length; i++) {
			if(inningsList[i].getInningsNumber()==Long.parseLong(value[4])){
				delivery.setInnings(inningsList[i]);
			}
		}
    	 return delivery;
 
      }


 public Long findInningsNumber(Delivery [] deliveryList, long deliveryNumber)

  {
	 Long value = (long) 0d;
 //fill your code
	 for (int i = 0; i < deliveryList.length; i++) {
		if(deliveryList[i].getDeliveryNumber()==deliveryNumber){
			value= deliveryList[i].getInningsNumber();
		}
	}
	 return value;
 }
}

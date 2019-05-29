class InningsBO {
	 
   public  Innings createInnings(String data) {
	
    //fill your code
	   String[] value = data.split(",");
	   Innings innings = new Innings(Long.parseLong(value[0]), value[1]);
	   return innings;
    }

}

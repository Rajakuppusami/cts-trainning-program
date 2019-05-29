public class Demo
{
	public static void main(String args[])
	{
		TestCouponMachine t = new TestCouponMachine();
		Consumer c[] = new Consumer[5];
		for(int i=0;i<5;i++)
		{
			c[i] = new Consumer(t);
			c[i].start();
		}
		Producer p = new Producer(t);
		p.start();
	}
}

class Producer extends Thread {
	int count=0;
	
	TestCouponMachine t;
	
	Producer(TestCouponMachine t)
	{
		this.t = t;
	}
	public void run()
	{
		try
		{
		++count;
	
		t.createCoupon(count);
	   System.out.println("Coupon created:" + count);
		}catch(Exception e){}
	}

}

class Consumer extends Thread
{
	int count;
	
   TestCouponMachine t;
	
	Consumer(TestCouponMachine t)
	{
		this.t = t;
	}
	public void run()
	{
		try
		{
		count = t.consumeCoupon();
		System.out.println("Coupon consumed:" + count);
		}catch(Exception e){}
	}
}

class TestCouponMachine
{
	int couponId;
	boolean couponExists = false;
	 public synchronized void createCoupon(int coup) throws Exception
	 {
		 while(couponExists)
		 {
			 try
			 {
				 wait();
			 }catch(Exception e){e.printStackTrace();
			 
		 }
		couponExists = true;
		couponId=coup;
		notify();
		Thread.sleep(1000);
		 } }
		 
		 public synchronized int consumeCoupon() throws Exception
		 {
			 while(!couponExists)
			 {
				 try
				 {
					 wait();
				 }catch(Exception e){e.printStackTrace();
				 
			 }
			 }
			couponExists = false;
			notify();
			Thread.sleep(1000);
			return couponId;
		 }
		 }

		 
		 
		 
	 
	

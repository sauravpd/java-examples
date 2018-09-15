package synchronization;

class Companay
{
	private String name="ABC infotech";
	public void print()
	{
		synchronized(this) // synchronized block
		{
			System.out.println(Thread.currentThread().getName()+" print method called");
			try
			{
				System.out.println(Thread.currentThread().getName()+" : "+name);
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e.getMessage());
			}
		}
	}
}
/**
 * MyThread4
 * @author saurav
 *
 */
class MyThread3 extends Thread
{  
	Companay t;  
	MyThread3(Companay t){  
		this.t=t;  
	}  
	public void run(){  
		t.print();
	}  
}  

/**
 * MyThread4
 * @author saurav
 *
 */
class MyThread4 extends Thread
{  
	Companay t;  
	MyThread4(Companay t){  
		this.t=t;  
	}  
	public void run(){  
		t.print();  
	}  
}
public class synchronizationMethodExample2 
{
	public static void main(String[] args) 
	{
		Companay obj = new Companay(); 
		MyThread3 t1=new MyThread3(obj);  
		MyThread4 t2=new MyThread4(obj);  
		t1.start();  
		t2.start(); 
	}
}

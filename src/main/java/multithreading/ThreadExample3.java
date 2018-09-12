package multithreading;

public class ThreadExample3 extends Thread
{
	@Override
	public void run()
	{
		for (int i = 1; i <=5; i++) 
		{
			System.out.println(i);
			try
			{
			Thread.sleep(2000);
			}
			catch(Exception e){System.out.println(e.getMessage());}
		}
	}
	
	public static void main(String[] args) 
	{
		ThreadExample3 thread1=new ThreadExample3();
		ThreadExample3 thread2=new ThreadExample3();
		thread1.start();
		thread2.start();
	}
}

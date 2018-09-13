package multithreading;

public class ThreadExample4 extends Thread
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

	public static void main(String[] args) throws InterruptedException 
	{
		ThreadExample4 thread1=new ThreadExample4();
		ThreadExample4 thread2=new ThreadExample4();
		thread1.start();
		thread1.join();
		thread2.start();
	}
}

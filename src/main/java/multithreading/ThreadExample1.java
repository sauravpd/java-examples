package multithreading;

/**
 * Thread Example1
 * @author saurav
 *
 */
public class ThreadExample1 extends Thread
{
	@Override
	public void run()
	{
		System.out.println("Thread is runnig");
	}
	public static void main(String[] args) 
	{
		ThreadExample1 thread=new ThreadExample1();
		thread.start();
	}
}

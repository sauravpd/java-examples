package multithreading;

public class ThreadExample2 implements Runnable
{
	@Override
	public void run()
	{
		System.out.println("Thread is runnig");
	}

	public static void main(String[] args) 
	{
		Thread thread=new Thread(new ThreadExample2());
		thread.start();
	}
}

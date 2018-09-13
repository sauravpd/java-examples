package multithreading;

public class ThreadExample5 extends Thread
{
	@Override
	public void run()
	{
		System.out.println(Thread.currentThread().getName());// Thread 1
	}
	public static void main(String[] args) 
	{
		ThreadExample5 thread=new ThreadExample5();
		thread.setName("Thread 1");
		thread.start();
	}
}

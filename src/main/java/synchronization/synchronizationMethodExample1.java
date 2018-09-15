package synchronization;

/**
 *  
 * @author saurav
 *
 */
class Table
{  
	/**
	 * //synchronized method
	 * @param n
	 */
	synchronized void printTable(int n)
	{
		for(int i=1;i<=10;i++)
		{  
			System.out.println(n+" X "+i+" : "+n*i);  
			try
			{  
				Thread.sleep(400);  
			}
			catch(Exception e){System.out.println(e);}  
		}  

	}  
}  

/**
 * MyThread1
 * @author saurav
 *
 */
class MyThread1 extends Thread{  
	Table t;  
	MyThread1(Table t){  
		this.t=t;  
	}  
	public void run(){  
		t.printTable(2);  
	}  
}  

/**
 * MyThread2
 * @author saurav
 *
 */
class MyThread2 extends Thread{  
	Table t;  
	MyThread2(Table t){  
		this.t=t;  
	}  
	public void run(){  
		t.printTable(10);  
	}  
}

public class synchronizationMethodExample1
{
	public static void main(String[] args) 
	{
		Table obj = new Table(); 
		MyThread1 t1=new MyThread1(obj);  
		MyThread2 t2=new MyThread2(obj);  
		t1.start();  
		t2.start();  
	}
}

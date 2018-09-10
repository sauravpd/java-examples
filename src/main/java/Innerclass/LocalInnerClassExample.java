package Innerclass;

public class LocalInnerClassExample 
{
	private int a=10;

	private void print()
	{
		class LocalInnerClass
		{
			private void localmethod()
			{
				System.out.println("Value of a :"+a);
			}
		}
		LocalInnerClass obj=new LocalInnerClass();
		obj.localmethod();
	}

	public static void main(String[] args) 
	{
		LocalInnerClassExample obj=new LocalInnerClassExample();
		obj.print();
	}
}

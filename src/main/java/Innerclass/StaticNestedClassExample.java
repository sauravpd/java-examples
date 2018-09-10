package Innerclass;

public class StaticNestedClassExample 
{
	private static int a=10;
	static class staticNestedClass
	{
		private void print()
		{
			System.out.println("Value of a "+a);
		}
	}
	public static void main(String[] args) 
	{
		StaticNestedClassExample.staticNestedClass obj=new StaticNestedClassExample.staticNestedClass();
		obj.print();
	}
}

package Innerclass;

/**
 * MemberInnerClass Example
 * @author saurav
 *
 */
public class MemberInnerClassExample 
{
	private int a=10;
	class MemberInnerClass
	{
		private void print()
		{
			System.out.println("Value of a : "+a);
		}
	}
	public static void main(String[] args) 
	{
		MemberInnerClassExample outerObj=new MemberInnerClassExample();
		MemberInnerClass innerObj=outerObj.new MemberInnerClass();
		innerObj.print();
	}
}

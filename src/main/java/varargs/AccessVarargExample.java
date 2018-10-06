package varargs;

/**
 * AccessVarargExample
 * @author saurav
 *
 */
public class AccessVarargExample 
{
	public void printvalue(int index,int ... numbers)
	{
		/*
		 * Like an array, varargs uses index
		 */
		System.out.println(numbers[index]);
	}
	public static void main(String[] args) 
	{
		new AccessVarargExample().printvalue(1,4,5,6);
	}
}

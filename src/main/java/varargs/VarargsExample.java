package varargs;

/**
 * VarargsExample
 * @author saurav
 *
 */
public class VarargsExample 
{
	public void test1(int... nums) { }
	public void test2(int start, int... nums) { }

	// COMPILE ERROR
	/*
	 * variable argument type int of the method walk3 must be the last parameter
	 */
	public void test3(int... nums, int start) { }

	// COMPILE ERROR
	/*
	 * Must be once in parameter list
	 */
	public void test4(int... start, int... nums) { }
}

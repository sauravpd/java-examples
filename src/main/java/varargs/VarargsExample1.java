package varargs;

/**
 * VarargsExample1
 * @author saurav
 *
 */
public class VarargsExample1 
{
	public static void main(String... args) 
	{
		System.out.println(args.length);
		for (int i = 0; i < args.length; i++) {
			System.out.println(i + " - " + args[i]);
		}
	}
}

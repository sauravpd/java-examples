package varargs;

public class VarargsExample2 
{
	// Both can't be compiled together
	// compiler sees they have same signature
	static void print(int[] params){ 
		System.out.println("array");
	}
	static void print(int... params){ 
		System.out.println("varargs");
	}

	public static void main(String[] args) 
	{
		// calls only one with Vararg
		print(1, 2, 3);

		// can call any of above two
		print(new int[] {1, 2, 3});
	}
}

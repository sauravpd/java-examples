package Strings;

public class StringBuilderExample 
{
	public static void main(String[] args) {
		// delete (int start, int end)
		// startIndex is inclusive, endIndex is exclusive
		StringBuilder sb = new StringBuilder().append("123456789").delete(0,2);
		System.out.println(sb); // 3456789

		// replace(int start, int end, String newStr)
		// startIndex is inclusive, endIndex is exclusive
		sb.replace(1,3, "AB"); // 3AB789

		System.out.println(sb); // 3AB6789
	}
}

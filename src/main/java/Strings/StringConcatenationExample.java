package Strings;

public class StringConcatenationExample 
{
	public static void main(String[] args) 
	{
        // + concantenation
        String str = null;
        str += true;
        str += 5;
        str += " it ";
        str += null;
        System.out.println(str); // nulltrue5 it null

        // concantenation order: left to right
        String b = 10 + 5 + "years old";    // 15years old
        String c = true + "love";           // truelove
 
        // concat(String str)
        String a = "globe";
        a.concat(" time");      // doesn't change a, but create new object
        System.out.println(a);  // still 'globe'
     
    }
}

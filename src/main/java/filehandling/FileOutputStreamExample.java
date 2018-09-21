package filehandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOutputStreamExample 
{
	public static void main(String[] args) throws IOException 
	{
		FileOutputStream fos=new FileOutputStream(System.getProperty("user.dir")+"//src//main//java//filehandling//a.txt");
		System.out.println("Enter the string");
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		fos.write(input.getBytes());
		fos.flush();
		fos.close();
	}
}

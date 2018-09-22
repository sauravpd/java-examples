package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample
{
	public static void main(String[] args) 
	{
		try
		{
			String filepath=System.getProperty("user.dir")+"//src//main//java//filehandling//";
			FileWriter fw=new FileWriter(filepath+"//e.txt");
			fw.write("Java File handling example");
			fw.close();
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}
}

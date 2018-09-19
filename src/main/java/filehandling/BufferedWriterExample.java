package filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample 
{
	public static void main(String[] args) 
	{
		try
		{
			String filepath=System.getProperty("user.dir")+"//src//main//java//filehandling//";
			BufferedWriter bf=new BufferedWriter(new FileWriter(filepath+"//f.txt"));
			bf.write("Java File handling example");
			bf.close();
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}
}

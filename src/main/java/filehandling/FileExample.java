package filehandling;

import java.io.File;

public class FileExample 
{
	public static void main(String[] args) 
	{
		try
		{
			String filepath=System.getProperty("user.dir")+"//src//main//java//filehandling//test.txt";
			File file=new File(filepath);
			if(file.exists())
			{
				System.out.println("file exists");
			}
			else
			{
				file.createNewFile();
				System.out.println("File created");
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}

package filehandling;

import java.io.File;

public class FileExample1 
{
	public static void main(String[] args) 
	{
		try
		{
			String filepath=System.getProperty("user.dir")+"//src//main//java//filehandling//dir1";
			File file=new File(filepath);
			if(file.isDirectory())
			{
				System.out.println("director exists");
			}
			else
			{
				file.mkdir();
				System.out.println("Director created");
			}

		}
		catch(Exception e)
		{

		}
	}
}

package filehandling;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample 
{
	public static void main(String[] args) 
	{
		try
		{
			String filepath=System.getProperty("user.dir")+"//src//main//java//filehandling//";
			FileReader fr=new FileReader(filepath+"//e.txt");
			int i;
			while((i=fr.read())!=-1)
			{
				System.out.print((char)i);
			}
			fr.close();
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}
}

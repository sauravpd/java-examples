package filehandling;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamExample 
{
	public static void main(String[] args) 
	{
		try
		{
			BufferedInputStream bis=new BufferedInputStream(new FileInputStream(System.getProperty("user.dir")+"//src//main//java//filehandling//b.txt"));
			int i=0;
			while((i=bis.read())!=-1)
			{
				System.out.print((char)i);
			}
			bis.close();
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}
}

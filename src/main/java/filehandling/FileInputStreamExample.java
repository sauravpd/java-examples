package filehandling;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample 
{
	public static void main(String[] args) throws IOException 
	{
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"//src//main//java//filehandling//a.txt");
		int i=0;
		while((i=fis.read())!=-1)
		{
			System.out.print((char)i);
		}
		fis.close();
	}
}

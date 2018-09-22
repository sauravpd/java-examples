package filehandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SequenceInputStreamExample 
{
	public static void main(String[] args) 
	{
		try
		{
			String filepath=System.getProperty("user.dir")+"//src//main//java//filehandling//";
			FileInputStream fis1=new FileInputStream(filepath+"a.txt");
			FileInputStream fis2=new FileInputStream(filepath+"b.txt");
			SequenceInputStream sequenceInputStream=new SequenceInputStream(fis1, fis2);
			int i=0;
			while((i=sequenceInputStream.read())!=-1)
			{
				System.out.print((char)i);
			}
			sequenceInputStream.close();
			fis1.close();
			fis2.close();
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}
}

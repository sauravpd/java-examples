package filehandling;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * BufferedOutputStream Example
 * @author saurav
 *
 */
public class BufferedOutputStreamExample 
{
	public static void main(String[] args) 
	{
		try
		{
			BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(System.getProperty("user.dir")+"//src//main//java//filehandling//b.txt"));
			bos.write(new String("Welcome to java .... !!!!").getBytes());
			bos.flush();
			bos.close();
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}
}

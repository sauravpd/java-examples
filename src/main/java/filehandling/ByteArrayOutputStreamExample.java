package filehandling;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ByteArrayOutputStream Example
 * @author saurav
 *
 */
public class ByteArrayOutputStreamExample 
{
	public static void main(String[] args) 
	{
		try
		{
			String filepath=System.getProperty("user.dir")+"//src//main//java//filehandling//";
			FileOutputStream fos1=new FileOutputStream(filepath+"c.txt");
			FileOutputStream fos2=new FileOutputStream(filepath+"d.txt");
			ByteArrayOutputStream byteArrayOutputStream=new ByteArrayOutputStream();
			byteArrayOutputStream.write(new String("java file handling example").getBytes());
			byteArrayOutputStream.writeTo(fos1);
			byteArrayOutputStream.writeTo(fos2);
			byteArrayOutputStream.close();
			fos1.close();
			fos2.close();
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}
}

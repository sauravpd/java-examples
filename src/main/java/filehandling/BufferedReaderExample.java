package filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample 
{
	public static void main(String[] args) 
	{
		try
		{
			String filepath=System.getProperty("user.dir")+"//src//main//java//filehandling//";
			BufferedReader br=new BufferedReader(new FileReader(filepath+"//f.txt"));
			String str;
			while((str=br.readLine()) != null)
			{
				System.out.println(str);
			}
			br.close();
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}
}

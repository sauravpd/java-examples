package networking;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class UrlConnectionExample 
{
	public static void main(String[] args) 
	{
		try
		{
			URL url=new URL("http://localhost:8888/bank/register.jsp");
			URLConnection urlconn = url.openConnection();
			InputStream inputStream = urlconn.getInputStream();
			int c;
			while((c=inputStream.read())!=-1){
				System.out.print((char)c);
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}

package networking;

import java.net.URL;

public class UrlExample 
{
	public static void main(String[] args) 
	{
		try
		{
	        URL url = new URL(
	                "http://localhost:8888/bank/register.jsp");
	        System.out.println("Protocol = " + url.getProtocol());
	        System.out.println("Host name = " + url.getHost());
	        System.out.println("File = " + url.getFile());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}	
}

package networking;

import java.net.InetAddress;

public class InetAddressExample 
{
	public static void main(String[] args) 
	{
		try
		{
			InetAddress inetAddress = InetAddress.getByName("www.google.com");
			System.out.println("Host name = " + inetAddress.getHostName());
			System.out.println("IP address = " + inetAddress.getHostAddress());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}

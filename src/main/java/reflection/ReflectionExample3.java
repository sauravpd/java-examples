package reflection;

public class ReflectionExample3 
{
	public static void main(String[] args) 
	{
		Class cls=new Student().getClass();
		System.out.println(cls.getName());
	}
}

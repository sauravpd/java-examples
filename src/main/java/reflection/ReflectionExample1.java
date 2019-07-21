package reflection;

public class ReflectionExample1 
{
	public static void main(String[] args) throws ClassNotFoundException 
	{
		Class cls=Class.forName("reflection.ReflectionExample1");
		System.out.println(cls.getName());
	}
}
class Student
{
	public void display()
	{
		System.out.println("Student Details");
	}
	private void show()
	{
		System.out.println("privte method");
	}
}

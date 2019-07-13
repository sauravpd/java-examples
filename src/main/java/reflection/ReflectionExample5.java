package reflection;

public class ReflectionExample5 
{
	public static void main(String[] args) throws InstantiationException, IllegalAccessException 
	{
		Class cls=Student.class;
		Student studentObj=(Student) cls.newInstance();
		studentObj.display();		
	}
}

package reflection;

public class ReflectionExample4 
{
	public static void main(String[] args) 
	{
		Class studentCls=Student.class;
		System.out.println(studentCls.isInterface());
		System.out.println(studentCls.isArray());
		System.out.println(studentCls.isPrimitive());
		System.out.println(studentCls.isAnnotation());
	}
}

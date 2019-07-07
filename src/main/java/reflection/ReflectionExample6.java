package reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionExample6 
{
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException 
	{
		Class cls=Student.class;
		Student studentObj=(Student) cls.newInstance();
		Method method=cls.getDeclaredMethod("show",null);
		method.setAccessible(true);
		// calling private method
		method.invoke(studentObj, null);
	}
}

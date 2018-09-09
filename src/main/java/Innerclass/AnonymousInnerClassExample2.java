package Innerclass;

/**
 * Interface car
 * @author saurav
 *
 */
interface Car
{
	void speed();
}

/**
 * AnonymousInner Class Example
 * @author saurav
 *
 */
public class AnonymousInnerClassExample2 
{
	private static int speed=100;
	public static void main(String[] args) 
	{
		Car car=new Car() 
		{
			@Override
			public void speed() 
			{
				System.out.println("Car price "+speed);
			}
		};
		car.speed();
	}
}

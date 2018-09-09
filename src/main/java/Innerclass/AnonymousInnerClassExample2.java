package Innerclass;

interface Car
{
	void speed();
}

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

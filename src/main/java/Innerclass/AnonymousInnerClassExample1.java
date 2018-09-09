package Innerclass;

abstract class Shape
{  
	abstract void draw();  
}  
public class AnonymousInnerClassExample1
{
	public static void main(String[] args) 
	{
		Shape shape=new Shape() {
			@Override
			void draw() 
			{
				System.out.println("draw");
			}
		}; 
		shape.draw();
	}
}

package Innerclass;

/**
 * abstract shape class
 * @author saurav
 *
 */
abstract class Shape
{  
	abstract void draw();  
}
/**
 * AnonymousInner Class Example
 * @author saurav
 *
 */
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

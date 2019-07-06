package dataTypeConversion;

public class ObjecttoStringConversionExample 
{
	public static void main(String[] args) 
	{
		Employee e=new Employee();
		System.out.println(String.valueOf(e));
		System.out.println(e.toString());
		
	}
}
class Employee
{
	private int eid;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}
}

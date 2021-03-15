package java8.comparator;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class ComparatorExample1 {
	public static void main(String[] args) {
		Employee employee1 = new Employee(103, "Steve", 95000);
		Employee employee2 = new Employee(101, "John", 85000);
		Employee employee3 = new Employee(102, "Mike", 145000);
		Employee employee4 = new Employee(102, "Jack", 45000);

		Optional<Employee> maxSalary = Stream.of(employee1, employee2, employee3, employee4)
				.max(Comparator.comparing(o -> o.getSalary()));
		System.out.println(maxSalary.get());
	}
}

class Employee {
	private int empId;
	private String empName;
	private float salary;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public Employee(int empId, String empName, float salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + "]";
	}

}

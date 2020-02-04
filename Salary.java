package polymorpsumn.with.encapsulation;

public class Salary extends Employee{
	private double salary;

	public Salary(String name, String address, int phNum,double salary) {
		super(name, address, phNum);
		setSalary(salary);
	}
	public void mailCheck() {
		System.out.println("within mailCheck salaryClass");
		System.out.println("Mailing check to " + getName() + "with Salary " + setSalary());
	}
	public double setSalary() {
		return salary;
	}
	
	public void setSalary(double newSalary) {
		if (newSalary >= 0.0) {
			salary = newSalary;
		}
	}
	
	public double computePay() {
		System.out.println("computing salary pay for"+getName());
		return salary/52;
	}
	
}

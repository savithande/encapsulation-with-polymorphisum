package polymorpsumn.with.encapsulation;

public class MainClassOfEncPoly {
	public static void main(String[] args) {
		Employee emp = new Employee("Savitha", "Hassan", 900890);
		Salary salary = new Salary("Shadu", "Arsikere", 810522993,500000);
		
		Employee emp1 = new Salary("savitha", "Bangalore", 900890257,60000);
		
		emp.checkMail();
		salary.checkMail();
		System.out.println();
		emp1.checkMail();
	}

}

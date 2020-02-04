package polymorpsumn.with.encapsulation;

public class Employee {
	private String name;
	private String address;
	private int phNum;
	

	public Employee(String name,String address,int phNum) {
		System.out.println("this this the Employee class");
		this.address = address;
		this.name = name;
		this.phNum = phNum;
	}
	
	public void checkMail() {
		System.out.println("Mailing a check to " +this.name + " ");
	}
	
	public String toString() { 
		return name + " " + address + " " + phNum;
	}
	
	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}
	
	public int getphNum() {
		return phNum;
	}
}

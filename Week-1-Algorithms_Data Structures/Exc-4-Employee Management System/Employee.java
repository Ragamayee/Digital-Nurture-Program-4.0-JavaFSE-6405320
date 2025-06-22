public class Employee{
	int employeeId;
	String name;
	String position;
	int salary;
	
	Employee(int employeeId, String name, String position, int salary){
		this.employeeId= employeeId;
		this.name= name;
		this.position= position;
		this.salary= salary;
	}
	
	public String display() {
        return "Employee [ID=" + employeeId + ", Name=" + name + ", Position=" + position + ", Salary=" + salary + "]";
    }
}
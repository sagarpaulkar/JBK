
public class Employee {

	String empName;
	int salary;
	
	public Employee(String empName, int salary) {
		super();
		this.empName = empName;
		this.salary = salary;
	}
	
	public static Employee  maxSalary (Employee e1, Employee e2, Employee e3) {
		
		if(e1.salary > e2.salary && e1.salary > e3.salary)
			return e1;
		else if (e2.salary>e1.salary && e2.salary>e3.salary)
			return e2;
		else
			return e3;
		 	
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", salary=" + salary + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e= Employee.maxSalary(new Employee("Sagar",7000), new Employee("Dharmesh",4000), new Employee("Deepak",5000));
		String maxSalary= e.toString();
		System.out.println(maxSalary);
	}

}

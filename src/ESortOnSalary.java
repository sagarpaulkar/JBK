import java.util.Comparator;

public class ESortOnSalary implements Comparator<EmployeeS>{

	
	public int compare(EmployeeS o1, EmployeeS o2) {
		// TODO Auto-generated method stub
		int salary1= o1.salary;
		int salary2= o2.salary;
		
		return salary1-salary2;
	}

	
}

import java.util.Scanner;
import java.util.TreeSet;

public class ETest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("1.EmployeeName 2. EmployeeSalary");
		
		int choice = sc.nextInt();
		
		TreeSet<EmployeeS> set;
		
		if(choice ==1)
			
			set =new TreeSet(new ESortOnNames());
		else 
			set= new TreeSet(new ESortOnSalary());

	
		set.add(new EmployeeS(01,"Sagar",2000));
		set.add(new EmployeeS(02,"Deepak",1000));
		
		
		System.out.println(set);
	}
}

import java.util.Comparator;

public class ESortOnNames implements Comparator <EmployeeS>{

	@Override
	public int compare(EmployeeS o1, EmployeeS o2) {
		// TODO Auto-generated method stub
		String name1= o1.ename;
		String name2= o2.ename;
		
		return name1.compareTo(name2);
				
	}

}

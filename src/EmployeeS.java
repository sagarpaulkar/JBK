
public class EmployeeS {

	int eid;
	String ename;
	int salary;
	
	public EmployeeS(int eid, String ename, int salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeS [eid=" + eid + ", ename=" + ename + ", salary=" + salary + "]";
	}
	
}

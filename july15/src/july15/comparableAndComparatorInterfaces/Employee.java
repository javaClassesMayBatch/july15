package july15.comparableAndComparatorInterfaces;

public class Employee implements Comparable<Employee>{
	private int employeeId;
	private String employeeName;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public Employee(int employeeId, String employeeName) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}
	
	@Override
	public int compareTo(Employee emp) {
		/* e1.compareTo(e2)
		 * if e1  comes before e2 -> return -ve
		 * if e1 comes after e2 -> return +ve
		 * if e1 equals e2 -> 0
		 * */
		/*if(this.employeeId < emp.employeeId){
			return -1;
		}else if(this.employeeId > emp.employeeId){
			return 1;
		}
		return 0;*/
		return this.employeeId-emp.employeeId;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + "]";
	}
	
	
	
}

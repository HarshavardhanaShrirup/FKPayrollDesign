package training;

public interface UnionBase {
	public void addEmployee(EmployeeBase e);
	public void removeEmployee(EmployeeBase e);
	public void collectDues();
	public void addFees(double amount, EmployeeBase...bases);
}

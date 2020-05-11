package training;

import java.time.DayOfWeek;
import java.util.HashSet;
import java.util.Set;

public class Union implements UnionBase {
	
	private Set<EmployeeBase> members;
	private DayOfWeek payableAdditionDay = DayOfWeek.FRIDAY;
	public Union(){
		members = new HashSet<>();
		DB.getUnionList().add(this);
	}
	
	DayOfWeek getPayableAdditionDay() {
		return payableAdditionDay;
	}
	
	void setPayableAdditionDay(DayOfWeek day) {
		payableAdditionDay = day;
	}
	@Override
	public void addEmployee(EmployeeBase e) {
		members.add(e);
	}

	@Override
	public void removeEmployee(EmployeeBase e) {
		members.remove(e);
	}

	@Override
	public void collectDues() {
		Set<EmployeeBase> emplist = DB.getEmployeeSet();
		for(EmployeeBase e: emplist) {
			if(members.contains(e)) {
				e.setDeductible(e.getDeductible() + e.getWeeklyUnionRate());
			}
		}
	}

	@Override
	public String toString() {
		return "Union [members=" + members + "\n, payableAdditionDay=" + payableAdditionDay + "]";
	}

	@Override
	public void addFees(double amount, EmployeeBase...bases) {
		for(EmployeeBase e : bases) {
			if(members.contains(e)) {
				e.setDeductible(e.getDeductible() + e.getWeeklyUnionRate());
			}
		}
	}
	
	Boolean isMember(EmployeeBase e) {
		return members.contains(e);
	}
	

}

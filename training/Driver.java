package training;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Arrays;

public class Driver {
	private static LocalDate today;
	
	static void addEmployee(EmployeeBase e, UnionBase...bases) {
		DB.getEmployeeSet().add(e);
		for(UnionBase u : bases) {
			u.addEmployee(e);
		}
	}
	
	static void removeEmployee(EmployeeBase e, UnionBase...bases) {
		DB.getEmployeeSet().remove(e);
		ArrayList<Payable>  pList = DB.getPayableList();
		for(UnionBase u : bases) {
			u.removeEmployee(e);
		}
		pList.removeIf((p)->p.getEmployee().equals(e));
	}
	
	static void postTimeCard(EmployeeBase e, LocalDate currDate, int hours, HourlySalary hs) {
		hs.addPayable(currDate,hours, e);
	}
	
	static void postSalesReceipt(LocalDate currDate, int sales, EmployeeBase e, Commission c) {
		c.addPayable(currDate, sales, e);
	}
	
	static void postUnionFees(UnionBase ub, double amount) {
		ub.addFees(amount);
	}
	
	static void runPayrollOneDay() {
		ArrayList<Payable>  pList = DB.getPayableList() ;
		for(Payable pEntry : pList) {
			if(pEntry.getDate().equals(today)) {
				EmployeeBase emp = pEntry.getEmployee();
				double deductible = emp.getDeductible();
				double amount = emp.getAmount();
				double addAmount = pEntry.getAmountPayable();
				emp.setDeductible(Math.max(0.0, deductible - (amount + addAmount)));
				emp.setAmount(Math.max(0.0, (amount + addAmount) - deductible));
			}
		}
		pList.removeIf(p -> p.getDate().equals(today));
		today = today.plusDays(1);
	}
	
	
	
	
	public static void main(String[] args) {
		today= LocalDate.now().with(TemporalAdjusters.firstDayOfYear());
		new DB();
		// TODO Auto-generated method stub
		Commission comm = new Commission(today);
		UnionBase ub = new Union();
		MonthlySalary ms = new MonthlySalary();
		HourlySalary hs = new HourlySalary();
		//new DB();
		Employee[] emps = new Employee[11];
		for(int i = 0; i<=10; i++) {
			emps[i] = new Employee();
			emps[i].setId(i);
			if(i % 2 == 0) {
				addEmployee(emps[i], ub);
			}else {
				addEmployee(emps[i]);
			}
			if(i % 3 == 0) {
				emps[i].setHourlyDetails(new HourlyDetails());
			}else {
				emps[i].setMonthlyDetails(new MonthlyDetails().setMonthlyRate(2.0));
			}
		}
		
		for(int i = 0; i<=10; i++) {
			System.out.println(emps[i]);
		}
		System.out.println(ub);
		System.out.println(DB.getEmployeeSet());
		System.out.println(DB.getPayableList());
		System.out.println(DB.getUnionList());		
		postTimeCard(emps[9], LocalDate.now(), 12, hs);
		System.out.println(Arrays.deepToString(DB.getPayableList().toArray()));
		postSalesReceipt(today,23, emps[8], comm);
		System.out.println(DB.getPayableList());
		
		runPayrollOneDay();
		runPayrollOneDay();
		runPayrollOneDay();
		System.out.println(today);
		System.out.println(DB.getPayableList());
		System.out.println(emps[8]);
		
	}

}

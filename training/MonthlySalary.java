package training;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class MonthlySalary implements MonthlySalaryBase{
	
	private TemporalAdjuster dayOfPaymentTA = TemporalAdjusters.lastDayOfMonth();
	public MonthlySalary() {}
	
	public void addPayable(LocalDate currDate, EmployeeBase emp) {
		LocalDate dayOfPayment = currDate.with(dayOfPaymentTA);
		double amt = emp.getMonthlyDetails().getMonthlyRate();
		
		DB.getPayableList().add(new Payable(emp, amt, dayOfPayment));
		
		//Add to database
		
	}
	
	
}

package training;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class Commission implements CommisionBase {
	private LocalDate startDate;
	public Commission(LocalDate startDate) {
		this.startDate = startDate.with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY));
	}
	
	public void addPayable(LocalDate curr, int sales, EmployeeBase emp) {
		double commissionRate = emp.getCommissionRate();
		while(Period.between(startDate, curr).getDays()% 2 != 0 || curr.getDayOfWeek() != DayOfWeek.FRIDAY)curr = curr.plusDays(1);
		if(Period.between(startDate,curr).isNegative())startDate.plusDays(14); 
		double amt = sales*commissionRate;
		//System.out.println(Period.between(startDate, curr).getDays());
		LocalDate dayOfPayment = curr;
		DB.getPayableList().add(new Payable(emp, amt, dayOfPayment));
		//add to database
	}
}

package training;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class HourlySalary implements HourlySalaryBase{
	private int basicHours = 8;
	private double extraRate = 1.5;
	private TemporalAdjuster dayOfPaymentTA = TemporalAdjusters.next(DayOfWeek.FRIDAY);
	
	public HourlySalary() {}
	public HourlySalary(int basicHours, double extraRate) {
		this.basicHours = basicHours;
		this.extraRate = extraRate;
	}
	
	public void addPayable(LocalDate currDate, int hours, EmployeeBase emp) {
		double hourlyRate = emp.getHourlyDetails().getHourlyRate();
		double amt = hourlyRate*(Math.min(basicHours,hours) + Math.max(0, hours-basicHours)*extraRate);
		LocalDate dayOfPayment = currDate.with(dayOfPaymentTA);
		DB.getPayableList().add(new Payable(emp, amt, dayOfPayment));
		//add to payable database
	}
	
}




























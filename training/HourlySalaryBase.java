package training;

import java.time.LocalDate;

public interface HourlySalaryBase {
	public void addPayable(LocalDate currDate, int hours, EmployeeBase emp);
}

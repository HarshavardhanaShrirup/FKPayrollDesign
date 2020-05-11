package training;

import java.time.LocalDate;

public interface MonthlySalaryBase {
	public void addPayable(LocalDate currDate, EmployeeBase emp);
}

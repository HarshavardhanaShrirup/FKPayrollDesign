package training;

import java.time.LocalDate;

public interface CommisionBase {
	public void addPayable(LocalDate currDate, int salary, EmployeeBase emp);
}

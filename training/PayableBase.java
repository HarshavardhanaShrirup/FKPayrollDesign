package training;

import java.time.LocalDate;

public interface PayableBase {
	EmployeeBase getEmployee();

	LocalDate getDate();

	double getAmountPayable();
}

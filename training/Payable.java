package training;

import java.time.LocalDate;

public class Payable implements PayableBase {
	private EmployeeBase e;
	private LocalDate lDate;
	private double amount;
	
	public Payable(EmployeeBase e, double amount, LocalDate lDate) {
		this.e = e;
		this.amount = amount;
		this.lDate = lDate;
	}
	@Override
	public String toString() {
		return "Payable [e=" + e + ", lDate=" + lDate + ", amount=" + amount + "]";
	}
	@Override
	public EmployeeBase getEmployee() {
		return e;
	}


	@Override
	public LocalDate getDate() {
		return lDate;
	}



	@Override
	public double getAmountPayable() {
		return amount;
	}



}

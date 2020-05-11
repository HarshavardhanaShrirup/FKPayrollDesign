package training;

public interface EmployeeBase {
	int getId();
	void setId(int newId);
	
	double getAmount();
	void setAmount(double amount);
	
	PaymentMethod getPaymentMethod();
	void setPaymentMethod(PaymentMethod paymentMethod);
	
	double getCommissionRate();
	void setCommissionRate(double commissionRate);
	
	double getWeeklyUnionRate();
	void setWeeklyUnionRate(double weeklyUnionRate);
	
	void setDeductible(double amt);
	double getDeductible();
	
	MonthlyDetailsBase getMonthlyDetails();
	void setMonthlyDetails(MonthlyDetailsBase monthlyDetails);
	
	HourlyDetailsBase getHourlyDetails();
	void setHourlyDetails(HourlyDetailsBase hourlyDetails);
	
	
	
}

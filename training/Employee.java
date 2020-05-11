package training;

public class Employee implements EmployeeBase{
	private int id = 0;
	private double amount;
	private PaymentMethod paymentMethod = PaymentMethod.PICK_UP;
	private double commissionRate = 1.0;
	private double weeklyUnionRate = 50.0;
	private double deductible = 0.0;
	private MonthlyDetailsBase monthlyDetails = null;
	private HourlyDetailsBase hourlyDetails = null;
	@Override
	public double getAmount() {
		// TODO Auto-generated method stub
		return amount;
	}

	@Override
	public void setAmount(double amount) {
		// TODO Auto-generated method stub
		this.amount = amount;
		
	}

	@Override
	public PaymentMethod getPaymentMethod() {
		// TODO Auto-generated method stub
		return paymentMethod;
	}

	@Override
	public void setPaymentMethod(PaymentMethod paymentMethod) {
		// TODO Auto-generated method stub
		this.paymentMethod = paymentMethod;
	}

	@Override
	public double getCommissionRate() {
		// TODO Auto-generated method stub
		return commissionRate;
	}

	@Override
	public void setCommissionRate(double commissionRate) {
		// TODO Auto-generated method stub
		this.commissionRate = commissionRate;
	}

	@Override
	public double getWeeklyUnionRate() {
		// TODO Auto-generated method stub
		return weeklyUnionRate;
	}

	@Override
	public void setWeeklyUnionRate(double weeklyUnionRate) {
		// TODO Auto-generated method stub
		this.weeklyUnionRate = weeklyUnionRate;
	}

	@Override
	public void setDeductible(double amt) {
		// TODO Auto-generated method stub
		deductible = amt;
	}

	@Override
	public double getDeductible() {
		// TODO Auto-generated method stub
		return deductible;
	}

	@Override
	public MonthlyDetailsBase getMonthlyDetails() {
		// TODO Auto-generated method stub
		return monthlyDetails;
	}

	@Override
	public void setMonthlyDetails(MonthlyDetailsBase monthlyDetails) {
		// TODO Auto-generated method stub
		this.monthlyDetails = monthlyDetails;
	}

	@Override
	public HourlyDetailsBase getHourlyDetails() {
		// TODO Auto-generated method stub
		return hourlyDetails;
	}

	@Override
	public String toString() {
		String str =  "Employee [id=" + id + ", amount=" + amount + ", paymentMethod=" + paymentMethod + ", commissionRate="
				+ commissionRate + ", weeklyUnionRate=" + weeklyUnionRate + ", deductible=" + deductible;
		if(hourlyDetails != null) {
			str += ", hourlyRate=" + hourlyDetails.getHourlyRate();
		}
		if(monthlyDetails != null) {
			str += ", monthlyRate=" + monthlyDetails.getMonthlyRate();
		}
		str += "]";
		return str;
	}

	@Override
	public void setHourlyDetails(HourlyDetailsBase hourlyDetails) {
		// TODO Auto-generated method stub
		this.hourlyDetails = hourlyDetails;
	}

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public void setId(int newId) {
		// TODO Auto-generated method stub
		id = newId;
	}
	
	
}

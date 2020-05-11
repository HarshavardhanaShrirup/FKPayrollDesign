package training;

public class MonthlyDetails implements MonthlyDetailsBase {
	private double monthlyRate = 100.0;
	@Override
	public double getMonthlyRate() {
		// TODO Auto-generated method stub
		return monthlyRate;
	}
	
	public MonthlyDetailsBase setMonthlyRate(double monthlyRate) {
		this.monthlyRate = monthlyRate;
		return this;
	}

}

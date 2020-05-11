package training;

public class HourlyDetails implements HourlyDetailsBase {
	private double hourlyRate = 1.0;
	@Override
	public double getHourlyRate() {
		// TODO Auto-generated method stub
		return hourlyRate;
	}
	
	public HourlyDetailsBase setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
		return this;
	}

}

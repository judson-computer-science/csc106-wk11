public class HourlyEmployee extends Employee {

	private double hourlyRate;

	public HourlyEmployee(String name, String ssn, double hourlyRate) {
		super(name, ssn);
		this.hourlyRate = hourlyRate;
	}

	public double getEarnings(int hours) {
		return hourlyRate * hours;
	}
}

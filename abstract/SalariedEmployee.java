public class SalariedEmployee extends Employee {

	private static final int PAY_PERIODS_PER_YEAR = 26;
	private static final int DAYS_PER_PAY_PERIOD = 10;

	private double biWeeklyRate;
	private String position;

	public SalariedEmployee(String name, String ssn, String position, int salary) {
		super(name, ssn);
		this.position = position;
		this.biWeeklyRate = salary / PAY_PERIODS_PER_YEAR;
	}

	public double getEarnings(int days) {

		int numberOfChecks = days / DAYS_PER_PAY_PERIOD;

		if(days % DAYS_PER_PAY_PERIOD > 0) numberOfChecks++;

		return numberOfChecks * biWeeklyRate;
	}
}

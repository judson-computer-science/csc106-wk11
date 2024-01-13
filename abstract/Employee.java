public abstract class Employee {

	private String name;
	private String ssn;

	public Employee(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}

	public String getName() { return name; }
	public String getSSN() { return ssn; }

	// no implementation, declared abstract
	public abstract double getEarnings(int time);

}

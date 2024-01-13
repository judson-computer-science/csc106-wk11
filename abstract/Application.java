import java.util.*;

public class Application {

	public static void main(String[] args) {

		List<Employee> staff = new ArrayList<>();

		HourlyEmployee jeff = new HourlyEmployee("Jeff", "111-22-3333", 15.00);
		HourlyEmployee mike = new HourlyEmployee("Mike", "111-22-4444", 17.50);

		SalariedEmployee linda = new SalariedEmployee("Linda", "222-33-4444", "Manager", 95000);
		SalariedEmployee lisa = new SalariedEmployee("Lisa", "222-33-5555", "Engineer", 100000);

		staff.add(jeff);
		staff.add(mike);
		staff.add(linda);
		staff.add(lisa);

		for(Employee employee : staff) {

			double earnings;

			if(employee instanceof HourlyEmployee) {
				earnings = employee.getEarnings(Integer.parseInt(args[0]) * 8);
			} else {
				earnings = employee.getEarnings(Integer.parseInt(args[0]));
			}

			StringBuilder builder = new StringBuilder(employee.getName());
			builder.append(" (" + employee.getSSN() + ")");
			builder.append(" earned " + earnings);

			System.out.println(builder.toString());
		}
	}
}

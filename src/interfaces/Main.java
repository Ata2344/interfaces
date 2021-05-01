package interfaces;

public class Main {

	public static void main(String[] args) {
		// CustomerManager[] customerManagers = {}
		Logger[] loggers = { new SmsLogger(), new FileLogger(), new DatabaseLogger() };

		CustomerManager customerManager = new CustomerManager(loggers);

		Customer customer = new Customer(1, "Ahmet ", "Turan");

		customerManager.add(customer);

	}

}

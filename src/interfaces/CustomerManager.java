package interfaces;

public class CustomerManager {

	private Logger[] loggers;

	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;

	}

	// loosly - tightly coupled
	public void add(Customer customer) {
		System.out.println("M??teri eklendi " + customer.getFirstName()+ " "+customer.getLastName());
		Utils.runLoggers(loggers, customer.getFirstName());

	}

	public void delete(Customer customer) {
		System.out.println("M??teri silindi "+ customer.getFirstName()+ " "+customer.getLastName());
		Utils.runLoggers(loggers, "Id : "+customer.getId() +" " +customer.getFirstName());
	}

}

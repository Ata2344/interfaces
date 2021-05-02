package interfaces;

public class Main {

	public static void main(String[] args) {
		
		Logger[] addLoggers = { new SmsLogger() , new FileLogger() };
		Logger[] deleteLoggers = { new DatabaseLogger() , new EmailLogger() };
		

		CustomerManager customerManager = new CustomerManager(addLoggers);
		Customer customer = new Customer(1, "Ahmet ", "Turan");
		customerManager.add(customer);
		
		System.out.println("------------------------\n------------------------");
		
		CustomerManager customerManager_delete = new CustomerManager(deleteLoggers);
		Customer customer_delete = new Customer(1, "Engin ", "Altan");
		customerManager_delete.delete(customer_delete);
		
		
		

	}

}

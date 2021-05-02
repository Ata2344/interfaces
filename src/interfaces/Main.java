package interfaces;

public class Main {

	public static void main(String[] args) {
		
		Logger[] addLoggers = { new SmsLogger() , new FileLogger() };
		Logger[] deleteLoggers = { new DatabaseLogger() , new EmailLogger() };
		

		CustomerManager customerManager = new CustomerManager(addLoggers);
		Customer customer1 = new Customer(1, "Ahmet", "Turan");
		Customer customer2 = new Customer(2, "Engin", "Altan");
		Customer customer3 = new Customer(3, "Mahmut", "Tuncer");
		Customer[] customers = {customer1,customer2,customer3};
		for (Customer customer : customers) {
			customerManager.add(customer);
			System.out.println("");
		}
		

		
		System.out.println("------------------------\n------------------------");
		
		CustomerManager customerManager_delete = new CustomerManager(deleteLoggers);
		customerManager_delete.delete(customer1);
		
		
		

	}

}

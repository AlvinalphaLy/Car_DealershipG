package car_dealership;

public class Employee extends Customer{
	
	public void  handleCustomer(Customer cust, boolean finance, Vehicle vehicle) {
		
		if (finance == true) {
			double loanAmount = vehicle.getPrice() -cust.getCashOnHand();
			runCreditHistory(cust, loanAmount);
		} else if(vehicle.getPrice() <= cust.getCashOnHand()) {
			// customer pays in cash
			processTransaction(cust, vehicle);
		} else {
			System.out.println("Customer will need more money to purchase: "
					+ vehicle);
		}
}

	public void runCreditHistory(Customer custom, double loanAmountget) {
		System.out.println("Ran credit history for Customer...");
		System.out.println("Customer has been approved purchase the vehicle: ");
		
	}
	
	public void processTransaction(Customer custi, Vehicle vehico) {
		System.out.println("Customer has purchased the vehicle: " 
					+ vehico + " for the price "+ vehico.getPrice());
	}
}

		
	

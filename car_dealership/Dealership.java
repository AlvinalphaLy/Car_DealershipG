package car_dealership;

public class Dealership {

	public static void main(String[] args) {
		
		Customer cust1 = new Customer();
		cust1.setName("Tom");
		cust1.setAddress ("123 Anything St. ");
		cust1.setCashOnHand(25000);
		
		Vehicle vehicle = new Vehicle("Lexus","IS350", 15000);
// We can use "generate Constructor using Field " apply to Customer
		Employee emp = new Employee();
		
		cust1.purchaseCar(vehicle, emp, false);
		
	
		
		/**
		 * 
		 * In emp class: handleCustomer (Customer cust, boolean finance, Vehicle vehicle)
		 * 	if (finance == true)
		 *    runCreditHistory(Customer cust,double doubleAmount)
		 *  else if(vehicle.getPrice() <= cust.cashOnHand()):
		 *  	 processTransaction(Customer cust, Vehicle vehicle)
		 *  else:
		 *  	 tell customer to bring more money
		 * note getCashonHand to abstract
		 */
		
		/**
		 * Vehicle
		 * The make, color, price. Create the getter, setter methods
		 * 
		 */
	}

}

package inheritance;

public class CustomerTest1 {

	public static void main(String[] args) {
		Customer customerLee=new Customer(10010,"¿Ãº¯Ω≈");
		customerLee.bonusPoint=1000;
		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer customerKim=new VIPCustomer(10020,"±Ë¿ØΩ≈",12345);
		customerKim.setCustomerID(10020);
		customerKim.setCustomerName("±Ë¿ØªÍ");
		customerKim.bonusPoint=10000;
		System.out.println(customerKim.showCustomerInfo());
		
		
		
		
		
	}

}

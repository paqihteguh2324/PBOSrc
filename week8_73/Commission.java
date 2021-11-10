package week8_73;

//It extends the Hourly class
public class Commission extends Hourly {
	//It has two instance variables (in addition to those inherited): one is the total sales the employee 
	//has made (type double)
	//and the second is the commission rate for the employee (

	private double total_sales;
	private double commission_rate;

//The constructor takes 6 parameters: the first 5 are the same as for Hourly (name, address, phone 
//number, social security
//number, hourly pay rate) and the 6th is the commission rate for the employee. The constructor 
//should call the constructor
//of the parent class with the first 5 parameters then use the 6th to set the commission rate.
	
	public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commission) {
		 super(eName, eAddress, ePhone, socSecNumber, rate);
		 commission_rate = commission;
	}

//	One additional method is needed: public void addSales (double totalSales) that adds the parameter 
//	to the instance
//	variable representing total sales.

	public void addSales(double sale) {
		total_sales = sale;
	}
	
//	The pay method must call the pay method of the parent class to compute the pay for hours worked 
//	then add to that the
//	pay from commission on sales. (See the pay method in the Executive class.) The total sales should 
//	be set back to 0 (note:
//	you don't need to set the hoursWorked back to 0—why not?).

	public double pay() {
		double payment = super.pay() + (super.pay() * commission_rate);
		return payment;
	}
	
//	The toString method needs to call the toString method of the parent class then add the total sales 
//	to that.

	public String toString() {
		String result = super.toString();
		result += "\nTotal Sale: " + total_sales;
		return result;
	}
	
}

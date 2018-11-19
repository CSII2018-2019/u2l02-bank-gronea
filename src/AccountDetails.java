import java.text.NumberFormat;

public class AccountDetails {
//It should contain the following methods:
//Write a UML Diagram and the implementation code for a BankAccount class. 
	//The class should contain the following fields/Attributes:
		//Account Holder’s Name
		//Current Balance
		//Lowest balance allowable (example: the account holder would like to be notified when the balance goes below
		//$100)
	
	private String Name;
	private String Balance;
	private double balance;
	private String Lowest;
	private double limit;
	
//Constructor
	//1 - takes all three fields as arguments
	//2 - takes first two fields as arguments and defaults lowest balance to $100
	public AccountDetails(String n, double b, double l) {
		setName(n);
		setBalance(b);
		setLowest(l, b);
	}
	
	public AccountDetails(String n, double b) {
		setName(n);
		setBalance(b);
		setLowest(100.00, b);
	}
//All setters and getters with appropriate restrictions

//Methods for deposit and withdrawal:
	//When withdrawing, the method should check if it will go below the allowable balance and ask “are you sure?”
//toString method that returns a string: “Michele Lombardi’s account holds $535.98 with a lowest balance allowable
//of $100”
//Code for Money:
	//double money = 100.1;
	//NumberFormat formatter = NumberFormat.getCurrencyInstance();
	//String moneyString = formatter.format(money);
	//System.out.println(moneyString);
	//the bolded code will convert a double into a string formatted $##.##. From that point you can do anything you’d 
	//normally do with a string.

	
	private void setName(String n) {
		Name = n;
	}
	
	public String getName () {
		return Name;
	}
	
	private void setBalance(double b) {
		//The setter for balance should be private (they will be using deposit and withdrawal)
		double money = b;
		balance = b;
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		String moneyString = formatter.format(money);
		System.out.println(moneyString);
		
	}
	
	public String getBalance() {
		return Balance;
	}
	
	private void setLowest(double l, double b) {
		//The setter for lowest balance allowable should ensure the value is positive
		if (l >= 0) {
			double lowest = l;
			limit = lowest;
			NumberFormat formatter = NumberFormat.getCurrencyInstance();
			String lowestString = formatter.format(lowest);
			System.out.println(lowestString);
			Lowest = lowestString;
		}else {
			System.out.println("You cannot have a negative restriction at this bank. Defaulting to $100.00.");
			double lowest = 100.00;
			limit  = lowest;
			NumberFormat formatter = NumberFormat.getCurrencyInstance();
			String lowestString = formatter.format(lowest);
			System.out.println(lowestString);
		}
		
	}
	
	public String getLowest() {
		return Lowest;
	}
	
	//toString
	public String toString() {
		return "In the account of " + getName() + ". You have " + getBalance() + " with the restriction of lowest balance being " + ". "
				+ "\n Meaning that you can withdraw up to " + (balance - limit) + " before over withdrawing.";
	}
	
	
}

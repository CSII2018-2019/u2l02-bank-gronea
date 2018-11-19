import javax.swing.JOptionPane;

public class U2L02BankAccount {

	public static void main(String[] args) {
		
//		Write a UML Diagram and the implementation code for a BankAccount class. 
//		The class should contain the following fields:
//		Account Holder’s Name
//		Current Balance
//		Lowest balance allowable (example: the account holder would like to be notified when the balance goes below
//		$100)
		String name = JOptionPane.showInputDialog("Please enter your first name: ");
		System.out.println("Name: " + name);
		String amount = JOptionPane.showInputDialog("Please enter your current amount: ");
		int balance = Integer.parseInt(amount);
		System.out.println("Amount: " + balance);
		String min = JOptionPane.showInputDialog("Please enter the limit on your account: ");
		int limit = Integer.parseInt(min);
		System.out.println("Limit: " + limit);
		AccountDetails sample = new AccountDetails(name, balance, limit);
		
		System.out.println("Test 1: " + sample);
		
		AccountDetails sample2 = new AccountDetails(name, balance);
		
		System.out.println("Test 2: " + sample2);
	}

}

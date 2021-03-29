package Exercise2;

public class CreditCard {
	String accNum = "5162171234567890";
	String accHol = "Maimunah binti Salman";
	int balAmount = 1500;
	
	void printwithdrawMoney() { //method@behaviour in CreditCard
		System.out.println("Enter your pin number");
	}
	
	void printdepositMoney() {
		System.out.println("You've successfully deposit your money");
	}
	
	void printshowBal() {
		int amount = 1000;
		System.out.println("Your balance in your account is" + " " + amount);
	}
}

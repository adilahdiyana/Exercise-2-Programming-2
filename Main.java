package Exercise2;

public class Main {

	public static void main(String[] args) {
		
		MobilePhone a = new MobilePhone(); //create new object as a
		System.out.println(a.storage);
		System.out.println(a.color);
		System.out.println(a.weight);
		System.out.println(a.size);
		System.out.println(a.battery);
		a.printdialNum();
		a.printstartCall();
		a.printendCall();
		a.printtakePic();
		
		CreditCard b = new CreditCard(); // create second object as b
		System.out.println(b.accNum);
		System.out.println(b.accHol);
		System.out.println(b.balAmount);
		b.printwithdrawMoney();
		b.printdepositMoney();
		b.printshowBal();
	}

}

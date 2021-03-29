package Exercise2;

public class MobilePhone {
	int storage = 64;
	String color = "blue";
	double weight = 5.78;
	double size = 4.71;
	int battery = 2815;
	
	void printdialNum() { //method@behaviour in MobilePhone
		System.out.println("Please dial you number");
	}	
	
	void printstartCall() {
		System.out.println("When did you start call with him?");
	}
	
	void printendCall() {
		System.out.println("Why are you end call with me?");
	}
 
	void printtakePic() {
		System.out.println("Can you take some picture of me?");
	}
}

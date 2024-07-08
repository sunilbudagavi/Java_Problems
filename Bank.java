public class Bank {
	static int CurrentBalance = 35000;
//	Method 1 has created
	public static void greet_customer() {
		System.out.println("Welcome to the State Bank of India");
	}
//	method 2 for depositing money
	public void Deposit(int amount) {
		CurrentBalance = CurrentBalance + amount;
//		System.out.println("Succesfully Deposited into your account, Thank You");
	}
	
//	method 3 creating for the Withdral
	
	public static void Withdrwal(int amount) {
		CurrentBalance = CurrentBalance - amount;
		System.out.println("Sucessfully Withdrwal");
	}
	
	public int getCurrentBalance() {
		return CurrentBalance;		
	}
//	Calling Methods
	public static void main(String[] args) {
		Bank bank = new Bank();
		greet_customer();
		System.out.println("Your current Balance is " + CurrentBalance);
//		accessing the object
		bank.Deposit(10000);
		System.out.println("Your Current Balance is " + CurrentBalance + " After Depositing");
		bank.getCurrentBalance();
//		System.out.println("Your current Amount is " + CurrentBalance + );
		Withdrwal(5000);
		System.out.println("Remaining balance is " + CurrentBalance + " After withdrwaling the amount");
		
	}
	

}

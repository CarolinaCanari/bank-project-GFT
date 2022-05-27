
public class Main {
		
	public static void main(String[] args) {
		
		Client Ana = new Client();
		Ana.setName("Ana");
			
		Account ChekingAccount = new CheckingAccount(Ana);		
		
		ChekingAccount.deposit(200);
		CheckingAccount.profitability(100);
		
		ChekingAccount.printExtract();
		
		
	}

}



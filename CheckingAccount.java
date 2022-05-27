
public class CheckingAccount extends Account {
	

	public CheckingAccount(Client client) {
		super(client);
	}
	
	@Override 
	public void printExtract() {
		System.out.println("Your Saving Account Extract");
		super.printInfos();
	}

	public static void profitability(int i) {
		// TODO Auto-generated method stub
		
	}
	
	
}




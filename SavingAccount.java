
public class SavingAccount extends Account {
	
	public SavingAccount(Client client) {
		super(client);
	}
	
	@Override 
	public void printExtract() {
		System.out.println("Your Saving Account Extract");
		super.printInfos();
	}
	

}




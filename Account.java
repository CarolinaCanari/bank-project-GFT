
public abstract class Account implements IAccount {
	
	private static final int NORMAL_AGENCY = 1;
	private static int SEQUENCY = 1;
	
	protected int agency;
	protected int number;
	protected double balance;
	protected Client client;
	
	public Account(Client client) {
		this.agency = Account.NORMAL_AGENCY;
		this.number = SEQUENCY++;
		this.client = client;
	}
	
	@Override
	public void withdrawal(double value) {
		balance -= value;
	}
	
	@Override
	public void deposit(double value) {
		balance += value;
	}
	
	@Override
	public void transfer(double value, IAccount destinyAccount) {
		this.withdrawal(value);
		destinyAccount.deposit(value);
		
	}
	
	@Override
	public void profitability(double value, IAccount IvestingAccount) {
		@SuppressWarnings("unused")
		double profitability = value * 0.01256;

	}
	
	private Object agency() {
		return agency;
	}

	private Object number() {
		return number;
	}

	private Object balance() {
		return balance;
	}

	
	protected void printInfos() {
		System.out.println(String.format("Name: %s", this.client.getName()));
		System.out.println(String.format("Agency: %d", this.agency()));
		System.out.println(String.format("Number: %d", this.number()));
		System.out.println(String.format("Balnce: %d", this.balance()));
		
	}
	
	


}



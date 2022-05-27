
import java.util.List;

public class bank {
	
	private String name;
	private List<Account> Account;
	
	public String getName() {
		return name;
		
	}
	
	public void setName(String name) {
		this.name = name;
	
	}
	
	public List<Account> getAccounts() {
		return Account;
	}
	
	public void setAccounts(List<Account> account) {
		this.Account = account;
	}

}


public interface IAccount {
	
		void withdrawal (double value);
		
		void deposit (double value);
		
		void transfer (double value, IAccount destinyAccount);
		
		void printExtract();
		
		void profitability(double value, IAccount IvestingAccount);
		
	}
	


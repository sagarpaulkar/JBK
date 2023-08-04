
public class Account {
	
	int accountNo, balance;
	static String bankName="SBI";
	
	public Account(int acNo, int bal, String bName) {
		
		accountNo =acNo;
		balance= bal; 
		bankName=bName;
		
	}
	
	void deposit(int amount ) {
		balance = balance+amount; 
		System.out.println(balance);
	}

	void withdraw (int amount ) {
		balance = balance-amount; 
		System.out.println(balance);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account ac1= new Account (1,1000,"SBI");
		Account ac2=new Account(2,2000,"SBI");
		System.out.println(Account.bankName);
		ac1.bankName="RBI";
		System.out.println(ac2.bankName);
		ac1.deposit(5000);
		ac1.withdraw(5000);
	}

}

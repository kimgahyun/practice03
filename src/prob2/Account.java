package prob2;

public class Account {
	String accountNo;
	int balance;
	
	public Account( String str )
	{
		this.accountNo = str;
		System.out.println(str + "계좌가 개설되었습니다.");
	}
	public void save(int a)
	{
		this.balance += a;
		System.out.println( accountNo + "계좌에 " + balance +"만원이 입금되었습니다.");
	}
	
	public void deposit(int a)
	{
		this.balance -= a;
		System.out.println( accountNo + "계좌에 " + a +"만원이 출금되었습니다.");
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}

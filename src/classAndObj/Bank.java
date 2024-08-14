package classAndObj;

class BankAccount {
	
	int accountNum = 0;
	float accountBalance = 0;
	
	public BankAccount() {
	}
	public BankAccount(int accountNumber , float balance) {
		accountNum = accountNumber;
		accountBalance = balance;
	}
	void setAccountNumber(int num) {
		accountNum = num;
	}
	void withdraw(float amount) {
		accountBalance = accountBalance - amount;
	}
	void deposit(float amount) {
		accountBalance = accountBalance + amount;
	}
	void status() {
		System.out.println("Account num: "+ accountNum);
		System.out.println("Account  bal" + accountBalance);
	}
}

public class Bank {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount acc1 = new BankAccount();
		acc1.setAccountNumber(456);
		acc1.deposit(10000);
		acc1.status();
		BankAccount acc2=new BankAccount();
		acc2.withdraw(50000);
		acc2.status();

	}

}

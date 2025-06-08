package objectOrientedProgramming;

public class BankAccount {

	private int accountNumber;
	private String customerName;
	private double balance;
	private String accountType;
	private String email;
	private long mobileNumber;

	public BankAccount(int accountNumber, String customerName, double balance, String accountType, String email, long mobileNumber){
		this.accountNumber = accountNumber;
		this.customerName = customerName;
		this.balance = balance;
		this.accountType = accountType;
		this.email = email;
		this.mobileNumber = mobileNumber;
	}

	public BankAccount(int accountNumber, String customerName, double balance, String accountType) {
		this.accountNumber = accountNumber;
		this.customerName = customerName;
		this.balance = balance;
		this.accountType = accountType;
	}

	public void deposit(double value){
		this.balance += value;
		System.out.println("Deposited Rs." + value + " into your account.\nCurrent Balance is: Rs."+this.balance);
	}

	public double withdraw(double value){
		if(this.balance > value){
			balance -= value;
			System.out.println("Withdrawn Rs." + value + " from your account.\nCurrent Balance is: Rs."+this.balance);
			return value;
		}else{
			System.out.println("Sorry! Your account balance is insufficient for this transaction :(");
			return 0d;
		}
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

}

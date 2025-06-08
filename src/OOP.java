import objectOrientedProgramming.BankAccount;
import objectOrientedProgramming.Customer;

public class OOP {
	public static void main(String[] args) {

		BankAccount account = new BankAccount(1, "Kausik", 5000, "Savings");
		double withdrawnAmount = account.withdraw(1000);

		Customer kausik = new Customer("Kausik", "kausikd@gmail.com", 1000);
		System.out.println(kausik.getCreditLimit());
		System.out.println(kausik.getName());
		System.out.println(kausik.getEmail());

	}
}
package objectOrientedProgramming;

public class Customer {
	private String name;
	private String email;
	private long creditLimit;

	public Customer(String name, String email, long creditLimit){
		this.name = name;
		this.email = email;
		this.creditLimit = creditLimit;
	}

	public Customer(){
		this("Unknown", "unknown");
	}

	public Customer(String name, String email){
		this(name, email, 0);
	}

	public String getName(){
		return this.name;
	}
	public String getEmail(){
		return this.email;
	}
	public long getCreditLimit(){
		return this.creditLimit;
	}
}

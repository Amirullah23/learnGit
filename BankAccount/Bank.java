package BankAccount;

public class Bank {
	private int accNo;
	private int balance;
	private String custNm;
	private String email;
	private int phNo;
	
	public Bank() {
		this(243);
		System.out.println("contructor call");
	}
	
	public Bank(int noC) {
		System.out.println("contructor call second");
		this.accNo = noC;
	}
	
	/**
	 * @return the accNo
	 */
	public int getAccNo() {
		return accNo;
	}
	/**
	 * @param accNo the accNo to set
	 */
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	/**
	 * @return the balance
	 */
	public int getBalance() {
		return balance;
	}
	/**
	 * @param balance the balance to set
	 */
	public void setBalance(int balance) {
		this.balance = balance;
	}
	/**
	 * @return the custNm
	 */
	public String getCustNm() {
		return custNm;
	}
	/**
	 * @param custNm the custNm to set
	 */
	public void setCustNm(String custNm) {
		this.custNm = custNm;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the phNo
	 */
	public int getPhNo() {
		return phNo;
	}
	/**
	 * @param phNo the phNo to set
	 */
	public void setPhNo(int phNo) {
		this.phNo = phNo;
	}

	
	public void addBalance(int amount) {
		balance += amount;
		System.out.println("acc no : " + accNo);
		System.out.println("name : " + custNm );
		System.out.println("enail : " + email);
		System.out.println("phone num : " + phNo);
		System.out.println("your saldo now " + balance);
	}
	
	public void takeBalance(int amount) {
		if(balance - amount < 0) {
			System.out.println("acc no : " + accNo);
			System.out.println("name : " + custNm );
			System.out.println("enail : " + email);
			System.out.println("phone num : " + phNo);
			System.out.println("Saldo not enought");
			System.out.println("your saldo now " + balance);
		} else {

		balance -= amount;
		System.out.println("acc no : " + accNo);
		System.out.println("name : " + custNm );
		System.out.println("enail : " + email);
		System.out.println("phone num : " + phNo);
		System.out.println("your saldo now " + balance);
		}
	}
	
	
	

}

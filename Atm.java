package atm;

public class Atm {
	private double balance;
	private double withdrawAmount;
	private double depositAmount;
	
	public Atm() {
		super();
	}
	
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getWithdrawAmount() {
		return withdrawAmount;
	}
	public void setWithdrawAmount(double withdrawAmount) {
		this.withdrawAmount = withdrawAmount;
	}
	public double getDepositAmount() {
		return depositAmount;
	}
	public void setDepositAmount(double depositAmount) {
		this.depositAmount = depositAmount;
	}


	@Override
	public String toString() {
		return "Atm [balance=" + balance + ", withdrawAmount=" + withdrawAmount + ", depositAmount=" + depositAmount
				+ "]";
	}
	
	
	
}

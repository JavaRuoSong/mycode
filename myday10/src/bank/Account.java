package bank;

public class Account {
	private  double balance;
	
	//
	public Account(double balance) {
		this.balance = balance;
	}
	//
	public double getBalance() {
	
		return balance;
	}
	
	//
	public void deposit(double amt) {
		if(amt>0){
			this.balance += amt;
			System.out.println("存款成功");
		}
	}
	//
	public void withdraw(double amt) {
		if(balance>amt) {
			this.balance -=amt;
			System.out.println("取款成功,余额为："+balance);
		}else {
			System.out.println("余额不足");
		}
	}
	

}

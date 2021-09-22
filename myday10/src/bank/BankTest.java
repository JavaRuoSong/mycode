package bank;

public class BankTest {
	public static void main(String[] args) {
		Bank bank = new Bank(10);
		bank.addCustomer("张", "若松");
		bank.getCustomer(0).setAccount(new Account(2000));
		bank.getCustomer(0).getAccount().withdraw(500);
		
		
		bank.addCustomer("耿", "怡");
		System.out.println("用户个数为："+bank.getNumOfCustomers());
	}
}

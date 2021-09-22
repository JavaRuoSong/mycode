package bank;

import java.util.*;

public class Bank {
	private Customer[] customers ;//存放多个客户的数组
	private int numberOfCustomer;//记录客户的个数
	//
	public Bank(int i) {
		customers = new Customer[i];
	}
	public void addCustomer(String f,String l) {
		Customer cust = new Customer(f,l);
		customers[numberOfCustomer++] = cust;
	//	numberOfCustomer++;
	}
	public int getNumOfCustomers() {
		return numberOfCustomer;
	}
	
	public Customer getCustomer(int index){
		if(index>=0&&index< numberOfCustomer) {
			return customers[index];
		}
		return null;
	}
}

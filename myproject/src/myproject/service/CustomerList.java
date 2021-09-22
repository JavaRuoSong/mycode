package myproject.service;

import myproject.bean.Customer;

public class CustomerList {
//	public static void main(String[] args) {
//		CustomerList cList = new CustomerList(5);
//		cList.addCustotmer(new Customer("耿怡", '女', 21));
//		cList.addCustotmer(new Customer("张若松", '男', 20));
//		cList.replaceCustomer(1, new Customer("张若松", '女', 20));
//		cList.deleteCustomer(1);
//		System.out.println(cList.getAllCustomers().length);
//		System.out.println(cList.getCustomer(10));
//		System.out.println(cList.total);
//		
//	}
	
	
	
	
	
	
	
	
	private Customer[] customers;
	private int total = 0;
	
	//创建用户表
	public CustomerList(int totalCustomer) {
		this.customers = new Customer[totalCustomer];
		
	}
	//
	public boolean addCustotmer(Customer customer) {
		if(customers.length>total) {
		customers[total] = customer;
		total++;
		return true;
		}else {
			return false;
		}
	}
	
	public boolean replaceCustomer(int index,Customer cust) {
		if(total>index&&index>0) {
			customers[index] = cust;
			return true;
		}
		return false;
	}
	//
	public boolean deleteCustomer(int index) {
		if(total>index&&index>0) {
//			customers[index] = null;
			for(int i = index;i<total-1;i++) {
				customers[i] = customers[i+1];
			}
			customers[--total] = null;
			return true;
		}else {
			return false;
		}
	}
	//
	public Customer[] getAllCustomers() {
		Customer[] custs = new Customer[total];
		for(int i =0;i<total;i++) {
			custs[i] = customers[i];
		}
		return custs;
	}
	//
	public Customer getCustomer(int index) {
		if(index<total) {
		return customers[index];
		}else {
			return null;
		}
	}
	//
	public int getTotal() {
		return total;
	}
	
}

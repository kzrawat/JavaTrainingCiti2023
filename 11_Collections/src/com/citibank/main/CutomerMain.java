package com.citibank.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.citibank.main.domain.Customer;

public class CutomerMain {

	public static void main(String[] args) {
		System.out.println("Mian Start");

		Customer customer1 = new Customer(101, "Kapil", "Wagholi Pune");
		Customer customer2 = new Customer(102, "Vivek", "Dadar Mumbai");
		Customer customer3 = new Customer(103, "Uday", " Chinchwad Pune");
		Customer customer4 = new Customer(104, "Paritosh", "FatimaNagar Pune");
		Customer customer5 = new Customer(105, "Debayan", "Hadapsar Pune");

		List<Customer> customerList = new ArrayList<Customer>();

		customerList.add(customer1);
		customerList.add(customer2);
		customerList.add(customer3);
		customerList.add(customer4);
		customerList.add(customer5);

		printAllCustomers(customerList);

		Scanner scanner = new Scanner(System.in);

//		int customerId;
//		System.out.println(" Enter Customer Id to retreive");
//		customerId = scanner.nextInt();
//
//		printCustomerByCustomerId(customerList, customerId);

//		int customerId;
//		String name;
//		String address;
//		System.out.println(" Enter Customer Id ");
//		customerId = scanner.nextInt();
//		
//		scanner.nextLine();
//		
//		System.out.println("Enter New Name");
//		name = scanner.nextLine();
//		
//		scanner.nextLine();
//		
//		System.out.println("Enter New Address");
//		address = scanner.nextLine();
//		
//		Customer updateCostomer = new Customer(customerId, name, address);
//		
//		updateCustomerByCustomerId(customerList, updateCostomer);

		int customerId;

		System.out.println(" Enter Customer Id ");
		customerId = scanner.nextInt();

		deleteCustomerByCustomerId(customerList, customerId);

		System.out.println("Main =End");

	}

	private static void printAllCustomers(List<Customer> customerList) {
		System.out.println("All Customers");
		for (Customer customer : customerList) {
			System.out.println(customer);
		}

	}

	private static void printCustomerByCustomerId(List<Customer> customerList, int customerId) {
		System.out.println("Result details for customer");
		boolean flag = false;
		for (Customer customer : customerList) {
			if (customer.getCustomerId() == customerId) {
				System.out.println("Customer Found");
				System.out.println(customer);
				flag = true;
				break;
			}

		}
		if (flag == false)
			System.out.println("Customer Id  Not Found");
	}

	private static void updateCustomerByCustomerId(List<Customer> customerList, Customer customer) {
		boolean flag = false;
		for (Customer customer1 : customerList) {
			if (customer1.getCustomerId() == customer.getCustomerId()) {
				System.out.println("Customer Found");
				customer1.setName(customer.getName());
				customer1.setAddress(customer.getAddress());
				flag = true;
				System.out.println("Updated details for customer ID " + customer1.getCustomerId());
				System.out.println(customer1);
				break;
			}

		}
		if (flag == false)
			System.out.println("Customer Id  Not Found to be updated");
		System.out.println("New Customer details added");
		customerList.add(customer);
		printAllCustomers(customerList);
	}

	private static void deleteCustomerByCustomerId(List<Customer> customerList, int customerId) {
		boolean flag = false;
		for (Customer customer1 : customerList) {
			if (customer1.getCustomerId() == customerId) {
				System.out.println("Customer Found");
				customerList.remove(customer1);
				flag = true;
				break;
			}

		}
		if (flag == false)
			System.out.println("Customer Id  Not Found to be deleted");
		System.out.println("Updated Customer List");
		printAllCustomers(customerList);
	}

}

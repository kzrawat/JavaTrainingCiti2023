package com.citibank.main;

import java.util.ArrayList;
import java.util.List;

import com.citibank.main.domain.Customer;
import com.citibank.main.service.CustomerService;

public class CustomerJDBCMain {

	public static void main(String[] args) {

		List<Customer> listCustomer = new ArrayList<>();
		CustomerService customerService = new CustomerService();
		listCustomer = customerService.getAllCustomer();
		
		System.out.println("Customer Details recieved from JDBC databas :");
		for (Customer customer : listCustomer) {
			System.out.println(customer);
		}
		
		System.out.println("----- Logical Break ------");
		
		Customer cust1 = new Customer();
		cust1 = customerService.getCustomerByCustomerId(3184);
		if (cust1 != null) {
			System.out.println("Customer Details for selected ID : " + "\n" + cust1);
		}
		else {
			System.out.println("Custome details not found for given ID");
		}
		
		System.out.println("----- Logical Break adding new customer------");
		
//		Customer cust2 = new Customer(0, "Ankit","Pune");
//		Boolean addCust = customerService.addNewCustomer(cust2);
//		if (addCust) {
//			System.out.println("Customer Details added for given ID : " );
//			listCustomer = customerService.getAllCustomer();	
//			for (Customer customer : listCustomer) {
//				System.out.println(customer);
//			}
//		}
//		else {
//			System.out.println("Custome details not added");
//		}
		
		System.out.println("----- Logical Break ------");
		
		Customer cust3 = new Customer (1, "Vevek Vevek2" , "Dadar Mumbai");
		customerService.updateCustomerByCustomerId(cust3);
		
		if (cust3 != null) {
			System.out.println("Customer Details added for given ID : " );
			listCustomer = customerService.getAllCustomer();	
			for (Customer customer : listCustomer) {
				System.out.println(customer);
			}
		}
		else {
			System.out.println("Custome details not updated");
		}
		
		
		System.out.println("----- Logical Break for Delete ------");
		
		
		boolean deleteResult = customerService.deleteCustomerByCustomerId(1);
		
		if (deleteResult) {
			System.out.println("Customer Details deleted for given ID : " );
			listCustomer = customerService.getAllCustomer();	
			for (Customer customer : listCustomer) {
				System.out.println(customer);
			}
		}
		else {
			System.out.println("Custome details not deleted");
		}

	}

}

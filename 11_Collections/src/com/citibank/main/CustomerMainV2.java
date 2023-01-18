package com.citibank.main;

import java.util.List;

import com.citibank.main.domain.Customer;
import com.citibank.main.repository.CustomerRepository;
import com.citibank.main.service.CustomerService;

public class CustomerMainV2 {

	public static void main(String[] args) {
		CustomerService customerService = new CustomerService();

		System.out.println("Adding Customers");

		Customer customer1 = new Customer(101, "Kapil", "Wagholi Pune");
		Customer customer2 = new Customer(102, "Vivek", "Dadar Mumbai");
		Customer customer3 = new Customer(103, "Uday", " Chinchwad Pune");
		Customer customer4 = new Customer(104, "Paritosh", "FatimaNagar Pune");
		Customer customer5 = new Customer(105, "Debayan", "Hadapsar Pune");
		Customer customer6 = new Customer(105, "Debayan", "Hadapsar Pune");

		System.out.println("Adding First Customer :: " + customerService.addNewCustomer(customer1));
		System.out.println("Adding First Customer :: " + customerService.addNewCustomer(customer2));
		System.out.println("Adding First Customer :: " + customerService.addNewCustomer(customer3));
		System.out.println("Adding First Customer :: " + customerService.addNewCustomer(customer4));
		System.out.println("Adding First Customer :: " + customerService.addNewCustomer(customer5));

		System.out.println("----------Logical Break ---------");
		System.out.println("reading all customer from database/list");

		List<Customer> customerList = customerService.getAllCustomer();
		for (Customer customer : customerList) {
			System.out.println(customer);
		}

		System.out.println("------------Logical break for reading 1 by 1-------");
		Customer c;
		System.out.println("Customer 1 detail");
		c = customerService.getCustomerByCustomerId(customer1.getCustomerId());
		System.out.println(c);

		System.out.println("Customer 2 detail");
		c = customerService.getCustomerByCustomerId(customer2.getCustomerId());
		System.out.println(c);

		System.out.println("Customer 3 detail");
		c = customerService.getCustomerByCustomerId(customer3.getCustomerId());
		System.out.println(c);

		System.out.println("Customer 4 detail");
		c = customerService.getCustomerByCustomerId(customer4.getCustomerId());
		System.out.println(c);

		System.out.println("Customer 5 detail");
		c = customerService.getCustomerByCustomerId(customer5.getCustomerId());
		System.out.println(c);

		System.out.println("------- Logical Break for Updating customer--------");

		Customer c2 = new Customer(101, "Kapil Rawat", "Wagholi Wagholi Pune");

		customerService.updateCustomerByCustomerId(c2);
		System.out.println("Update Details for :: " + c2.getCustomerId());
		System.out.println(customerService.getCustomerByCustomerId(c2.getCustomerId()));

		System.out.println("------- Logical Break for Deleting customer--------");
		Customer c3 = new Customer(101, "Kapil Rawat", "Wagholi Wagholi Pune");

		customerService.deleteCustomerByCustomerId(c3.getCustomerId());
		System.out.println("Customer detail deleted for customer :" + c3.getCustomerId());
		System.out.println(customerService.getCustomerByCustomerId(c3.getCustomerId()));

	}

}

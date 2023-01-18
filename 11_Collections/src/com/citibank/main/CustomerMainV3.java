package com.citibank.main;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.citibank.main.domain.Customer;

public class CustomerMainV3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Customer> customerSet = new HashSet<>();
				
		System.out.println("Adding Customers");

		Customer customer1 = new Customer(101, "Kapil", "Wagholi Pune");
		Customer customer2 = new Customer(102, "Vivek", "Dadar Mumbai");
		Customer customer3 = new Customer(103, "Uday", " Chinchwad Pune");
		Customer customer4 = new Customer(104, "Paritosh", "FatimaNagar Pune");
		Customer customer5 = new Customer(105, "Debayan", "Hadapsar Pune");
		Customer customer6 = new Customer(105, "Debayan", "Hadapsar Pune");
		
		System.out.println("First Customer ::" + customer1.hashCode());
		System.out.println("Adding First Customer :: " + customerSet.add(customer1));
//		System.out.println("Adding First Customer :: " + customerSet.add(customer2));
//		System.out.println("Adding First Customer :: " + customerSet.add(customer3));
//		System.out.println("Adding First Customer :: " + customerSet.add(customer4));
		
		System.out.println("First Customer ::" + customer5.hashCode());
		System.out.println("Adding First Customer :: " + customerSet.add(customer5));
		System.out.println("First Customer ::" + customer6.hashCode());
		System.out.println("Adding First Customer :: " + customerSet.add(customer6));
//		
		System.out.println(customerSet);		
	}

}

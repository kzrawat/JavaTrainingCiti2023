package com.citibank.main.service;

import java.util.List;

import com.citibank.main.domain.Customer;
import com.citibank.main.repository.CustomerRepository;
import com.citibank.main.repository.CustomerRepositoryInterface;

public class CustomerService implements CustomerServiceInterface {
	
	private CustomerRepositoryInterface customerRepository = new CustomerRepository();
	
//	@autowire  -- this is springboot
//	private CustomerRepositoryInterface customerRepository;	
	
	@Override
	public boolean addNewCustomer(Customer customer) {
		//logging
		//authentication
		return customerRepository.addNewCustomer(customer);
	}

	@Override
	public Customer getCustomerByCustomerId(int customerId) {
		return customerRepository.getCustomerByCustomerId(customerId);
	}

	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return customerRepository.getAllCustomer();
	}

	@Override
	public boolean updateCustomerByCustomerId(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepository.updateCustomerByCustomerId(customer);
	}

	@Override
	public boolean deleteCustomerByCustomerId(int customerId) {
		// TODO Auto-generated method stub
		return customerRepository.deleteCustomerByCustomerId(customerId);
	}

}

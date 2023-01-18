package com.citibank.main.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.citibank.main.domain.Customer;
import com.citibank.main.factory.ConnectionFactory;

public class CustomerRepository implements CustomerRepositoryInterface {

	private List<Customer> customerList = new ArrayList<>();

	private Connection connection;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;
	private String sql;
	private int rowCount;
	
	

	@Override
	public boolean addNewCustomer(Customer customer) {

		connection = new ConnectionFactory().getConnection();
		sql="insert into customer_details (name, address) values(?,?)";
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, customer.getName());
			preparedStatement.setString(2, customer.getAddress());
			rowCount = preparedStatement.executeUpdate();
			if (rowCount > 0) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception in Query : exception message ::" + e.getMessage());
		}
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("Error while Closing the connection");
			}
		}
		
		return customerList.add(customer);
	}

	@Override
	public Customer getCustomerByCustomerId(int customerId) {
		connection = new ConnectionFactory().getConnection();
		sql="select * from customer_details where customer_id = ?";
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, customerId);
			resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				customerId = resultSet.getInt("customer_id");
				String name = resultSet.getString("name");
				String address = resultSet.getString("address");
				Customer customer = new Customer(customerId, name, address);
				return customer;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception in Query : exception message ::" + e.getMessage());
		}
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("Error while Closing the connection");
			}
		}
		return null;
	}

	@Override
	public List<Customer> getAllCustomer() {
		customerList.clear();
		connection = new ConnectionFactory().getConnection();
		sql="select * from customer_details";
		try {
			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				int customerId = resultSet.getInt("customer_id");
				String name = resultSet.getString("name");
				String address = resultSet.getString("address");
				
				Customer customer = new Customer(customerId, name, address);
				
				customerList.add(customer);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception in Query : exception message ::" + e.getMessage());
		}
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("Error while Closing the connection");
			}
		}
		return customerList;
	}

	@Override
	public boolean updateCustomerByCustomerId(Customer customer) {
				
		connection = new ConnectionFactory().getConnection();
		sql="update customer_details set name=? , address=? where customer_id = ?";
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(3, customer.getCustomerId());
			preparedStatement.setString(1, customer.getName());
			preparedStatement.setString(2, customer.getAddress());
			rowCount = preparedStatement.executeUpdate();
			if (rowCount > 0) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception in Query : exception message ::" + e.getMessage());
		}
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("Error while Closing the connection");
			}
		}
		
		for (Customer c : customerList) {
			if (c.getCustomerId() == customer.getCustomerId()) {
				c.setName(customer.getName());
				c.setAddress(customer.getAddress());
//				c = customer;
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean deleteCustomerByCustomerId(int customerId) {
		
		connection = new ConnectionFactory().getConnection();
		sql="delete from customer_details where customer_id = ?";
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, customerId);
			preparedStatement.executeUpdate();			
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception in Query : exception message ::" + e.getMessage());
		}
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("Error while Closing the connection");
			}
		}
		
		for (Customer c : customerList) {
			if (c.getCustomerId() == customerId) {
				return customerList.remove(c);
			}
		}
		return false;
	}
}

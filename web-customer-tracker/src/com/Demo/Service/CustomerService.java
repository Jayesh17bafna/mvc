package com.Demo.Service;

import java.util.List;

import com.Demo.entity.Customer;
public interface CustomerService {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int theId);

	public void deleteCustomer(int theId);
}

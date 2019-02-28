package com.Demo.Dao;
import java.util.List;

import org.springframework.stereotype.Service;

import com.Demo.entity.Customer;

public interface CustomerDao {

	public List<Customer> getCustomer();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int theId);

	public void deleteCustomer(int theId);
}

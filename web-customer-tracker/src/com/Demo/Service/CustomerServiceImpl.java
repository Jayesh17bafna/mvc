package com.Demo.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Demo.Dao.CustomerDao;
import com.Demo.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao customerDao;
	@Override
	@Transactional
	public List<Customer> getCustomers() {
		return customerDao.getCustomer();
	}
	@Override
	@Transactional
	public void saveCustomer(Customer theCustomer) {
		
		customerDao.saveCustomer(theCustomer);
	}
	@Override
	@Transactional
	public Customer getCustomer(int theId) {
		return customerDao.getCustomer(theId);
	}
	@Override
	@Transactional
	public void deleteCustomer(int theId) {
		customerDao.deleteCustomer(theId);
	}

}

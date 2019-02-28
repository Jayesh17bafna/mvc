package com.Demo.Dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Demo.entity.Customer;

@Repository
public class CustomerDaoImPL implements CustomerDao {

	@Autowired
	private SessionFactory sessionFactory ;
	
	@Override
	
	public List<Customer> getCustomer() {
		
		Session currentsession = sessionFactory.getCurrentSession();
		
		Query<Customer> theQuery = currentsession.createQuery("from Customer order by lname",Customer.class);
		
		List<Customer> customers = theQuery.getResultList();		
		
		return customers;
	}

	@Override
	public void saveCustomer(Customer theCustomer) {
	
		Session currentsession = sessionFactory.getCurrentSession();
		
		
		
		currentsession.saveOrUpdate(theCustomer);
		
		
	}

	@Override
	public Customer getCustomer(int theId) {
		
		Session currentsession = sessionFactory.getCurrentSession();
		
		Customer theCustomer = currentsession.get(Customer.class, theId);
		
		return theCustomer;
	}

	@Override
	public void deleteCustomer(int theId) {
	
		Session currentsession = sessionFactory.getCurrentSession();
		
		Query theQuery = currentsession.createQuery("delete from Customer where id=:customerId");
		
		theQuery.setParameter("customerId", theId);
		
		theQuery.executeUpdate();
		
	
	}

}

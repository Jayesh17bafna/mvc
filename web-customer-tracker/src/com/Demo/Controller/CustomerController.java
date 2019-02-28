package com.Demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Demo.Dao.CustomerDao;
import com.Demo.Service.CustomerService;
import com.Demo.entity.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/list")
	public String listCustomers(Model theModel)
	{
		List<Customer> thecustomer = customerService.getCustomers();
		
		System.out.println(thecustomer.size());
		
		theModel.addAttribute("customer",thecustomer);
		
		return "list-customers";
	}
		@GetMapping("/showFormForAdd")
		public String showFormForAdd(Model theModel)
		{
			
			Customer theCustomer = new Customer();
			
			theModel.addAttribute("customer",theCustomer);
			
			
			return "customer-form";
	}
	
		@PostMapping("/saveCustomer")
	 public String  saveCustomer(@ModelAttribute("customer") Customer theCustomer)
	 {
		
			
			
			customerService.saveCustomer(theCustomer);
			
			return "redirect:/customer/list";
	 }
		
		@GetMapping("/showFormForUpdate")
		public  String showFomrForUpdate(@RequestParam("customerId") int theId, Model theModel)
		{
			Customer theCustomer = customerService.getCustomer(theId);
			
			theModel.addAttribute("customer",theCustomer);
			
			
			return "customer-form";
		}
		
		
		@GetMapping("/delete")
		public String deleteCustomer(@RequestParam("customerId") int theId)
		{
			
			customerService.deleteCustomer(theId);
			
			return "redirect:/customer/list";
			
			
		}
		
		
		
		
		
		
		
		
		

}

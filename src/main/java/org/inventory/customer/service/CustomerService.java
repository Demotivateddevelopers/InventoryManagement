package org.inventory.customer.service;

import java.util.Collection;

import org.inventory.customer.constants.CustomerConstants;
import org.inventory.customer.entity.Customer;
import org.inventory.customer.model.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/customer")
public class CustomerService {

	@Autowired
	CustomerRepository customerRepository;
	
	@RequestMapping("/getallcustomer")
	Collection<Customer> getAllCustomerDetails(){
		return customerRepository.findAll();
	}

	
	@RequestMapping(value="/addcustomer",method=RequestMethod.POST)
	public boolean addCustomer(@RequestBody Customer customer){
		
		customer.setStatus(CustomerConstants.CUSTOMER_ACTIVE);
		customerRepository.save(customer);
		return true;
	}
	
	@RequestMapping(value="/updatecustomer",method=RequestMethod.POST)
	public boolean updatecustomer(@RequestBody Customer customer){
		
		customerRepository.save(customer);
		return true;
	}
	
	@RequestMapping(value="/getcustomer",method=RequestMethod.POST)
	public Customer getcustomer(@RequestBody Customer customer){
		
		return customerRepository.findOne(customer.getCustomerid());
		
	}
	
	@RequestMapping(value="/deletecustomer",method=RequestMethod.POST)
	public void deletecustomer(@RequestBody Customer customer){
		
		customer.setStatus(CustomerConstants.CUSTOMER_DEACTIVATED);
		customerRepository.save(customer);
		
	}
	
	
}

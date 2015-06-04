package org.inventory.customer.service;

import org.inventory.customer.entity.CustomerPhoto;
import org.inventory.customer.model.CustomerPhotoRepositiy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


@RestController
@RequestMapping("/CustomerPhotoService")
public class CustomerPhotoService {

	@Autowired
	CustomerPhotoRepositiy  customerPhotoRepositiy;
	
	@RequestMapping(value="/getcustomerphoto",method=RequestMethod.POST)
	public CustomerPhoto getcustomerphoto(@RequestBody CustomerPhoto customerPhoto){
		
		return customerPhotoRepositiy.findOne(customerPhoto.getCustomerID());
		
	}
	
	

	@RequestMapping(value="/savecustomerphoto",method=RequestMethod.POST)
	public void savecustomerphoto(@RequestParam("file") MultipartFile file
			,@RequestParam("customerid") int customerid){
		
		try{
			byte[] bytes = file.getBytes();
			CustomerPhoto customerPhoto=new CustomerPhoto(customerid,bytes);
			customerPhotoRepositiy.save(customerPhoto);  
				
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	
	@RequestMapping(value="/deletecustomerphoto",method=RequestMethod.POST)
	public void deletecustomerphoto(@RequestParam("customerid") int customerid){
		
			customerPhotoRepositiy.delete(customerid);  
		
	}
	
	
	
}

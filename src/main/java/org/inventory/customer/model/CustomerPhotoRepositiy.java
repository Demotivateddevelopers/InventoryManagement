package org.inventory.customer.model;

import org.inventory.customer.entity.CustomerPhoto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
public interface CustomerPhotoRepositiy extends JpaRepository<CustomerPhoto,Integer>{
	
}

package org.inventory.customer.entity;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class CustomerPhoto {

	
	@Id
	@GeneratedValue
	private int id;
	
	
	private int customerID;
	
	private byte[] image;

	public CustomerPhoto() {
	
	}

	public CustomerPhoto(int customerID, byte[] image) {
		super();
		this.customerID = customerID;
		this.image = image;
	}

	public int getCustomerID() {
		return customerID;
	}

	public byte[] getImage() {
		return image;
	}

	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "CustomerPhoto [customerID=" + customerID + ", image="
				+ Arrays.toString(image) + "]";
	}
	
	
	
}

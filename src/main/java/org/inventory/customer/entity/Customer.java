package org.inventory.customer.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Customer {

	@Id
	@GeneratedValue
	private Integer customerid;
	
	private String firstname;
	
	private String lastname;
	
	private String username;
	
	private String password;
	
	private String emailid;
	
	private String contactnumber;
	
	
	//private byte[] image;

	private String address;
	
	private String state;
	
	private String pincode;
	
	private Integer employeid;

	private String status;
	
	public Customer(String firstname, String lastname, String username,
			String password, String emailid, String contactnumber,
			//byte[] image,
			String address, String state, String pincode,
			Integer employeid,String status) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.username = username;
		this.password = password;
		this.emailid = emailid;
		this.contactnumber = contactnumber;
	//	this.image = image;
		this.address = address;
		this.state = state;
		this.pincode = pincode;
		this.employeid = employeid;
		this.status=status;
	}

	public Customer(){
		
	}

	public Integer getCustomerid() {
		return customerid;
	}

	

	public String getFirstname() {
		return firstname;
	}

	
	public String getLastname() {
		return lastname;
	}

	
	public String getUsername() {
		return username;
	}

	
	public String getPassword() {
		return password;
	}

	

	public String getEmailid() {
		return emailid;
	}

	
	public String getContactnumber() {
		return contactnumber;
	}

	
	/*public byte[] getImage() {
		return image;
	}*/

	
	public String getAddress() {
		return address;
	}

	
	public String getState() {
		return state;
	}

	
	public String getPincode() {
		return pincode;
	}

	
	public void setCustomerid(Integer customerid) {
		this.customerid = customerid;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public void setContactnumber(String contactnumber) {
		this.contactnumber = contactnumber;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public void setEmployeid(Integer employeid) {
		this.employeid = employeid;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	public Integer getEmployeid() {
		return employeid;
	}
	
	

	@Override
	public String toString() {
		return "Customer [customerid=" + customerid + ", firstname="
				+ firstname + ", lastname=" + lastname + ", username="
				+ username + ", password=" + password + ", emailid=" + emailid
				+ ", contactnumber=" + contactnumber + ", address=" + address
				+ ", state=" + state + ", pincode=" + pincode + ", employeid="
				+ employeid + ", status=" + status + "]";
	}


	
	
	
}

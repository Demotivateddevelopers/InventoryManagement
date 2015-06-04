package org.inventory.employe.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employe {

	@Id
	@GeneratedValue
	private int employeid;
	
	private String firstname;

    private String lastname;

	private String username;

	private String password;

	private String emailid;

	private String contactnumber;

	private String address;

	private String state;

	private String pincode;

	private String status;

	private String designation;
	
	private String date;
	
	private int createdby;

	public Employe(int employeid, String firstname, String lastname,
			String username, String password, String emailid,
			String contactnumber, String address, String state, String pincode,
			String status, String designation, String date, int createdby) {
		super();
		this.employeid = employeid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.username = username;
		this.password = password;
		this.emailid = emailid;
		this.contactnumber = contactnumber;
		this.address = address;
		this.state = state;
		this.pincode = pincode;
		this.status = status;
		this.designation = designation;
		this.date = date;
		this.createdby = createdby;
	}

	public int getEmployeid() {
		return employeid;
	}

	public void setEmployeid(int employeid) {
		this.employeid = employeid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getContactnumber() {
		return contactnumber;
	}

	public void setContactnumber(String contactnumber) {
		this.contactnumber = contactnumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getCreatedby() {
		return createdby;
	}

	public void setCreatedby(int createdby) {
		this.createdby = createdby;
	}

	@Override
	public String toString() {
		return "Employe [employeid=" + employeid + ", firstname=" + firstname
				+ ", lastname=" + lastname + ", username=" + username
				+ ", password=" + password + ", emailid=" + emailid
				+ ", contactnumber=" + contactnumber + ", address=" + address
				+ ", state=" + state + ", pincode=" + pincode + ", status="
				+ status + ", designation=" + designation + ", date=" + date
				+ ", createdby=" + createdby + "]";
	}

	
	
	
}

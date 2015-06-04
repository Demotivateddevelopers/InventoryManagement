package org.inventory.employe.entity;

import java.util.Arrays;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class EmployePhoto {

	@Id
	@GeneratedValue
	private int id;
	
	private int employeid;
	
	private byte[] image;
	
	private Date date;
	
	private int updatedby;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEmployeid() {
		return employeid;
	}

	public void setEmployeid(int employeid) {
		this.employeid = employeid;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getUpdatedby() {
		return updatedby;
	}

	public void setUpdatedby(int updatedby) {
		this.updatedby = updatedby;
	}

	public EmployePhoto(int id, int employeid, byte[] image, Date date,
			int updatedby) {
		super();
		this.id = id;
		this.employeid = employeid;
		this.image = image;
		this.date = date;
		this.updatedby = updatedby;
	}

	@Override
	public String toString() {
		return "EmployePhoto [id=" + id + ", employeid=" + employeid
				+ ", image=" + Arrays.toString(image) + ", date=" + date
				+ ", updatedby=" + updatedby + "]";
	}
	
	
 	
}

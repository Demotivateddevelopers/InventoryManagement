package org.inventory.room.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Inventory {

	@Id
	@GeneratedValue
	private int inventoryid;
	
	private String category;
	
	private String description;
	
	private String status;
	
	private double price;
	
	private String inventoryname;
	
	private int employeid;
	
	private Date date;

	public Inventory(int inventoryid, String category, String description,
			String status, double price, String inventoryname, int employeid,
			Date date) {
		super();
		this.inventoryid = inventoryid;
		this.category = category;
		this.description = description;
		this.status = status;
		this.price = price;
		this.inventoryname = inventoryname;
		this.employeid = employeid;
		this.date = date;
	}

	public int getInventoryid() {
		return inventoryid;
	}

	public void setInventoryid(int inventoryid) {
		this.inventoryid = inventoryid;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getInventoryname() {
		return inventoryname;
	}

	public void setInventoryname(String inventoryname) {
		this.inventoryname = inventoryname;
	}

	public int getEmployeid() {
		return employeid;
	}

	public void setEmployeid(int employeid) {
		this.employeid = employeid;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Inventory [inventoryid=" + inventoryid + ", category="
				+ category + ", description=" + description + ", status="
				+ status + ", price=" + price + ", inventoryname="
				+ inventoryname + ", employeid=" + employeid + ", date=" + date
				+ "]";
	}
	
	
	
}

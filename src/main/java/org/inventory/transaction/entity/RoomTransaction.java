package org.inventory.transaction.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class RoomTransaction {

	@Id
	@GeneratedValue
	private int transactionid;
	
	private int billid;
	
	private String status;
	
	private double price;
	
	private String transactiondetails;
	
	private Date date;

	public RoomTransaction(int transactionid, int billid, String status,
			double price, String transactiondetails, Date date) {
		super();
		this.transactionid = transactionid;
		this.billid = billid;
		this.status = status;
		this.price = price;
		this.transactiondetails = transactiondetails;
		this.date = date;
	}

	public int getTransactionid() {
		return transactionid;
	}

	public void setTransactionid(int transactionid) {
		this.transactionid = transactionid;
	}

	public int getBillid() {
		return billid;
	}

	public void setBillid(int billid) {
		this.billid = billid;
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

	public String getTransactiondetails() {
		return transactiondetails;
	}

	public void setTransactiondetails(String transactiondetails) {
		this.transactiondetails = transactiondetails;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "RoomTransaction [transactionid=" + transactionid + ", billid="
				+ billid + ", status=" + status + ", price=" + price
				+ ", transactiondetails=" + transactiondetails + ", date="
				+ date + "]";
	}
	
	
	
}

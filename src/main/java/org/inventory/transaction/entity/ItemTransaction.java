package org.inventory.transaction.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ItemTransaction {

	@Id
	@GeneratedValue
	private int transactionid;
	
	private int billid;
	
	private String status;
	
	private double rate;
	
	private String transactiondetails;
	
	private int quantity;
	
	private Date date;
	
	private double amount;

	public ItemTransaction(int transactionid, int billid, String status,
			double rate, String transactiondetails, int quantity, Date date,
			double amount) {
		super();
		this.transactionid = transactionid;
		this.billid = billid;
		this.status = status;
		this.rate = rate;
		this.transactiondetails = transactiondetails;
		this.quantity = quantity;
		this.date = date;
		this.amount = amount;
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

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public String getTransactiondetails() {
		return transactiondetails;
	}

	public void setTransactiondetails(String transactiondetails) {
		this.transactiondetails = transactiondetails;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "ItemTransaction [transactionid=" + transactionid + ", billid="
				+ billid + ", status=" + status + ", rate=" + rate
				+ ", transactiondetails=" + transactiondetails + ", quantity="
				+ quantity + ", date=" + date + ", amount=" + amount + "]";
	}
	
	
}

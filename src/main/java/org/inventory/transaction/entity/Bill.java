package org.inventory.transaction.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Bill {

	@Id
	@GeneratedValue
	private int billid;
	
	private int billno;
	
	private Date date;
	
	private int reservationid;
	
	private int employeid;
	
	private String status;

	public Bill(int billid, int billno, Date date, int reservationid,
			int employeid, String status) {
		super();
		this.billid = billid;
		this.billno = billno;
		this.date = date;
		this.reservationid = reservationid;
		this.employeid = employeid;
		this.status = status;
	}

	public int getBillid() {
		return billid;
	}

	public void setBillid(int billid) {
		this.billid = billid;
	}

	public int getBillno() {
		return billno;
	}

	public void setBillno(int billno) {
		this.billno = billno;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getReservationid() {
		return reservationid;
	}

	public void setReservationid(int reservationid) {
		this.reservationid = reservationid;
	}

	public int getEmployeid() {
		return employeid;
	}

	public void setEmployeid(int employeid) {
		this.employeid = employeid;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Bill [billid=" + billid + ", billno=" + billno + ", date="
				+ date + ", reservationid=" + reservationid + ", employeid="
				+ employeid + ", status=" + status + "]";
	}
	
	
}

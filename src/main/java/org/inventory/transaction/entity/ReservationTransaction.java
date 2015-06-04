package org.inventory.transaction.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ReservationTransaction {

	@Id
	@GeneratedValue
	private int reservationtransactionid;
	
	private int banktransactionid;
	
	private int customerid;
	
	private int reservationid;

	public ReservationTransaction(int reservationtransactionid,
			int banktransactionid, int customerid, int reservationid) {
		super();
		this.reservationtransactionid = reservationtransactionid;
		this.banktransactionid = banktransactionid;
		this.customerid = customerid;
		this.reservationid = reservationid;
	}

	public int getReservationtransactionid() {
		return reservationtransactionid;
	}

	public void setReservationtransactionid(int reservationtransactionid) {
		this.reservationtransactionid = reservationtransactionid;
	}

	public int getBanktransactionid() {
		return banktransactionid;
	}

	public void setBanktransactionid(int banktransactionid) {
		this.banktransactionid = banktransactionid;
	}

	public int getCustomerid() {
		return customerid;
	}

	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}

	public int getReservationid() {
		return reservationid;
	}

	public void setReservationid(int reservationid) {
		this.reservationid = reservationid;
	}

	@Override
	public String toString() {
		return "ReservationTransaction [reservationtransactionid="
				+ reservationtransactionid + ", banktransactionid="
				+ banktransactionid + ", customerid=" + customerid
				+ ", reservationid=" + reservationid + "]";
	}
	
	
}

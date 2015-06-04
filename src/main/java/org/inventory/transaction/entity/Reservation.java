package org.inventory.transaction.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Reservation {

	@Id
	@GeneratedValue
	private int reservationid;
	
	private Date date;
	
	private Date startdate;
	
	private Date enddate;
	
	private String status;
	
	private int customerid;
	
	private int roomid;
	
	private int employeid;

	public Reservation(int reservationid, Date date, Date startdate,
			Date enddate, String status, int customerid, int roomid,
			int employeid) {
		super();
		this.reservationid = reservationid;
		this.date = date;
		this.startdate = startdate;
		this.enddate = enddate;
		this.status = status;
		this.customerid = customerid;
		this.roomid = roomid;
		this.employeid = employeid;
	}

	public int getReservationid() {
		return reservationid;
	}

	public void setReservationid(int reservationid) {
		this.reservationid = reservationid;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Date getStartdate() {
		return startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	public Date getEnddate() {
		return enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getCustomerid() {
		return customerid;
	}

	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}

	public int getRoomid() {
		return roomid;
	}

	public void setRoomid(int roomid) {
		this.roomid = roomid;
	}

	public int getEmployeid() {
		return employeid;
	}

	public void setEmployeid(int employeid) {
		this.employeid = employeid;
	}

	@Override
	public String toString() {
		return "Reservation [reservationid=" + reservationid + ", date=" + date
				+ ", startdate=" + startdate + ", enddate=" + enddate
				+ ", status=" + status + ", customerid=" + customerid
				+ ", roomid=" + roomid + ", employeid=" + employeid + "]";
	}
	
	
	
}

package org.inventory.room.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Room {

	@Id
	@GeneratedValue
	private int roomid;
	
	private String roomno;
	
	private String status;
	
	private int employeid;
	
	private int inventoryid;
	
	private Date date;

	public Room(int roomid, String roomno, String status, int employeid,
			int inventoryid, Date date) {
		super();
		this.roomid = roomid;
		this.roomno = roomno;
		this.status = status;
		this.employeid = employeid;
		this.inventoryid = inventoryid;
		this.date = date;
	}

	public int getRoomid() {
		return roomid;
	}

	public void setRoomid(int roomid) {
		this.roomid = roomid;
	}

	public String getRoomno() {
		return roomno;
	}

	public void setRoomno(String roomno) {
		this.roomno = roomno;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getEmployeid() {
		return employeid;
	}

	public void setEmployeid(int employeid) {
		this.employeid = employeid;
	}

	public int getInventoryid() {
		return inventoryid;
	}

	public void setInventoryid(int inventoryid) {
		this.inventoryid = inventoryid;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Room [roomid=" + roomid + ", roomno=" + roomno + ", status="
				+ status + ", employeid=" + employeid + ", inventoryid="
				+ inventoryid + ", date=" + date + "]";
	}
	
	
	
}

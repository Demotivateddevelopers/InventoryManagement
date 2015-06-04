package org.inventory.employe.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class RoleTaskMapper {
	
	@Id
	@GeneratedValue
	private int id;
	
	private int taskid;
	
	private int roleid;
	
	private int employeid;

	private int updatedby;
	
	private Date date;

	
	public RoleTaskMapper(int id, int taskid, int roleid, int employeid,
			int updatedby, Date date) {
		super();
		this.id = id;
		this.taskid = taskid;
		this.roleid = roleid;
		this.employeid = employeid;
		this.updatedby = updatedby;
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTaskid() {
		return taskid;
	}

	public void setTaskid(int taskid) {
		this.taskid = taskid;
	}

	public int getRoleid() {
		return roleid;
	}

	public void setRoleid(int roleid) {
		this.roleid = roleid;
	}

	public int getEmployeid() {
		return employeid;
	}

	public void setEmployeid(int employeid) {
		this.employeid = employeid;
	}

	
	@Override
	public String toString() {
		return "RoleTaskMapper [id=" + id + ", taskid=" + taskid + ", roleid="
				+ roleid + ", employeid=" + employeid + ", updatedby="
				+ updatedby + ", date=" + date + "]";
	}

  	

}

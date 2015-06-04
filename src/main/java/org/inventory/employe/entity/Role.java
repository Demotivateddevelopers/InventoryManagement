package org.inventory.employe.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Role {
   
	 @Id
	 @GeneratedValue
	 private int roleid;
	 
	 private String rolename;
	 
	 private int employeid;

	 private Date date;
	 
	 private int updatedby;
	 
	
	public Role(int roleid, String rolename, int employeid, Date date,
			int updatedby) {
		super();
		this.roleid = roleid;
		this.rolename = rolename;
		this.employeid = employeid;
		this.date = date;
		this.updatedby = updatedby;
	}

	public int getRoleid() {
		return roleid;
	}

	public void setRoleid(int roleid) {
		this.roleid = roleid;
	}

	public String getRolename() {
		return rolename;
	}

	public void setRolename(String rolename) {
		this.rolename = rolename;
	}

	public int getEmployeid() {
		return employeid;
	}

	public void setEmployeid(int employeid) {
		this.employeid = employeid;
	}

	@Override
	public String toString() {
		return "Role [roleid=" + roleid + ", rolename=" + rolename
				+ ", employeid=" + employeid + ", date=" + date
				+ ", updatedby=" + updatedby + "]";
	}

	 
	 
	 
}

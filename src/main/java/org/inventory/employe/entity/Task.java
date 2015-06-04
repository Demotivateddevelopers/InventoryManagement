package org.inventory.employe.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Task {
	

	@Id
	@GeneratedValue
	private int taskid;
	
	private String taskname;
	
	private String taskdescription;

	private int updatedby;
	
	private Date date;
	
	
	public int getTaskid() {
		return taskid;
	}

	public void setTaskid(int taskid) {
		this.taskid = taskid;
	}

	public String getTaskname() {
		return taskname;
	}

	public void setTaskname(String taskname) {
		this.taskname = taskname;
	}

	public String getTaskdescription() {
		return taskdescription;
	}

	public void setTaskdescription(String taskdescription) {
		this.taskdescription = taskdescription;
	}

	@Override
	public String toString() {
		return "Task [taskid=" + taskid + ", taskname=" + taskname
				+ ", taskdescription=" + taskdescription + ", updatedby="
				+ updatedby + ", date=" + date + "]";
	}

	public Task(int taskid, String taskname, String taskdescription,
			int updatedby, Date date) {
		super();
		this.taskid = taskid;
		this.taskname = taskname;
		this.taskdescription = taskdescription;
		this.updatedby = updatedby;
		this.date = date;
	}

	
	
}

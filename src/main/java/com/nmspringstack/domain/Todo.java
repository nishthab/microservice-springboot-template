package com.nmspringstack.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "rsmortgage_todo")
public class Todo {
	@Id
	@GeneratedValue()
	private long id;
	@Column(nullable = false)
	private String taskName;
	
	@Column(nullable = false)
	private String taskDescription;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "dob", unique = false, nullable = false, length = 10)
	private Date dateOfTask;
	
	@Column(nullable = false)
	private int age;
	
	
	
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getTaskName() {
		return taskName;
	}


	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}


	public String getTaskDescription() {
		return taskDescription;
	}


	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}


	public Date getDateOfTask() {
		return dateOfTask;
	}


	public void setDateOfTask(Date dateOfTask) {
		this.dateOfTask = dateOfTask;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public Todo(long id, String taskName, String taskDescription, Date dateOfTask, int age) {
		super();
		this.id = id;
		this.taskName = taskName;
		this.taskDescription = taskDescription;
		this.dateOfTask = dateOfTask;
		this.age = age;
	}


	public Todo() {
		super();
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((dateOfTask == null) ? 0 : dateOfTask.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((taskDescription == null) ? 0 : taskDescription.hashCode());
		result = prime * result + ((taskName == null) ? 0 : taskName.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Todo other = (Todo) obj;
		if (age != other.age)
			return false;
		if (dateOfTask == null) {
			if (other.dateOfTask != null)
				return false;
		} else if (!dateOfTask.equals(other.dateOfTask))
			return false;
		if (id != other.id)
			return false;
		if (taskDescription == null) {
			if (other.taskDescription != null)
				return false;
		} else if (!taskDescription.equals(other.taskDescription))
			return false;
		if (taskName == null) {
			if (other.taskName != null)
				return false;
		} else if (!taskName.equals(other.taskName))
			return false;
		return true;
	}

	

	

	
	
	
	
}

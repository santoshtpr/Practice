package com.santoshtpr.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Teacher {
	@Id
	@GeneratedValue
	private int teacherId;
	private String teacherName;
	private int experience;
	private String subject;
	private double salary;
	private String workLocation;
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Teacher(int teacherId, String teacherName, int experience, String subject, double salary,
			String workLocation) {
		super();
		this.teacherId = teacherId;
		this.teacherName = teacherName;
		this.experience = experience;
		this.subject = subject;
		this.salary = salary;
		this.workLocation = workLocation;
	}

	@Override
	public String toString() {
		return "Teacher [teacherId=" + teacherId + ", teacherName=" + teacherName + ", experience=" + experience
				+ ", subject=" + subject + ", Salary=" + salary + ", workLocation=" + workLocation + "]";
	}
	public int getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getWorkLocation() {
		return workLocation;
	}
	public void setWorkLocation(String workLocation) {
		this.workLocation = workLocation;
	}
	
	

}

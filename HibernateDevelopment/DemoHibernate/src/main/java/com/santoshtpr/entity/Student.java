package com.santoshtpr.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Student {
@Id
@GeneratedValue
private int studentId;
private String studentName;
private int classId;
@ManyToOne
private Teacher classTeacher;
public Student(int studentId, String studentName, int classId, Teacher classTeacher) {
	super();
	this.studentId = studentId;
	this.studentName = studentName;
	this.classId = classId;
	this.classTeacher = classTeacher;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public int getStudentId() {
	return studentId;
}
public void setStudentId(int studentId) {
	this.studentId = studentId;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public int getClassId() {
	return classId;
}
public void setClassId(int classId) {
	this.classId = classId;
}
public Teacher getClassTeacher() {
	return classTeacher;
}
public void setClassTeacher(Teacher classTeacher) {
	this.classTeacher = classTeacher;
}


}

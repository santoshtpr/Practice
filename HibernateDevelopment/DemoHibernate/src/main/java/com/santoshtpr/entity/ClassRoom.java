package com.santoshtpr.entity;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class ClassRoom {
@Id
@GeneratedValue
private int classId;
@OneToOne
private Teacher teacher;
@OneToMany
private List<Student> students;
@OneToOne
private Student monitor;

public ClassRoom() {
	super();
	// TODO Auto-generated constructor stub
}

public ClassRoom(int classId, Teacher teacher, List<Student> students, Student monitor) {
	super();
	this.classId = classId;
	this.teacher = teacher;
	this.students = students;
	this.monitor = monitor;
}

public int getClassId() {
	return classId;
}

public void setClassId(int classId) {
	this.classId = classId;
}

public Teacher getTeacher() {
	return teacher;
}

public void setTeacher(Teacher teacher) {
	this.teacher = teacher;
}

public List<Student> getStudents() {
	return students;
}

public void setStudents(List<Student> students) {
	this.students = students;
}

public Student getMonitor() {
	return monitor;
}

public void setMonitor(Student monitor) {
	this.monitor = monitor;
}

}

package com.santoshtpr.DemoHibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.santoshtpr.entity.ClassRoom;
import com.santoshtpr.entity.Student;
import com.santoshtpr.entity.Teacher;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration();
    	cfg.configure("resources/hibernate.cfg.xml");
    	SessionFactory sf = cfg.buildSessionFactory();
    	Session s = sf.openSession();
    	Transaction tx = s.beginTransaction();
    	
    	Teacher teacher1 = new Teacher(1001, "Krishna",5, "English", 5000.00, "Hyderabad");
    	
    	Student student1 = new Student(101, "Santosh", 123, null);
    	Student student2 = new Student(102, "Suresh", 123, null);
    	Student student3 = new Student(103, "Sudhir", 123, null);
    	student1.setClassTeacher(teacher1);
    	student2.setClassTeacher(teacher1);
    	student3.setClassTeacher(teacher1);
    	s.save(teacher1);
    	s.save(student3);
    	s.save(student2);
    	s.save(student1);
    	List<Student> students = new ArrayList<Student>();
    	students.add(student1);
    	students.add(student2);
    	students.add(student3);
    	

    	ClassRoom cr = new ClassRoom(123, teacher1, students, student3);
    	s.save(cr); 	
    	
    	tx.commit();
    	s.close();
    	sf.close();
    }
}

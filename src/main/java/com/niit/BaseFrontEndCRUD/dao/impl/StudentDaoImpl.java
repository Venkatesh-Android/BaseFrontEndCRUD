package com.niit.BaseFrontEndCRUD.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.BaseFrontEndCRUD.dao.StudentDAO;
import com.niit.BaseFrontEndCRUD.model.Student;

@Repository
public class StudentDaoImpl implements StudentDAO {

	@Autowired
	private SessionFactory session;
	

	public void add (Student student) {
		session.getCurrentSession().save(student);

	}


	public void edit (Student student) {
		session.getCurrentSession().update(student);

	}


	public void delete (int studentID) {
		session.getCurrentSession().delete(getStudent(studentID));

	}


	public Student getStudent (int studentId) {
		
		return (Student)session.getCurrentSession().get(Student.class, studentId);
	}


	public List getAllStudent () {
	
		return session.getCurrentSession().createQuery("from Student").list();
	}

}

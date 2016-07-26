package com.niit.BaseFrontEndCRUD.dao;

import java.util.List;

import com.niit.BaseFrontEndCRUD.model.Student;

public interface StudentDAO {
	public void add (Student student);
	public void edit (Student student);
	public void delete (int studentID);
	public Student getStudent (int studentID);
	public List getAllStudent ();
	
	
}

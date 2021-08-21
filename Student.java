package org.student;

import org.collage.Collage;


public class Student extends Collage{
	
	public void StudentName() {
		// TODO Auto-generated method stub
System.out.println("Student Name : Bouvanesswary ");
	}
	
	public void StudentDept() {
		// TODO Auto-generated method stub
		System.out.println("Student Dept : CSE ");

	}
	
	public void StudentId() {
		// TODO Auto-generated method stub
		System.out.println("Student ID : 51380501 ");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stud=new Student();
		stud.StudentName();
		stud.StudentDept();
		stud.StudentId();
		stud.CollegeName();
		stud.CollegeCode();
		stud.CollegeRank();
		stud.DeptName();
	}

}

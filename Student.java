package org.student;

import org.department.*;
public class Student extends Department
{

	public static void main(String[] args) 
	{
		Student stu=new Student();
		stu.collegeName();
		stu.collegeCode();
		stu.collegeRank();
		stu.deptName();
		stu.studentName();
		stu.studentId();
		stu.studentDept();

	}
	public void studentName() 
	{
		System.out.println("Stuent Name is: ...");
	}
	public void studentDept() 
	{
		System.out.println("Student Department is: ...");
	}
	public void studentId()   
	{
		System.out.println("Student ID is: ...");
	}


}

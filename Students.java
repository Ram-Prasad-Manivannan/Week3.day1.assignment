package org.system;

public class Students 
{

	public static void main(String[] args) 
	{
	Students stu1=new Students();
	stu1.getStudentInfo(1);
	stu1.getStudentInfo(1, null);
	stu1.getStudentInfo(null, 0);

	}
	public void getStudentInfo(int id)
	{
		System.out.println("ID of the student is:"+id);
	}
	public void getStudentInfo(int id, String name)
	{
		System.out.println("ID of the Student is :"+id);
		System.out.println("Name of the Student is :"+name);
	}
	public void getStudentInfo(String email_id,long phone_number)
	{
		System.out.println("E-mail ID of the Student is:"+email_id);
		System.out.println("Phone Number of the Student is:"+phone_number);
	}
	
	

}

package org.system;

public class Axis extends BankingInfo 
{

	public static void main(String[] args) 
	{
		Axis ax=new Axis();
		ax.deposit();

	}
	public void deposit()
	{
		System.out.println("Over rided deposit from Axis...");
	}
	

}

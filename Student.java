package Student_Managment_System;

public class Student extends Person {

	private int studid;
	private String cource;
	
	public void  setStudentDetails( int studid, String cource)
	{
		
		this.studid=studid;
		this.cource=cource;
	}
	public void showStudentDetails()
	{
		showDetails();
      System.out.println("\t Student Id : "+studid+"\tCource : "+cource);
	}
}

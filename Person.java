package Student_Managment_System;

public class Person {

	private String name;
	private int age;
	
	public void setDetails(String name, int age)
	{
		this.name=name;
		this.age=age;
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public void showDetails()
	{
		System.out.println(" Name : "+name+"\t Age : "+age);
	}
}

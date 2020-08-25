package javademo;

import java.io.Serializable;

public class Employee implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int Id;
	String name;
	double salary;
	int ssn;
	
	Employee(int Id,String name, double salary, int ssn)
	{
		this.Id=Id;
		this.name=name;
		this.salary=salary;
		this.ssn=ssn;
	}
	

}

//4

package com.pra_practice;
import java.util.*;

class Student{
	
	private int id ;
	private String name;
	private int contactNo;
	private String address;
	private int pincode;
	
	public Student(int id, String name,int contactNo, String address, int pincode)
	{
		this.id = id;
		this.name = name;
		this.contactNo = contactNo;
		this.address = address;
		this.pincode = pincode;
	}
	
	public int getId()
	{
		return this.id;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public int getContactNo()
	{
		return this.contactNo;
	}
	
	public String getAddress()
	{
		return this.address;
	}
	public int getPincode()
	{
		return this.pincode;
	}
	
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setContactNo(int contactNo)
	{
		this.contactNo = contactNo;
	}
	
	public void setAddress(String address)
	{
		this.address = address;
	}
	
	public void setPincode(int pincode)
	{
		this.pincode = pincode;
	}
	
	public static Student FindCollegeWithMaxPinCode(ArrayList<Student> students)
	{
		int max = 0;
		Student std1 = null;
		
		for(Student std : students)
		{
			if(std.pincode > max)
			{
				max = std.getPincode();
				std1 = std;
			}
		}
		return std1;
	}
	
	
	public static Student searchCollegeByAddress(ArrayList<Student> students, String address)
	{
		Student stdR = null;
		for(Student std : students)
		{
			String add2 = std.getAddress();
			if(address.equalsIgnoreCase(add2))
			{
				stdR = std;
			}
		}
		return stdR;
	}
}

public class CollegeMain{
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		
		ArrayList<Student> students = new ArrayList<>();
		
		for(int i=0; i<n; i++)
		{
			int id = sc.nextInt();
			sc.nextLine();
			String name = sc.nextLine();
			int contactno = sc.nextInt();
			sc.nextLine();
			String add = sc.nextLine();
			int pin = sc.nextInt();
			sc.nextLine();
			
			Student std = new Student(id,name,contactno,add,pin);
			students.add(std);
		}
		
		String inpput_address = sc.nextLine();
		
		//task1 
		
		Student std = Student.FindCollegeWithMaxPinCode(students);
		if(std==null)
		{
			System.out.println("Null");
		}
		else
		{
			System.out.println(std.getName() + " "+ std.getId() + " ");
		}
		
		//task 2
		
		
		Student std2 = Student.searchCollegeByAddress(students, inpput_address);
		if(std2==null)
		{
			System.out.println("Null");
		}
		else
		{
			System.out.println(std.getName() + " "+ std.getId() + " ");
		}
	}
}

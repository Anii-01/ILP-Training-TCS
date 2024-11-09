//10

package com.pra_practice;
import java.util.*;

class Employee{
	
	int empId;
	String name;
	String branch;
	double rating;
	boolean company_transport;
	
	public Employee(int empId,String name,String branch,double rating,boolean company_transport)
	{
		this.empId = empId;
		this.name = name;
		this.branch = branch;
		this.rating = rating;
		this.company_transport = company_transport;
	}
	
	public double getRating()
	{
		return this.rating;
	}
	
	public static int count_company_transport(ArrayList<Employee>emps,String ibranch)
	{
		int count = 0;
		for(Employee emp : emps)
		{
			if((emp.branch).equals(ibranch) && (emp.company_transport))
			{
				count ++;
			}
		}
		return count;
	}
	
	public static Employee highestRating(ArrayList<Employee>emps)
	{
		ArrayList<Employee>newlist = new ArrayList<>();
		
		for(Employee emp : emps)
		{
			if((!emp.company_transport))
			{
				newlist.add(emp);
			}
		}
		
		newlist.sort(Comparator.comparing(Employee:: getRating));
		return newlist.get(newlist.size()-2);
		
	}
}


public class PRA10 {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		
		ArrayList<Employee> emps = new ArrayList<>();
		for(int i=0; i<n; i++)
		{
			
			int empId = sc.nextInt();
			sc.nextLine();
			String name = sc.nextLine();
			String branch = sc.nextLine();
			double rating = sc.nextDouble();
			boolean company_transport = sc.nextBoolean();
			
			Employee emp = new Employee(empId,name,branch,rating,company_transport);
			emps.add(emp);
			
		}
		
		sc.nextLine();
		String inp_branch = sc.nextLine();
		int count = Employee.count_company_transport(emps, inp_branch);
		System.out.println(count);
		
		Employee obj = Employee.highestRating(emps);
		System.out.println(obj.name +" "+obj.empId);
	}

}

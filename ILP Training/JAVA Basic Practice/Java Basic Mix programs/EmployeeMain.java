//PRA - practice arraylist..object

import java.util.*;

class Employee{
    
    int empId ;
    String empName;
    double empSalary;
    
    public Employee(int empId, String empName, double empSalary)
    {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
    }
    
    public int getId()
    {
        return this.empId;
    }
    public String getName()
    {
        return this.empName;
    }
    public double getSalary()
    {
        return this.empSalary;
    }
    
    public void setId(int empId)
    {
        this.empId = empId;
    }
    
    public void setName(String empName)
    {
        this.empName = empName;
    }
    
    public void setSalary(double empSalary)
    {
        this.empSalary = empSalary;
    }
    
    public String toString()
    {
        return "Employee[empId="+empId+",empName="+empName+",empSalary="+empSalary+"]";
    }
}

public class EmployeeMain
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		
		Scanner sc = new Scanner(System.in);
        System.out.println("How many employee :-");
		int n = sc.nextInt();
		sc.nextLine();
		ArrayList<Employee> emplist = new ArrayList<Employee>();
		//System.out.println(emplist.size());
		
		for(int i=0; i<n;i++)
		{
		    int a = sc.nextInt();
		    sc.nextLine();
		    String b = sc.nextLine();
		    double c = sc.nextDouble();
		    
		   Employee obj = new Employee(a,b,c);
		   emplist.add(obj);
		}
		
		for(Employee emp : emplist)
		{
		    System.out.println(emp.getId()+" "+emp.getName()+" "+emp.getSalary());
		}
		
	
// 		double max_salary = 0;
// 		double s = emplist.get(0).getSalary();
// 		for(int i=0; i<emplist.size();i++)
// 		{
// 		    s = emplist.get(i).getSalary();
// 		    if(s > max_salary)
// 		    {
// 		        max_salary = s;
// 		    }
// 		    //System.out.println(s);
// 		}
// 		System.out.println(s);
		
		double max_salary = 0;
		Employee a = emplist.get(0);
		for (Employee emp : emplist)
		{
		    if(emp.getSalary() > max_salary)
		    {
		        max_salary = emp.getSalary();
		        a = emp;
		    }
		}
		System.out.println(max_salary);
		System.out.println(a);
		System.out.println(a.getName());
		
		//------ sorting
		System.out.println("Before sorting by salary..:"+emplist);
		Collections.sort(emplist,new Comparator<Employee>(){
		    public int compare(Employee e1, Employee e2)
		    {
		        return Double.compare(e1.getSalary(),e2.getSalary());
		    }
		});
		System.out.println("After sorting by salary..:"+emplist);
		//System.out.println(emplist.get(0));
		//System.out.println(emplist.get(1));
		
		for(Employee emp : emplist)
		{
		    System.out.println(emp.getId()+" "+emp.getName()+" "+emp.getSalary());
		}
	}
}
// Question : 3

package com.pra_practice;

import java.util.*;

class Student2
{
	private int rollNo ;
	private String name ;
	private String branch;
	private double score;
	private boolean dayScholar;
	
	
	public Student2(int rollNo , String name , String branch , double score , boolean dayScholar)
	{
		this.rollNo = rollNo;
		this.name = name;
		this.branch = branch;
		this.score = score;
		this.dayScholar = dayScholar;
	}
	
	public int getRollNo()
	{
		return this.rollNo;
	}
	
	public String getName()
	{
		return this.name;
	}
	public String getBranch()
	{
		return this.branch;
	}
	public double getScore()
	{
		return this.score;
	}
	public boolean dayScholar()
	{
		return this.dayScholar;
	}
	
	public void setRollNo(int rollNo)
	{
		this.rollNo = rollNo;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	public void setBranch(String branch)
	{
		this.branch = branch;
	}
	
	public void setScore(double score)
	{
		this.score = score;
	}
	
	public void setDayScholar(boolean dayScholar)
	{
		this.dayScholar = dayScholar;
	}
	
	public static int findDayScholar(ArrayList<Student2>students)
	{
		int iCnt = 0;
		for(Student2 std : students)
		{
			if((std.dayScholar() == true) && (std.getScore() > 80))
			{
				iCnt++;
			}
		}
		return iCnt;
	}
	
//	public static Student findSecondHighest(ArrayList<Student>students)
//	{
//		if(students.size() >= 2)
//		{
//			Student res = null;
//			Student std = students.get(0);
//			double firstmax = std.getScore();
//			
//			Student std1 = students.get(1);
//			double secondmax = std1.getScore();
//			
//			for(Student stds : students)
//			{
//				if((stds.getScore() > 80) && (!stds.dayScholar()))
//				{
//					if((stds.getScore() > firstmax) && (stds.getScore() < secondmax))
//					{
//						secondmax = stds.getScore();
//						res = stds;
//					}
//							
//				}
//			}
//			return res;
//		}
//		else
//		{
//			Student std = students.get(0);
//			double firstmax = std.getScore();
//			
//			Student std1 = students.get(1);
//			double secondmax = std1.getScore();
//			
//			if(firstmax > secondmax)
//			{
//				return std1;
//			}
//			else
//			{
//				return std;
//			}
//		}
//	}
	
	public static Student2 findSecondHighest(ArrayList<Student2>students)
	{
		
		ArrayList<Student2> studentsWithNoScholar = new ArrayList<>();
		for(Student2 std : students)
		{
			if(!std.dayScholar())
			{
				studentsWithNoScholar.add(std);
			}
		}
		
		//Collections.sort(list);
		studentsWithNoScholar.sort(Comparator.comparing(Student2 :: getScore));
	
		int sizee = studentsWithNoScholar.size();
		Student2 stdd = studentsWithNoScholar.get(sizee-2);
		return stdd;
		
//		int n = studentsWithNoScholar.size()-2;
//		return studentsWithNoScholar.get(n);
		
	}
}


public class StudentMain {
	
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		
		ArrayList<Student2> students = new ArrayList<Student2>();
		
		for(int i =0; i<n; i++)
		{
			int rollNo = sc.nextInt();
			sc.nextLine();
			String name = sc.nextLine();
			String branch = sc.nextLine();
			double score = sc.nextDouble();
			boolean dayScholar = sc.nextBoolean();
			
			Student2 std = new Student2(rollNo,name,branch,score, dayScholar);
			students.add(std);
		}	
		
		//1st task
		int fRes = Student2.findDayScholar(students);
		if(fRes == 0)
		{
			System.out.println("No student Found!!");
		}
		else
		{
			System.out.println("Count is: "+fRes);
		}
		
		//2nd task
		Student2 res = Student2.findSecondHighest(students);
		if(res == null)
		{
			System.out.println("No...");
		}
		else
		{
			System.out.println(res);
			System.out.println(res.getName()+res.getRollNo());
		}
		
	}
}
 
//
//4
//1001
//ashwa
//it
//85
//true
//1002
//preeti
//it
//70
//false
//1003
//pooma
//ece
//85
//false
//1004
//aksh
//eee
//90
//true
//Count is: 2
//Student@6d311334

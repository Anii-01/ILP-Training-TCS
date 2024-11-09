//6

package com.pra_practice;
import java.util.*;

class RPT
{
	int ticketNo ;
	String raisedBy;
	String assignedTo ;
	int priority;
	String project;
	
	public RPT(int ticketNo, String raisedBy, String assignedTo, int priority, String project)
	{
		this.ticketNo = ticketNo;
		this.raisedBy = raisedBy;
		this.assignedTo = assignedTo;
		this.priority = priority;
		this.project = project;
	}
	
	public int getPriority()
	{
		return this.priority;
	}
	
	
	//logic 1
//	public static RPT getHighestPriorityTicket(ArrayList<RPT> rpts , String str)
//	{
//		//RPT fobj= rpts.get(0);
//		int pri = rpts.get(0).priority;
//		RPT res_obj = null;
//		
//		for(RPT obj : rpts)
//		{
//			if((obj.priority < pri) && str.equalsIgnoreCase(obj.project))
//			{
//				pri = obj.priority;
//				res_obj = obj;
//			}
//		}
//		return res_obj;
//	}
	
	
	//logic 2 
	public static RPT getHighestPriorityTicket(ArrayList<RPT> rpts , String str)
	{
		int pri = rpts.get(0).priority;
		ArrayList <RPT> newrpts = new ArrayList<>();
		for(RPT obj : rpts)
		{
			if((obj.priority < pri) && str.equalsIgnoreCase(obj.project))
			{
				newrpts.add(obj);
			}
		}
		
		newrpts.sort(Comparator.comparing(RPT::getPriority));
		if(newrpts.size() == 0)
		{
			return null;
		}
		
		return newrpts.get(0);
	}
	
}



public class RptMain {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		ArrayList<RPT> rpts = new ArrayList<>();
		
		for(int i=0; i<n; i++)
		{
			int ticketNo  = sc.nextInt();
			sc.nextLine();
			String raisedBy = sc.nextLine();
			String assignedTo = sc.nextLine();
			int priority = sc.nextInt();
			sc.nextLine();
			String project = sc.nextLine();
			
			RPT obj = new RPT(ticketNo,raisedBy,assignedTo,priority,project);
			rpts.add(obj);
		}
		
		String str = sc.nextLine();
		
		RPT obj = RPT.getHighestPriorityTicket(rpts, str);
		if(obj == null)
		{
			System.out.println("Null");
		}
		else
		{
			System.out.println(obj.ticketNo + " " + obj.raisedBy + " " + obj.assignedTo );
		}
		
	}
}


//
//4
//123
//velantish
//mani
//3
//xperience
//234
//sathish
//akshaya
//1
//aig
//345
//john
//jack
//2
//aig
//256
//bhivi
//jack
//5
//aig
//aig
//234 sathish akshaya
//

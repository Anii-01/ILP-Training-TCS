//7

package com.pra_practice;
import java.util.*;

class SIM
{
	int simId;
	String customerName;
	double balance;
	double ratePerSecond ;
	String circle;
	
	public SIM(int simId, String customerName, double balance,double ratePerSecond,String circle)
	{
		this.simId = simId;
		this.customerName =customerName;
		this.balance = balance;
		this.ratePerSecond = ratePerSecond;
		this.circle = circle;
	}
	
	public double getRatePerSecond()
	{
		return this.ratePerSecond;
	}
	
	public static ArrayList<SIM> transferCustomerCircle(ArrayList<SIM> sims,String circle1,String newcircle2)
	{
		ArrayList<SIM> newsims = new ArrayList<>();
		
		for(SIM obj : sims)
		{
			
			if(obj.circle.equals(circle1))
			{
				obj.circle = newcircle2;
				newsims.add(obj);
			}
		}
		
		//logic 2 
		newsims.sort(Comparator.comparing(SIM ::getRatePerSecond).reversed());
		
		//logic 1 
		//newsims.sort(Comparator.comparing(SIM ::getRatePerSecond));
		
		//ArrayList<SIM> newsims2 = new ArrayList<>();
		//newsims2.sort(Comparator.reverseOrder());
		
//		for(int i=newsims.size()-1,j=0; (i>=0) && (j<newsims.size()); i--,j++)
//		{
//			 
//					SIM obj = newsims.get(i);
		
//					newsims2.add(obj);
//		}
		
		return newsims;
	}
}

public class SimMain {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		ArrayList<SIM> sims = new ArrayList<>();
		
		for(int i=0; i<n; i++)
		{
			int id = sc.nextInt();
			sc.nextLine();
			String customerName = sc.nextLine();
			double balance = sc.nextDouble();
			double ratePerSecond = sc.nextDouble();
			sc.nextLine();
			String circle = sc.nextLine();
			
			SIM obj = new SIM(id,customerName, balance, ratePerSecond, circle);
			sims.add(obj);
		}
		
		String circle1 = sc.nextLine();
		String newcircle2 = sc.nextLine();
		
		ArrayList<SIM> objs = SIM.transferCustomerCircle(sims, circle1, newcircle2);
		
		for(SIM obj : objs)
		{
			System.out.println(obj.balance + " "+ obj.customerName + " " + obj.circle);
		}
	}
}


//
//5
//1
//raj
//100
//1.5
//kol
//2
//chetan
//200
//1.6
//ahd
//3
//asha
//150
//1.7
//mum
//4
//kiran
//50
//2.2
//ahd
//5
//vijay
//130
//1.8
//ahd
//ahd
//kol


//50.0 kiran kol
//130.0 vijay kol
//200.0 chetan kol

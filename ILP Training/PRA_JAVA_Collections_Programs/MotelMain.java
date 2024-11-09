//5

package com.pra_practice;

import java.util.*;


class Motel
{
	int motelId;
	String motelName;
	String dateOfBooking;
	int noOfRoomsBooked ;
	String cabFacility;
	double totalBill;
	
	public Motel(int motelID, String motelName , String dateOfBooking, int noOfRoomsBooked, String cabFacility, double totalBill)
	{
		this.motelId = motelId;
		this.motelName = motelName;
		this.dateOfBooking = dateOfBooking;
		this.noOfRoomsBooked = noOfRoomsBooked;
		this.cabFacility = cabFacility;
		this.totalBill = totalBill;
	}
	
	public static int totalNoOfRoomsBooked(ArrayList<Motel>motels,String str)
	{
		int count = 0;
		for(Motel obj : motels)
		{
			if(obj.cabFacility.equalsIgnoreCase(str) && obj.noOfRoomsBooked > 5)
			{
				count = count + obj.noOfRoomsBooked;
			}
		}
		return count;
	}
}
public class MotelMain {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		ArrayList<Motel> motels = new ArrayList<>();
		for(int i=0; i<n; i++)
		{
			int id = sc.nextInt();
			sc.nextLine();
			String name = sc.nextLine();
			String date = sc.nextLine();
			int rooms = sc.nextInt();
			sc.nextLine();
			String cab = sc.nextLine();
			double bill = sc.nextDouble();
			sc.nextLine();
			
			Motel obj = new Motel(id,name,date,rooms,cab,bill);
			motels.add(obj);
		}
		
		String str = sc.nextLine();
		int res = Motel.totalNoOfRoomsBooked(motels, str);
		if(res == 0)
		{
			System.out.println("No");
		}
		else
		{
			System.out.println(res);
		}
	}
}

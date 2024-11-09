//8

package com.pra_practice;

import java.util.*;

class Hotel
{
	int hotelId ;
	String hotelName ;
	String dateOfBooking ;
	int noOfRoomsBooked ;
	String wifiFacility ;
	double totalBill ;
	
	public Hotel(int hotelId ,String hotelName,String dateOfBooking,int noOfRoomsBooked,String wifiFacility,double totalBill)
	{
		this.hotelId = hotelId;
		this.hotelName = hotelName;
		this.dateOfBooking = dateOfBooking;
		this.noOfRoomsBooked = noOfRoomsBooked;
		this.wifiFacility = wifiFacility;
		this.totalBill = totalBill;
	}
	
	//task 1
	public static int noOfRoomsBookedGivenMonth(ArrayList<Hotel>hotels, String month)
	{
		int count =0;
		for(Hotel ht : hotels)
		{
			if(ht.dateOfBooking.contains(month))
			{
				count = count + ht.noOfRoomsBooked;
			}
		}
		return count;
	}
	
	//task 2
	public static Hotel searchHotelByWifi(ArrayList<Hotel>hotels, String str)
	{
		ArrayList<Hotel> newlist = new ArrayList<>();
		for(Hotel ht : hotels)
		{
			if((ht.wifiFacility).equalsIgnoreCase(str))
			{
				newlist.add(ht);
			}
		}
		
		double maxBill = hotels.get(0).totalBill;
		Hotel maxObjBill = null;
		for(Hotel ht : hotels)
		{
			if(ht.totalBill > maxBill)
			{
				maxBill = ht.totalBill;
				maxObjBill = ht;
			}
		}
		return maxObjBill;
	}
}

public class HotelMain {
	
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		ArrayList<Hotel> hotels = new ArrayList<>();
		for(int i=0; i<n; i++)
		{
			int hotelId = sc.nextInt();
			sc.nextLine();
			String hotelName = sc.nextLine();
			String dateOfBooking = sc.nextLine();
			int noOfRoomsBooked = sc.nextInt();
			sc.nextLine();
			String wifiFacility = sc.nextLine();
			double totalBill  = sc.nextDouble();
			sc.nextLine();
			
			Hotel obj = new Hotel(hotelId,hotelName,dateOfBooking,noOfRoomsBooked,wifiFacility,totalBill);
			hotels.add(obj);
		}
		
		
		String str1 = sc.nextLine();
		int res = Hotel.noOfRoomsBookedGivenMonth(hotels,str1);
		System.out.println("count- "+res);
		
		
		
		String str2 = sc.nextLine();
		Hotel obj2 = Hotel.searchHotelByWifi(hotels,str2);
		if(obj2 == null)
		{
			System.out.println("NULL");
		}
		else
		{
			System.out.println(obj2.hotelName + " " + obj2.hotelId);
		}
	
		
		
	}
}

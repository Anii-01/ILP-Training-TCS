package com.pra_practice;
import java.util.*;


class Book
{
	int id ;
	int pages;
	String title;
	String author;
	double price;
	
	public Book(int id, int pages, String title, String author, double price)
	{
		this.id = id ;
		this.pages = pages;
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public double getPrice()
	{
		return this.price;
	}
	
	public static ArrayList<Book> findBookWithMaxPrice(ArrayList<Book> books)
	{
		//step 1 : find max
		double max = 0;
		for(Book bk : books)
		{
			if(bk.price > max)
			{
				max = bk.price;
			}
		}
	
		//books.sort(Comparator.comparing(Book :: getPrice));
		
		//step 2 : add all max into new list
		ArrayList<Book> maxlist = new ArrayList<>();
		for(Book b : books)
		{
			if(b.price == max)
			{
				maxlist.add(b);
			}
		}
		return maxlist;
	}
	
	public static Book findBookByTitle(ArrayList<Book> books, String title)
	{
		for(Book bk : books)
		{
			if(bk.title.equalsIgnoreCase(title))
			{
				return bk;
			}
		}
		return null;
	}
}

public class BookMain {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		
		ArrayList<Book> books = new ArrayList<>();
		for(int i=0; i<n; i++)
		{
			int id = sc.nextInt();
			sc.nextLine();
			int pages = sc.nextInt();
			sc.nextLine();
			String title = sc.nextLine();
			String author = sc.nextLine();
			double price = sc.nextDouble();
			
			Book bk = new Book(id,pages,title,author,price);
			books.add(bk);
		}
		
		sc.nextLine();
		String title = sc.nextLine();
		
		//1
		ArrayList<Book> res = Book.findBookWithMaxPrice(books);
		//2
		Book searchRes = Book.findBookByTitle(books,title);
		
		for(Book bk : res)
		{
			System.out.println(bk.id + " "+bk.title);
		}
		
		
		if(searchRes == null)
		{
			System.out.println("No Books");
		}
		else
		{
			System.out.println(searchRes.id + "\n" + searchRes.pages);
		}
	}
}

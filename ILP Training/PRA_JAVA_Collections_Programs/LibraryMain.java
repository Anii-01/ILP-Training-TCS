package com.pra_practice;
import java.util.*;

public class LibraryMain {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		ArrayList<Library> libraries = new ArrayList<>();
		for(int i=0; i<n; i++)
		{
			int id = sc.nextInt();
			sc.nextLine();
			String name = sc.nextLine();
			String location = sc.nextLine();
			
			ArrayList<Book2> books = new ArrayList<>();
			int no_of_books = sc.nextInt();
			sc.nextLine();
			for(int j=0; j<no_of_books; j++)
			{
				int bid = sc.nextInt();
				sc.nextLine();
				String title = sc.nextLine();
				String author = sc.nextLine();
				
				Book2 bk = new Book2(bid,title,author);
				books.add(bk);
				
			}
			Library lb = new Library(id,name,location,books);
			libraries.add(lb);
		}
		
		int id = sc.nextInt();
		displayBookByLId(libraries,id);
	}
	
	//task 1
	public static void displayBookByLId(ArrayList<Library>libraries,int iid)
	{
		for(Library lb: libraries)
		{
			if(lb.id == iid)
			{
				for(Book2 bk : lb.books)
				{
					System.out.print(bk.bid + " " + bk.author + " " + bk.title);
				}
			}
		}
	}
	
}


class Library
{
	int id;
	String name;
	String location;
	
	ArrayList<Book2> books;
	
	public Library(int id,String name,String location,ArrayList<Book2> books)
	{
		this.id = id;
		this.name = name;
		this.location = location;
		this.books = books;
	}
}

class Book2
{
	int bid;
	String title;
	String author;
	
	public Book2(int bid,String title,String author){
		this.bid = bid;
		this.title = title;
		this.author = author;
	}
}

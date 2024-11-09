import java.util.*;                                                 

public class LibraryManagement
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        ArrayList<Library> libraries = new ArrayList<>();

        int n = sc.nextInt();
        sc.nextLine();

        for(int i=0; i<n; i++)
        {
            int libId = sc.nextInt();
            sc.nextLine();
            String libName = sc.nextLine();
            String location = sc.nextLine();

            int noOfBooks = sc.nextInt();

            ArrayList<Book> books = new ArrayList<>();
            for(int j=0; j<noOfBooks; j++)
            {
                int bookId = sc.nextInt();
                sc.nextLine();
                String title = sc.nextLine();
                String author = sc.nextLine();

                Book bk = new Book(bookId,title,author);
                //bk.addBook(bk);
                books.add(bk);
            }

            Library obj = new Library(libId, libName, location,books);

            libraries.add(obj);
        }

        // check 1
        //System.out.println(libraries);
        // for(Library lb : libraries)
        // {
        //     System.out.println(lb.libId + " "+ lb.libName + " "+ lb.location);
        //     //System.out.println(lb.books);

        //     for(Book bk : lb.books)
        //     {
        //         System.out.println(bk.bookId + " "+ bk.title+ " " + bk.author);
        //     }
        // }

        String author = sc.nextLine();
        String city = sc.nextLine();


        ArrayList<String> res = getBooksByAuthor(libraries,author);
        if(res.size() == 0)
        {
            System.out.println("No books for author");
        }
        else
        {
            for(String str : res)
            {
                System.out.println(str);
            }
        }


        ArrayList<String> res2 = getLibrariesByLocation(libraries,city);
        if(res2.size() ==0)
        {
            System.out.println("No library found");
        }
        else
        {
            for(String str : res2)
            {
                System.out.println(str);
            }

        }
    }

    //task 1
    public static ArrayList<String> getBooksByAuthor(ArrayList<Library> libraries , String author)
    {
        ArrayList<String> res = new ArrayList<>();

        for(Library lb : libraries)
        {
            for(Book bk : lb.books)
            {
                if(bk.author.equalsIgnoreCase(author))
                {
                    res.add(bk.title);
                }
            }
        }
        return res;
    }

    //task 2 
    public static ArrayList<String> getLibrariesByLocation(ArrayList<Library>libraries,String city)
    {
        ArrayList<String> cities = new ArrayList<>();
        for(Library lb : libraries)
        {
            if(lb.location.equalsIgnoreCase(city))
            {
                cities.add(lb.libName);
            }
        }
        return cities;
    }
}

class Book
{
    int bookId;
    String title;
    String author;

    //ArrayList<Book> books;

    public Book(int bookId,String title,String author)
    {
        this.bookId = bookId;
        this.title = title;
        this.author = author;

        //this.books = new ArrayList<>();
    }

    // public addBook(Book obj)
    // {
    //     books.add(obj);
    // }
}

class Library{

    int libId;
    String libName;
    String location;

    ArrayList<Book> books;

    public Library(int libId,String libName,String location,ArrayList<Book>books)
    {
        //super(bookId,title,author);
        this.libId = libId;
        this.libName = libName;
        this.location = location;

        this.books = books;  //help 1
    }

}
import java.util.*;

class Student{

    private int rollno;
    private String name;
    private String city;
    private double marks;

    public Student(int rollNo, String name, String city, double marks)
    {
        this.rollno = rollNo;
        this.name = name;
        this.city = city;
        this.marks = marks;
    }

    public int get_rollno()
    {
        return this.rollno;
    }
    public String get_name()
    {
        return this.name;
    }
    public String get_city()
    {
        return this.city;
    }
    public double get_marks()
    {
        return this.marks;
    }
}

public class PRA1{

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Student students[] = new Student[n];

        for(int i =0; i<students.length; i++)
        {
            int a = sc.nextInt();
            sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            double d = sc.nextDouble();
            sc.nextLine();

            students[i] = new Student(a,b,c,d);
        }

        Student obj = StudentWithMaxMarks(students);
        if(obj == null)
        {
            System.out.println("No records found!");
        }
        else
        {
            System.out.println("rollno-"+obj.get_rollno());
            System.out.println("name-"+obj.get_name());
            System.out.println("city-"+obj.get_city());
            System.out.println("marks-"+obj.get_marks());

        }
    }
    public static Student StudentWithMaxMarks(Student arr[])
        {
            if(arr.length == 0)
            {
                return null;
            }
            // double max = arr[0].get_marks();
            // int j = 0;
            // for(int i = 0; i<arr.length; i++)
            // {
            //     if((arr[i].get_marks()) > max)
            //     {
            //         max = arr[i].get_marks();
            //         j=i;
            //     }
            // }
            // return arr[j];

            double max = arr[0].get_marks();
            Student obj = arr[0];

            for(Student std : arr)
            {
                if(std.get_marks() > max)
                {
                    max = std.get_marks();
                    obj = std;
                }
            }
            return obj;
        }   

}

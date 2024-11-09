import java.util.*;

public class Test11 {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<student11> students = new ArrayList<>();

        for(int i=0; i<n; i++)
        {
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            String city = sc.nextLine();
            double hmarks = sc.nextDouble();

            student11 obj = new student11(id, name, city, hmarks);
            students.add(obj);
        }

        student11 std = findMaxMarksStudent(students);
        if(std == null){
            System.out.println("jsjhdkjk");
        }
        else{
            System.out.println("Id - "+std.id + " Name - " + std.name + " City -" + std.city + " marks -"+std.hmarks);
        }
    }

    // student with max marks
    public static student11 findMaxMarksStudent(ArrayList<student11> students)
    {
        double max = students.get(0).hmarks;
        student11 maxx = students.get(0);
        for(student11 std : students)
        {
            if(std.hmarks > max)
            {
                max = std.hmarks;
                maxx = std;
            }
        }

        return maxx;
    }
}


class student11
{
    int id ;
    String name ;
    String city;
    double hmarks;

    public student11(int id,String name,String city, double hmarks)
    {
        this.id = id;
        this.city = city;
        this.name = name;
        this.hmarks = hmarks;
    }
}

import java.util.*;

public class PRA1_SET2{

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //sc.nextLine();
        ArrayList <Student1> students = new ArrayList<>();
        for(int i=0; i<n; i++)
        {
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            String branch = sc.nextLine();
            int NoOfSub = sc.nextInt();
            sc.nextLine();

            ArrayList<Integer> marks  = new ArrayList<>();
            ArrayList<String> subjects = new ArrayList<>();

            for(int j=0; j<NoOfSub; j++)
            {
                String sub = sc.nextLine();
                int mark = sc.nextInt();
                sc.nextLine();
                subjects.add(sub);
                marks.add(mark);
                
            }
            Student1 std = new Student1(id,name,branch,students,subjects,marks);
            students.add(std);
        }

        PRA1_SET2.Display(students);
    }

    public static void Display(ArrayList<Student1> students)
    {
        for(Student1 std : students)
        {
            System.out.println(std.id+ " "+std.name+" "+std.branch+" " +std.marks+" "+std.subjects);
            System.out.println(std.subjects);
        }
    }
}

class Student1
{
    int id;
    String name;
    String branch;

    ArrayList<Integer> marks ;
    ArrayList<String> subjects ;

    public Student1(int id,String name,String branch,ArrayList<Student1>students , ArrayList<String> subjects,ArrayList<Integer> marks)
    {
        this.id = id;
        this.name = name;
        this.branch = branch;

        this.subjects = subjects;
        this.marks = marks;
    }
}

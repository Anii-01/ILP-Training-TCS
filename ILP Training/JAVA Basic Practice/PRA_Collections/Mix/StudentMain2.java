import java.util.*;

// classes with attributes and constructor
// dry run
// main method = with all inputs  , run 1  - error resolvation.
// dry run 
// method creation 


//
public class StudentMain2
{
    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        ArrayList<Subject2> students = new ArrayList<>();

        for(int i=0; i<n; i++)
        {
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            String collegeName = sc.nextLine();
            int NoOfSub = sc.nextInt();
            sc.nextLine();

            ArrayList<String> sub = new ArrayList<>();
            ArrayList<Integer> mark = new ArrayList<>();

            for(int j=0; j<NoOfSub; j++)
            {
                String sub_name = sc.nextLine();
                int sub_mark = sc.nextInt();
                sc.nextLine();

                sub.add(sub_name);
                mark.add(sub_mark);
            }

            Subject2 obj = new Subject2(id,name,collegeName,NoOfSub,sub,mark);

            students.add(obj);
        }

        int id = sc.nextInt();
        displayDistinctMarks(students,id);

        int threshold = sc.nextInt();
        student_with_avg_threshold(students,threshold);
    }

    //task 1
    public static void displayDistinctMarks(ArrayList<Subject2>students,int iid)
    {
        for(Subject2 st : students)
        {
            TreeSet<Integer> dm = new TreeSet<>();

            if(st.id == iid)
            {
                for(Integer dms : st.marks)
                {
                    dm.add(dms);
                }
            }

            for(Integer i : dm)
            {
                System.out.print(i+" ");
            }
        }
    }

    //task 2 
    public static void student_with_avg_threshold(ArrayList <Subject2> students,int threshold)
    {   
        ArrayList<Subject2> resuList = new ArrayList<>();

        for(Subject2 std : students)
        {
            int size = std.marks.size();

            int sum =0;
            for(int i=0; i<size; i++)
            {
                sum = sum + std.marks.get(i);
            }
            int avg = sum / size;

            if(avg > threshold)
            {
                resuList.add(std);
            }
        }

        for(Subject2 sb: resuList)
        {
            System.out.println(sb.name+" ");
        }
    }
}


//
class Student2{
    int id;
    String name ;
    String CollegeName;
    int NoOfSub;

    public Student2(int id,String name,String CollegeName,int NoOfSub)
    {
        this.id = id;
        this.name = name;
        this.CollegeName = CollegeName;
        this.NoOfSub = NoOfSub;
    }

}

class Subject2 extends Student2{

    ArrayList<String> subs = new ArrayList<String>();
    ArrayList<Integer> marks = new ArrayList<Integer>();

    public Subject2(int id,String name,String CollegeName,int NoOfSub,ArrayList<String>subs,ArrayList<Integer>marks)
    {
        super(id,name,CollegeName,NoOfSub);
        this.subs = subs;
        this.marks = marks;
    }
}

// 2 
// 111
// aniket
// pvpit
// 3
// a
// 30
// b
// 40
// c
// 50
// 222
// nilam
// jsmp
// 3
// aa
// 50
// bb
// 60
// cc
// 70
// 222
// 50 60 70 : 50
// nilam
// PS C:\Users\anike\Desktop\TCS\PRA\PRA_Collections>
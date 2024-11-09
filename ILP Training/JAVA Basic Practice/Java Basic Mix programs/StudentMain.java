// practice pra1

/* 
import java.util.*;

class Student{

    int studentId;
    String studentName;
    String collegeName;
    int numberOfSubjects;

    public Student()
    {

    }

    public Student(int studentId, String studentName , String collegeName , int numberOfSubjects)
    {
        this.studentId = studentId;
        this.studentName = studentName;
        this.collegeName = collegeName;
        this.numberOfSubjects = numberOfSubjects;
    }
}

class Subject extends Student
{
    //properties
    ArrayList<String>subjects;
    ArrayList<Integer>marks;

    public Subject(int studentId , String studentName , String collegeName , int numberOfSubjects)
    {
        super(studentId,studentName,collegeName,numberOfSubjects);
        this.subjects = new ArrayList<>();
        this.marks = new ArrayList<>();
    }

    public void addSubject(String str)
    {
        subjects.add(str);
    }

    public void addMarks(int mark)
    {
        marks.add(mark);
    }

    //return subject chi arraylsit
    public ArrayList<String> getSubjects()
    {
        return subjects;
    }

    public ArrayList<Integer> getMarks()
    {
        return marks;
    }


    //System.out.println(marks);

    public static void getDistinctMarks(List<Subject> students, int studentId) {
        for (Subject student : students) {
            if (student.studentId == studentId) {
                Set<Integer> distinctMarks = new HashSet<>(student.getMarks());
                System.out.println("Distinct marks for student ID " + studentId + ": " + distinctMarks);
                return;
            }
        }
        System.out.println("No student found with ID " + studentId);
    }
   

}

public class StudentMain{

    public static void main(String args[])
    {
        System.out.println("Welcome-");

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        ArrayList <Subject> students = new ArrayList<>();

        for(int i=0; i<n;i++)
        {
            System.out.println("Enter student id : ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter student name : ");
            String name = sc.nextLine();
            System.out.println("Enter college name: ");
            String college = sc.nextLine();
            System.out.println("Enter no of subjects: ");
            int sub = sc.nextInt();
            sc.nextLine();

            Subject sb = new Subject(id,name,college,sub);

            for(int j=0;j<sub;j++)
            {
                System.out.println("Enter subject: "+j+": ");
                String subname = sc.nextLine();
                sb.addSubject(subname);
                System.out.println("Enter subject " +j+"marks: ");
                int mark = sc.nextInt();
                sc.nextLine();
                sb.addMarks(mark);
            }

            students.add(sb);
        }
        //getSubjects();
        //System.out.println(subjects);
        //System.out.println(marks);

        System.out.println("Enter id - ");
        int idd = sc.nextInt();
        Subject.getDistinctMarks(students,idd);
    }
}

*/


// Practice 2 =


import java.util.*;

class Student{
    int studentId;
    String studentName;
    String collegeName;
    int numberOfSubjects;

    public Student(int studentId , String studentName , String collegeName , int numberOfSubjects)
    {
        this.studentId = studentId;
        this.studentName = studentName;
        this.collegeName = collegeName;
        this.numberOfSubjects = numberOfSubjects;
    }
}

class Subject extends Student
{
    public ArrayList<String> subjects;
    public ArrayList<Integer> marks;

    public Subject(int studentId , String studentName , String collegeName , int numberOfSubjects)
    {
        super(studentId,studentName,collegeName,numberOfSubjects);
        this.subjects = new ArrayList<>();
        this.marks = new ArrayList<>();
    }

    public void addMarks(String sub, int mark)
    {
        subjects.add(sub);
        marks.add(mark);
        System.out.println("subject added sucessfully!");
    }

    //display subject and marks of specific student
    public static void getSubjects(ArrayList<Subject> students,int id)
    {
        for(Subject std : students)
        {
            if(std.studentId == id )
            {
                System.out.println(std.subjects);
                System.out.println(std.marks);
                return;
            }
        }
        System.out.println("Id not found");
        
    }

    //display distinct marks of a particular student
    public static void displayDistinctMarks(ArrayList<Subject> students , int id)
    {
        HashSet<Integer> dmarks = new HashSet<Integer>();

        for(Subject sub : students)
        {
            if(sub.studentId == id)
            {
                System.out.println("All Marks are : ");
                System.out.println(sub.marks);
                for(Integer mark: sub.marks)
                {
                    dmarks.add(mark);
                }
            }
        }
        System.out.println("Distict marks are: ");
        System.out.println(dmarks);
    }

    //student having avg marks greater than threshold 

    public static void FindMaxWithThreshold(ArrayList<Subject> students,int threshold)
    {
        int threshold1 = threshold;
        double max = 0;
        for(Subject std : students)
        {
            int sum = 0;
            for(Integer i : std.marks)
            {
                sum = sum + i;
            }
            double avg = sum / std.marks.size();
            if (avg > max)
            {
                max = avg;
            }
        }
        if (max > threshold1)
        {
            System.out.println("Student with max avg"+ max);
        }

    }



}

public class StudentMain
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        ArrayList<Subject> students = new ArrayList<>();

        for(int i =0; i<n; i++)
        {
            System.out.println("Enter student Id:  ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter name: ");
            String name = sc.nextLine();
            System.out.println("Enter college name: ");
            String collegeName = sc.nextLine();
            System.out.println("Enter no. of subjects: ");
            int noOfSubjects = sc.nextInt();
            sc.nextLine();

            Subject sb = new Subject(id, name, collegeName, noOfSubjects);
            students.add(sb);

            for(int j=0; j<noOfSubjects; j++)
            {
                System.out.println("Enter the"+ j +"subject : ");
                String sub = sc.nextLine();
                System.out.println("Enter the"+ j +"marks : ");
                int mark = sc.nextInt();
                sc.nextLine();

                sb.addMarks(sub,mark);
            }
        }

        //methods for display specific details

        //display subjects of particular student
        System.out.println("Enter Id for display subjects: ");
        int id_input = sc.nextInt();
        sc.nextLine();

        Subject.getSubjects(students,id_input);

        //Display Distinct Marks
        System.out.println("Enter Id for display distinct marks: ");
        int id_input2 = sc.nextInt();
        sc.nextLine();

        Subject.displayDistinctMarks(students,id_input2);


        //Student with avg marks greater than threshold
        System.out.println("Enter threshold marks: ");
        int threshold = sc.nextInt();
        sc.nextLine();

        Subject.FindMaxWithThreshold(students,threshold);

    }
}
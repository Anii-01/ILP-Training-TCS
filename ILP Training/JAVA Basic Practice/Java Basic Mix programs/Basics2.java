class Student 
{
    int rollNo;
    String name;
    int marks;
}

public class Basics2 {

    public static void main(String args[])
    {
        //manually creation of objects
        Student s1 = new Student();
        s1.rollNo=1;
        s1.name="ANiket";
        s1.marks=50;

        Student s2 = new Student();
        s2.rollNo=2;
        s2.name="Ram";
        s2.marks=150;

        Student s3 = new Student();
        s3.rollNo=3;
        s3.name="Jay";
        s3.marks=200;

        System.out.println(s1);
        System.out.println(s1.name);

        //just aasign objects to an array
        Student students[] = new Student[3];    //it is not a three student object... we are creating an array which can hold student refrences...
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(int i = 0; i<students.length;i++)
        {
            System.out.println(students[i].name);
        }

        System.out.println("Using for each loop-");
        for(Student std : students)
        {
            System.out.println(std.name);
        }
    }
}

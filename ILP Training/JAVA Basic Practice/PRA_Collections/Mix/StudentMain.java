//import java.ArrayList;
//static objects

// static method = find max 

//sorting using comparator function

import java.util.*;
class Student{

    int rollNo;
    String name;
    int age;

    Student(int rollNo,String name,int age)
    {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }

    public String toString()
    {
        return "rollNo = "+rollNo+" name = "+name+" age = "+age;
    }
}

public class StudentMain{

    public static void main(String args[])
    {
        Student s1 = new Student(101,"Aniket",21);
        Student s2 = new Student(102,"Nilam",31);
        Student s3 = new Student(103,"Swara",41);

        ArrayList <Student> students = new ArrayList<Student>();

        System.out.println(students);

        students.add(s3);
        students.add(s1);
        students.add(s2);

        System.out.println("Using toString method: ");
        System.out.println(students);

        System.out.println("Using for each loop-");
        for(Student std : students)
        {
            System.out.print(std.name+" ");
            System.out.print(std.age+" ");
            System.out.println(std.rollNo);
        }

        System.out.println("Student with max age is : ");
        Student res_maxAgStudent = FindMaxAge(students);
        System.out.println(res_maxAgStudent);

        System.out.println("Before sorting :- "+students);

        //Collections.sort(students);

        Collections.sort(students,new Comparator<Student>(){
            public int compare(Student s1 , Student s2)
            {
                return Integer.compare(s1.age,s2.age);
            }
        });

        System.out.println("After sorting :- "+students);
    }


    public static Student FindMaxAge(ArrayList<Student> students)
    {
        int maxAge = students.get(0).age;
        Student maxAgStudent = null;
        for (Student std : students)
        {
            if(std.age > maxAge)
            {
                maxAge = std.age;
                maxAgStudent = std;
                
            }
        }
        return maxAgStudent;
    }
}
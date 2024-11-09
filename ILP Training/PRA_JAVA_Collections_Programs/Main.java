package com.pra_practice;
import java.util.*;
//Online Java Compiler
//Use this editor to write, compile and run your Java code online
import java.util.*;
public class Main {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     
     int n = sc.nextInt();
     ArrayList<Student> students = new ArrayList<>();
     for(int i=0; i<n; i++)
     {
         int id = sc.nextInt();
         sc.nextLine();
         String name = sc.nextLine();
         
         int nos = sc.nextInt();
         sc.nextLine();
         
         ArrayList<String> subjects = new ArrayList<>();
         ArrayList<Double> marks = new ArrayList<>();
         for(int j=0; j<nos; j++)
         {
             String sub = sc.nextLine();
             double mark = sc.nextDouble();
             sc.nextLine();
             subjects.add(sub);
             marks.add(mark);
         }
         
         Student std = new Student(id,name,subjects,marks);
         students.add(std);
     }
     
     double th = sc.nextDouble();
     FindMaxThreshold(th,students);
     
     FindMostUnique(students);
     
     
     
 }
 
 public static void FindMaxThreshold(Double th,ArrayList<Student> students)
 {
     if(students.size()==0)
     {
         System.out.println("No student found!!");
     }
     else
     {
         for(Student std : students)
         {   
             double sum = 0.0;
             double avg = 0.0;
             for(Double mk : std.marks)
             {
                 sum = sum + mk;
             }
             avg = sum/(std.marks).size();
             
             if(avg > th)
             {
                 System.out.println(std.name);
             }
         }
     }
 }
 
 
 public static void FindMostUnique(ArrayList<Student> students)
 {
     
     HashSet<Student> hm = new HashSet<>();
     
     int max = 0;
     for(Student std : students)
     {
         HashSet<Double> uq = new HashSet<>(std.marks);
         int unique = uq.size();
         std.uni_marks = unique;
         max = unique;
     }
     
     for(Student std : students)
     {
         if(std.uni_marks == max)
         {
             System.out.println(std.name);
         }
     }
 }
}



class Student
{
 int id;
 String name;
 ArrayList<Double> marks;
 ArrayList<String> subjects;
 
 int uni_marks;
 
 public Student(int id,String name,ArrayList<String> subjects,ArrayList<Double> mark)
 {
     this.id = id;
     this.name = name;
     this.marks = marks;
     this.subjects = subjects;
 }
 
}
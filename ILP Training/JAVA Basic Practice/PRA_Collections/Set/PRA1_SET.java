import java.util.*;

public class PRA1_SET {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        ArrayList<employee> emps = new ArrayList<>();
        for(int i=0; i<n; i++)
        {
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            String grade = sc.nextLine();
            String rollNo = sc.nextLine();

            employee emp = new employee(id, name, grade, rollNo);
            emps.add(emp);
        }

        //ArrayList<String> grades = new ArrayList<>();
        TreeSet<String> grades = new TreeSet<>();

        for(employee emp : emps)
        {
            grades.add(emp.grade);
        }

        for(String grade : grades)
        {
            System.out.println("Grade: "+grade);
            for(employee emp : emps)
            {
                if(grade.equalsIgnoreCase(emp.grade))
                        System.out.println(emp.id+" "+emp.name+" "+emp.rollNo);
                }
            }
        }
}

class employee
{
    int id;
    String name;
    String grade;
    String rollNo;

    public employee(int id,String name,String grade,String rollNo)
    {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.rollNo = rollNo;
    }
}

import java.util.*;

class Student {
    int rollNo;
    String name;
    int subject;
    double fees;

    public Student(int rollNo, String name, int subject, double fees) {
        this.rollNo = rollNo;
        this.name = name;
        this.subject = subject;
        this.fees = fees;
    }
}

public class PRA_03 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Student arr[] = new Student[4];

        for(int i = 0; i < arr.length; i++) {
            int a = sc.nextInt();
            sc.nextLine();  // Consume newline left-over
            String b = sc.nextLine();
            int c = sc.nextInt();
            double d = sc.nextDouble();
            sc.nextLine();  // Consume newline left-over

            arr[i] = new Student(a, b, c, d);
        }

        String str = sc.nextLine();
        Student obj1 = getDataWithName(arr, str);
        Student obj2 = getDataWithMinFees(arr);

        if(obj1 == null) {
            System.out.println("No match found");
        } else {
            System.out.println(obj1.rollNo);
            System.out.println(obj1.name);
            System.out.println(obj1.subject);
            System.out.println(obj1.fees);
        }

        if(obj2 == null) {
            System.out.println("No match found");
        } else {
            System.out.println(obj2.rollNo);
            System.out.println(obj2.name);
            System.out.println(obj2.subject);
            System.out.println(obj2.fees);
        }
    }

    public static Student getDataWithName(Student arr[], String str) {
        for(Student k : arr) {
            if(k.name.equalsIgnoreCase(str)) {
                return k;
            }
        }
        return null;
    }

    public static Student getDataWithMinFees(Student arr[]) {
        if (arr.length == 0) return null;

        double minFees = arr[0].fees;
        Student minFeeStudent = arr[0];

        for(Student k : arr) {
            if(k.fees < minFees) {
                minFees = k.fees;
                minFeeStudent = k;
            }
        }

        return minFeeStudent;
    }
}

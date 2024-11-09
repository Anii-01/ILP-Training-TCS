//PRA 1 - shreeraj

import java.util.*;

class Student {
    private int studentId;
    private String studentName;
    private String collegeName;
    private int numberOfSubjects;

    public Student(int studentId, String studentName, String collegeName, int numberOfSubjects) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.collegeName = collegeName;
        this.numberOfSubjects = numberOfSubjects;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getNumberOfSubjects() {
        return numberOfSubjects;
    }
}

class Subject extends Student {
    private ArrayList<String> subjects;
    private ArrayList<Integer> marks;

    public Subject(int studentId, String studentName, String collegeName, int numberOfSubjects) {
        super(studentId, studentName, collegeName, numberOfSubjects);
        this.subjects = new ArrayList<>();
        this.marks = new ArrayList<>();
    }

    public void addSubject(String subject, int mark) {
        subjects.add(subject);
        marks.add(mark);
    }

    public ArrayList<Integer> getMarks() {
        return marks;
    }

    public static void getDistinctMarks(List<Subject> students, int studentId) {
        for (Subject student : students) {
            if (student.getStudentId() == studentId) {
                Set<Integer> distinctMarks = new HashSet<>(student.getMarks());
                System.out.println("Distinct marks for student ID " + studentId + ": " + distinctMarks);
                return;
            }
        }
        System.out.println("No student found with ID " + studentId);
    }

    public static void topStudent(List<Subject> students, int threshold) {
        for (Subject student : students) {
            List<Integer> marks = student.getMarks();
            int sum = 0;
            for (int mark : marks) {
                sum += mark;
            }

            double average = marks.size() > 0 ? (double) sum / marks.size() : 0;

            if (average > threshold) {
                System.out.println("Top student: " + student.getStudentName() + " with average marks: " + average);
                return;
            }
        }
        System.out.println("No student found with average marks above " + threshold);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = Integer.parseInt(scanner.nextLine());
        
        List<Subject> students = new ArrayList<>();

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter student ID: ");
            int studentId = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter student name: ");
            String studentName = scanner.nextLine();
            System.out.print("Enter college name: ");
            String collegeName = scanner.nextLine();
            System.out.print("Enter number of subjects: ");
            int numberOfSubjects = Integer.parseInt(scanner.nextLine());

            Subject subject = new Subject(studentId, studentName, collegeName, numberOfSubjects);

            for (int j = 0; j < numberOfSubjects; j++) {
                System.out.print("Enter subject name: ");
                String subjectName = scanner.nextLine();
                System.out.print("Enter mark: ");
                int mark = Integer.parseInt(scanner.nextLine());
                subject.addSubject(subjectName, mark);
            }

            students.add(subject);
        }

        System.out.print("Enter the student ID to get distinct marks: ");
        int studentId = Integer.parseInt(scanner.nextLine());
        Subject.getDistinctMarks(students, studentId);

        System.out.print("Enter the threshold marks: ");
        int threshold = Integer.parseInt(scanner.nextLine());
        Subject.topStudent(students, threshold);

        scanner.close();
    }
}
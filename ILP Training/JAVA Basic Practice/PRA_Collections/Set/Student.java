import java.util.*;

public class Student {
    private int id;
    private String name;
    private String branch;
    private String grades;

    // Constructor
    public Student(int id, String name, String branch, String grades) {
        this.id = id;
        this.name = name;
        this.branch = branch;
        this.grades = grades;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBranch() {
        return branch;
    }

    public String getGrades() {
        return grades;
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "', branch='" + branch + "', grades='" + grades + "'}";
    }

    // Method to map students by grades
    public static Map<String, List<Student>> mapStudentsByGrades(List<Student> students) {
        Map<String, List<Student>> gradeMap = new HashMap<>();

        // Iterate through the list of students
        for (Student student : students) {
            // Get the student's grade
            String grade = student.getGrades();

            // If the grade key doesn't exist in the map, create a new list for it
            if (!gradeMap.containsKey(grade)) {
                gradeMap.put(grade, new ArrayList<>());
            }

            // Add the student to the appropriate grade list
            gradeMap.get(grade).add(student);
        }

        return gradeMap;
    }

    public static void main(String[] args) {
        // Example usage
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Alice", "CS", "A"));
        students.add(new Student(2, "Bob", "IT", "B"));
        students.add(new Student(3, "Charlie", "ECE", "A"));
        students.add(new Student(4, "David", "ME", "C"));
        students.add(new Student(5, "Eva", "CE", "B"));

        Map<String, List<Student>> gradeMap = mapStudentsByGrades(students);

        // Print the result
        for (Map.Entry<String, List<Student>> entry : gradeMap.entrySet()) {
            System.out.println("Grade: " + entry.getKey());
            for (Student student : entry.getValue()) {
                System.out.println(student);
            }
            System.out.println();
        }
    }
}

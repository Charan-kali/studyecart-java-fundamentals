// Student class to store student information
public class Student {

    // Private variables
    private int studentId;
    private String name;
    private double grade;

    // Constructor to initialize student details
    public Student(int studentId, String name, double grade) {
        this.studentId = studentId;
        this.name = name;
        this.grade = grade;
    }

    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("Student ID : " + studentId);
        System.out.println("Name       : " + name);
        System.out.println("Grade      : " + grade);
        System.out.println("-------------------------");
    }
}
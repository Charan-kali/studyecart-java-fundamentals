// Main class to test the Student class
public class Details {

    public static void main(String[] args) {

        // Creating student objects
        Student student1 = new Student(101, "Anmol", 92.5);
        Student student2 = new Student(102, "Kalicharan", 88.0);
        Student student3 = new Student(103, "Samir", 91.2);
        Student student4 = new Student(104, "Ranjit Reddy", 89.7);

        // Displaying student details
        student1.displayStudentDetails();
        student2.displayStudentDetails();
        student3.displayStudentDetails();
        student4.displayStudentDetails();
    }
}
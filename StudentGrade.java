import java.util.ArrayList;

class Student {
    private int student_id;
    private String student_name;
    private ArrayList<Integer> grades;

    public Student(int student_id, String student_name) {
        this.student_id = student_id;
        this.student_name = student_name;
        this.grades = new ArrayList<>();
    }

    public int getStudentId() {
        return student_id;
    }

    public void setStudentId(int student_id) {
        this.student_id = student_id;
    }

    public String getStudentName() {
        return student_name;
    }

    public void setStudentName(String student_name) {
        this.student_name = student_name;
    }

    public void addGrade(int grade) {
        if (grade < 0 || grade > 100) {
            System.out.println("Invalid grade: " + grade + ". Grade must be between 0 and 100.");
        } else {
            grades.add(grade);
            System.out.println("Grade added: " + grade);
        }
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }
}

public class StudentApp {
    public static void main(String[] args) {
        Student student = new Student(1, "John Doe");

        student.setStudentId(2);
        student.setStudentName("Jane Smith");

        student.addGrade(85);
        student.addGrade(90);
        student.addGrade(-5); // Invalid grade
        student.addGrade(105); // Invalid grade

        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("Student Name: " + student.getStudentName());
        System.out.println("Grades: " + student.getGrades());
    }
}

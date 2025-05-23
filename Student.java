import java.util.ArrayList;

public class Student extends Person {
    int s_id;
    String batch;
    String department;
    String grade;
    String semester;
    ArrayList<Course> courses;

    public Student(int p_id, String name, int age, int s_id, String batch, String department, String grade, String semester) {
        super(p_id, name, age);
        this.s_id = s_id;
        this.batch = batch;
        this.department = department;
        this.grade = grade;
        this.semester = semester;
        this.courses = new ArrayList<>();
    }

    public void registerCourse(Course c) {
        courses.add(c);
    }

    public void showStudentInfo() {
        showPersonalInfo();
        System.out.println("Student ID: " + s_id);
        System.out.println("Batch: " + batch);
        System.out.println("Department: " + department);
        System.out.println("Grade: " + grade);
        System.out.println("Semester: " + semester);
        System.out.println("Registered Courses:");
        for (Course c : courses) {
            System.out.println("- " + c.c_title);
        }
    }
}

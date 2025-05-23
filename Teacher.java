import java.util.ArrayList;

public class Teacher extends Person {
    int t_id;
    String department;
    String designation;
    ArrayList<Course> courses;

    public Teacher(int p_id, String name, int age, int t_id, String department, String designation) {
        super(p_id, name, age);
        this.t_id = t_id;
        this.department = department;
        this.designation = designation;
        this.courses = new ArrayList<>();
    }

    public void assignCourse(Course c) {
        courses.add(c);
    }

    public void showTeacherInfo() {
        showPersonalInfo();
        System.out.println("Teacher ID: " + t_id);
        System.out.println("Department: " + department);
        System.out.println("Designation: " + designation);
        System.out.println("Assigned Courses:");
        for (Course c : courses) {
            System.out.println("- " + c.c_title);
        }
    }
}

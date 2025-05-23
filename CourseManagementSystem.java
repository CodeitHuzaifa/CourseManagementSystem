import java.util.ArrayList;

public class CourseManagementSystem {
    ArrayList<Course> courses;
    ArrayList<Teacher> teachers;
    ArrayList<Student> students;

    public CourseManagementSystem() {
        courses = new ArrayList<>();
        teachers = new ArrayList<>();
        students = new ArrayList<>();

        // Sample default data
        Course c1 = new Course(101, "Java Programming", 3);
        addCourse(c1);

        Teacher t1 = new Teacher(1, "Mr. Rakib", 35, 201, "CSE", "Lecturer");
        addTeacher(t1);

        Student s1 = new Student(11, "Alif", 20, 301, "Batch 20", "CSE", "A", "5th");
        addStudent(s1);

        s1.registerCourse(c1);
        t1.assignCourse(c1);
    }

    public void addCourse(Course c) {
        courses.add(c);
    }

    public void addTeacher(Teacher t) {
        teachers.add(t);
    }

    public void addStudent(Student s) {
        students.add(s);
    }

    public void showAllCourses() {
        System.out.println("All Courses:");
        for (Course c : courses) {
            c.showCourseInfo();
            System.out.println();
        }
    }

    public void showAllTeachers() {
        System.out.println("All Teachers:");
        for (Teacher t : teachers) {
            t.showTeacherInfo();
            System.out.println();
        }
    }

    public void showAllStudents() {
        System.out.println("All Students:");
        for (Student s : students) {
            s.showStudentInfo();
            System.out.println();
        }
    }
}

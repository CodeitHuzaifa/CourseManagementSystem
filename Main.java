public class Main {
    public static void main(String[] args) {
        CourseManagementSystem cms = new CourseManagementSystem();
        boolean exit = false;
        Scanner sc = new Scanner(System.in);

        while (!exit) {
            System.out.println("\n=== Course Management System ===");
            System.out.println("1. Add Course");
            System.out.println("2. Add Teacher");
            System.out.println("3. Add Student");
            System.out.println("4. Show All Courses");
            System.out.println("5. Show All Teachers");
            System.out.println("6. Show All Students");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
			// Exception Handling
            try {
                int selection = sc.nextInt();
                exit = handleUserSelection(cms, selection);
            }
            catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter valid integer value from 1 to 7.");
                sc.nextLine();
            }
        }
    }

   	public static boolean handleUserSelection(CourseManagementSystem cms, int selection) {
        switch (selection) {
            case 1 -> addCourse(cms);
            case 2 -> addTeacher(cms);
            case 3 -> addStudent(cms);
            case 4 -> cms.showAllCourses();
            case 5 -> cms.showAllTeachers();
            case 6 -> cms.showAllStudents();
            case 7 -> {
                System.out.println("Exiting the system. Goodbye!");
                return true;
            }
            default -> System.out.println("Invalid input. Please enter a number between 1 to 7.");
        }
        return false;
    }
			// Exception Handling
    public static void addCourse(CourseManagementSystem cms) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter Course ID:");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Course Title:");
            String title = sc.nextLine();
            System.out.println("Enter Credit Hour:");
            int credit = sc.nextInt();
            sc.nextLine();
            Course newCourse = new Course(id, title, credit);
            cms.addCourse(newCourse);
            System.out.println("Course added successfully!");
        }
        catch (InputMismatchException e) {
            System.out.println("Invalid input type. Course not added. Please try again with correct input.");
        }
    }
			// Exception Handling
    public static void addTeacher(CourseManagementSystem cms) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter Person ID:");
            int pid = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Name:");
            String name = sc.nextLine();
            System.out.println("Enter Age:");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Teacher ID:");
            int tid = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Department:");
            String dep = sc.nextLine();
            System.out.println("Enter Designation:");
            String des = sc.nextLine();

            Teacher newTeacher = new Teacher(pid, name, age, tid, dep, des);
            cms.addTeacher(newTeacher);
            System.out.println("Teacher added successfully!");
        }
        catch (InputMismatchException e) {
            System.out.println("Invalid input type. Teacher not added. Please try again with correct input.");
        }
    }
			// Exception Handling
    public static void addStudent(CourseManagementSystem cms) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter Person ID:");
            int pid = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter Name:");
            String name = sc.nextLine();

            System.out.println("Enter Age:");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter Student ID:");
            int sid = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter Batch:");
            String batch = sc.nextLine();

            System.out.println("Enter Department:");
            String dep = sc.nextLine();

            System.out.println("Enter Grade:");
            String grade = sc.nextLine();

            System.out.println("Enter Semester:");
            String sem = sc.nextLine();

            Student newStudent = new Student(pid, name, age, sid, batch, dep, grade, sem);
            cms.addStudent(newStudent);
            System.out.println("Student added successfully!");
        }
        catch (InputMismatchException e) {
            System.out.println("Invalid input type. Student not added. Please try again with correct input.");
        }
    }
}

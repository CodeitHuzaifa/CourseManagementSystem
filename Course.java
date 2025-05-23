public class Course {
    int c_id;
    String c_title;
    int credit_hour;

    public Course(int c_id, String c_title, int credit_hour) {
        this.c_id = c_id;
        this.c_title = c_title;
        this.credit_hour = credit_hour;
    }

    public void showCourseInfo() {
        System.out.println("ID: " + c_id);
        System.out.println("Title: " + c_title);
        System.out.println("Credit Hour: " + credit_hour);
    }
}

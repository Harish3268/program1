package Programs;
public class Course {
    private String[] courses = new String[3];
    private int[] marks = new int[3];

    public Course(String[] courses, int[] marks) {
        if (courses.length != 3 || marks.length != 3) {
            throw new IllegalArgumentException("Must provide exactly 3 courses and 3 marks.");
        }
        this.courses = courses;
        this.marks = marks;
    }

    public void displayCourseDetails() {
        System.out.println("Courses and Marks:");
        for (int i = 0; i < 3; i++) {
            System.out.println(courses[i] + ": " + marks[i]);
        }
    }
    public static void main(String[] args) {
        String[] courses = {"Math", "Science", "History"};
        int[] marks = {85, 90, 78};
        Course course = new Course(courses, marks);
        course.displayCourseDetails();
    }
}

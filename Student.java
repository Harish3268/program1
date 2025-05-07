package Programs;
public class Student {
    private String name;
    private String dob;

    public Student(String name, String dob) {
        this.name = name;
        this.dob = dob;
    }

    public void displayStudentInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Date of Birth: " + dob);
    }
    public static void main(String[] args) {
        Student student = new Student("Alice", "2005-06-15");
        student.displayStudentInfo();
    }    
}

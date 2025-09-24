import java.util.ArrayList;
import java.util.List;

public class Student {
    private String id;
    private String name;
    private String email;
    private List<String> enrolledCourses;

    public Student(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.enrolledCourses = new ArrayList<>();
    }

    // Getters and setters
    public String getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public List<String> getEnrolledCourses() { return enrolledCourses; }

    public void enrollInCourse(String courseCode) {
        enrolledCourses.add(courseCode);
    }

    @Override
    public String toString() {
        return String.format("Student[ID: %s, Name: %s, Email: %s, Courses: %s]", 
               id, name, email, enrolledCourses.size());
    }
}

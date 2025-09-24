import java.util.*;

public class Coursemanager {
    private Map<String, Course> courses;

    public Coursemanager() {
        courses = new HashMap<>();
    }

    public void addCourse(Course course) {
        courses.put(course.getCode(), course);
    }

    public Course getCourse(String code) {
        return courses.get(code);
    }

    public List<Course> getAllCourses() {
        return new ArrayList<>(courses.values());
    }
}
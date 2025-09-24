import java.util.*;

public class Enrollmentmanager {
    private StudentManager studentManager;
    private Coursemanager courseManager;
    private List<Enrollment> enrollments;

    public Enrollmentmanager(StudentManager studentManager, Coursemanager courseManager) {
        this.studentManager = studentManager;
        this.courseManager = courseManager;
        this.enrollments = new ArrayList<>();
    }

    public boolean enrollStudent(String studentId, String courseCode) {
        if (studentManager.studentExists(studentId) && courseManager.getCourse(courseCode) != null) {
            enrollments.add(new Enrollment(studentId, courseCode));
            return true;
        }
        return false;
    }

    public List<Enrollment> getEnrollments() {
        return enrollments;
    }
}
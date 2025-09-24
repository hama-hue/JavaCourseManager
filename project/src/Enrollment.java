public class Enrollment {
    private String studentId;
    private String courseCode;
    private String grade;

    public Enrollment(String studentId, String courseCode) {
        this.studentId = studentId;
        this.courseCode = courseCode;
        this.grade = "Not Graded";
    }

    public void setGrade(String grade) { this.grade = grade; }
    public String getStudentId() { return studentId; }
    public String getCourseCode() { return courseCode; }
    public String getGrade() { return grade; }
}
import java.io.*;
import java.nio.file.*;
import java.util.*;

public class Filemanager {
    private StudentManager studentManager;
    private Coursemanager courseManager;
    private Enrollmentmanager enrollmentmanager;

    public Filemanager(StudentManager studentManager, Coursemanager courseManager, 
                      Enrollmentmanager enrollmentManager) {
        this.studentManager = studentManager;
        this.courseManager = courseManager;
        this.enrollmentmanager = enrollmentManager;
    }

    public void saveData() {
        try {
            // Create data directory if it doesn't exist
            Files.createDirectories(Paths.get("data"));

            // Save students
            try (PrintWriter writer = new PrintWriter("data/students.txt")) {
                for (Student student : studentManager.getAllStudents()) {
                    writer.println(student.getId() + "," + student.getName() + "," + student.getEmail());
                }
            }

            // Save courses
            try (PrintWriter writer = new PrintWriter("data/courses.txt")) {
                for (Course course : courseManager.getAllCourses()) {
                    writer.println(course.getCode() + "," + course.getTitle() + "," + 
                                 course.getCredits() + "," + course.getInstructor());
                }
            }

            System.out.println("Data saved to files successfully!");

        } catch (IOException e) {
            System.out.println("Error saving data: " + e.getMessage());
        }
    }

    public void loadData() {
        try {
            // Load students
            if (Files.exists(Paths.get("data/students.txt"))) {
                List<String> lines = Files.readAllLines(Paths.get("data/students.txt"));
                for (String line : lines) {
                    String[] parts = line.split(",");
                    if (parts.length == 3) {
                        Student student = new Student(parts[0], parts[1], parts[2]);
                        studentManager.addStudent(student);
                    }
                }
            }

            // Load courses
            if (Files.exists(Paths.get("data/courses.txt"))) {
                List<String> lines = Files.readAllLines(Paths.get("data/courses.txt"));
                for (String line : lines) {
                    String[] parts = line.split(",");
                    if (parts.length == 4) {
                        Course course = new Course(parts[0], parts[1], 
                                                Integer.parseInt(parts[2]), parts[3]);
                        courseManager.addCourse(course);
                    }
                }
            }

        } catch (IOException e) {
            System.out.println("Error loading data: " + e.getMessage());
        }
    }
}
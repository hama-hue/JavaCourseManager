import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static StudentManager studentManager = new StudentManager();
    private static Coursemanager courseManager = new Coursemanager();
    private static Enrollmentmanager enrollmentManager = new Enrollmentmanager(studentManager, courseManager);
    private static Filemanager fileManager = new Filemanager(studentManager, courseManager, enrollmentManager);

    public static void main(String[] args) {
        System.out.println("=== Simple Campus Course Manager ===");
        showMainMenu();
    }

    private static void showMainMenu() {
        while (true) {
            System.out.println("\n=== MAIN MENU ===");
            System.out.println("1. Manage Students");
            System.out.println("2. Manage Courses");
            System.out.println("3. Manage Enrollments");
            System.out.println("4. File Operations");
            System.out.println("5. Exit");
            System.out.print("Choose option (1-5): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1 -> manageStudents();
                case 2 -> manageCourses();
                case 3 -> manageEnrollments();
                case 4 -> fileOperations();
                case 5 -> {
                    System.out.println("Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid choice! Try again.");
            }
        }
    }

    private static void manageStudents() {
        while (true) {
            System.out.println("\n=== STUDENT MANAGEMENT ===");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Back to Main Menu");
            System.out.print("Choose option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> addStudent();
                case 2 -> viewStudents();
                case 3 -> { return; }
                default -> System.out.println("Invalid choice!");
            }
        }
    }

    private static void addStudent() {
        System.out.print("Enter Student ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Email: ");
        String email = scanner.nextLine();

        Student student = new Student(id, name, email);
        studentManager.addStudent(student);
        System.out.println("Student added successfully!");
    }

    private static void viewStudents() {
        System.out.println("\n=== ALL STUDENTS ===");
        for (Student student : studentManager.getAllStudents()) {
            System.out.println(student);
        }
    }

    private static void manageCourses() {
        // Similar to manageStudents()
        System.out.println("Course management - coming soon!");
    }

    private static void manageEnrollments() {
        System.out.println("Enrollment management - coming soon!");
    }

    private static void fileOperations() {
        System.out.println("\n=== FILE OPERATIONS ===");
        System.out.println("1. Save Data to File");
        System.out.println("2. Load Data from File");
        System.out.print("Choose option: ");

        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1) {
            fileManager.saveData();
            System.out.println("Data saved successfully!");
        } else if (choice == 2) {
            fileManager.loadData();
            System.out.println("Data loaded successfully!");
        }
    }
}
# Java Course Manager


***

## 💡 Overview of the Project

The **Java Course Manager** is a robust and efficient application designed to streamline the administration of educational courses, student records, and enrollment processes. Built entirely in Java, this system provides a centralized platform for managing all essential data related to a curriculum.

It is ideal for small educational institutions or individual instructors needing a reliable, desktop-based solution for tracking course schedules, student information, and enrollment status.

***

## ✨ Features

The application offers a comprehensive set of features for managing educational resources:

* **Course Management:**
    * Add new courses with details (course ID, title, capacity, instructor).
    * View, edit, or delete existing course records.
    * List all available courses and their current enrollment numbers.
* **Student Management:**
    * Register new students (student ID, name, contact info).
    * Update student details or remove student records.
* **Enrollment & Roster:**
    * Enroll a student in a specific course (checks for course capacity).
    * Drop a student from a course.
    * View the detailed roster (list of enrolled students) for any given course.
* **Data Persistence:** Data is saved securely, ensuring that all course and student information is retained between application sessions.

***

## 🛠️ Technologies/Tools Used

This project is built using industry-standard tools and frameworks for Java development:

| Category | Tool/Technology | Version/Standard | Description |
| :--- | :--- | :--- | :--- |
| **Language** | Java Development Kit (JDK) | 8+ (e.g., Java 17 LTS) | The core programming language. |
| **Build Automation** | Apache Maven | 3.6+ | Used for dependency management, project compilation, and package creation. |
| **Testing** | JUnit 5 | 5.8+ | The framework used for writing and running unit tests. |
| **IDE** | IntelliJ IDEA / Eclipse | Latest | Recommended development environments. |
| **Version Control** | Git & GitHub | N/A | Used for tracking changes and collaborative development. |

***

## ⬇️ Steps to Install & Run the Project

Follow these steps to set up and run the Java Course Manager on your local machine.

### Prerequisites

You must have the following installed:

1.  **Git:** For cloning the repository.
2.  **Java Development Kit (JDK):** Version 8 or higher.
3.  **Apache Maven:** Version 3.6 or higher.

### 1. Clone the Repository

Open your terminal or command prompt and run the following command to download the source code:

```bash
git clone [https://github.com/hama-hue/JavaCourseManager.git](https://github.com/hama-hue/JavaCourseManager.git)
```
### 2. Navigate to the Project Source Directory

```bash
cd javacoursemanager/project/src
```

### 3. Run Main class

```bash
java Main
```

## 🧪 Instructions for Testing

Testing is done manually through command-line interaction and observation of the output.

1. **Execute the application** using the run command above.

2. **Test the Menu Flow:** Ensure all menu options (1, 2, 3, etc.) are displayed clearly and can be selected successfully.

3. **Test Course Creation:** Select the "Add Course" option and input data. Verify that the system provides a success message.

4. **Test Retrieval:** After adding a course, select the "View All Courses" option to confirm the new entry is displayed correctly.

5. **Validation Check:** Attempt to enter non-numeric input where a number is expected (e.g., course ID) to verify that the application gracefully handles validation errors.

6. **Exit:** Select the exit option to cleanly terminate the program.

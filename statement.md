# Problem Statement & Project Scope

## 🎯 Problem Statement

Educational institutions and individual instructors often face challenges managing course details, student enrollments, and academic rosters efficiently. Relying on manual processes (like spreadsheets or physical registers) leads to errors, delays in reporting, and difficulty in tracking course capacity and student status in real-time. A dedicated, structured system is needed to centralize and automate these management tasks.

## 🔭 Scope of the Project

The primary scope of the **Java Course Manager** project is to deliver a reliable, desktop-based application capable of handling the core administrative tasks related to course management.

The project is strictly limited to:

1.  **Core Data Management:** Creation, reading, updating, and deletion (CRUD) of course and student records.
2.  **Enrollment Logic:** Implementing business rules for student enrollment (e.g., checking course capacity).
3.  **Local Persistence:** Storing data locally (e.g., using flat files or a simple embedded database).

The project **will not** include:

* Web interface or remote accessibility.
* Advanced features like grade tracking, attendance logging, or scheduling complex calendar events.
* Authentication or user role management.

## 👤 Target Users

The application is designed for the following primary users:

| User Group | Description | Primary Goal |
| :--- | :--- | :--- |
| **Small College/University Administrators** | Staff responsible for department-level course offerings and student placement. | Quickly manage course availability and generate up-to-date class rosters. |
| **Independent Tutors or Instructors** | Individuals teaching several courses who need to track enrollment and capacity. | Maintain simple, centralized records for multiple classes without requiring institutional software. |

## ✨ High-Level Features

The system will provide the following essential capabilities:

1.  **Course Definition:** Define and manage unique courses with specific titles, IDs, and capacity limits.
2.  **Student Registration:** Maintain a centralized record of all registered students.
3.  **Enrollment Control:** Handle the process of enrolling students into courses and dropping them, adhering to capacity constraints.
4.  **Roster Generation:** Ability to instantly display a list of all enrolled students for any selected course.

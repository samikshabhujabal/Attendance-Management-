:



## 🧾 Attendance Management System (Console-Based Java Application)



A Menu-Driven Console Application in Java that uses JDBC to connect with a PostgreSQL database. The project follows Object-Oriented Programming principles and uses Multithreading where applicable (e.g., for background tasks like logging or batch processing).



#### ⚙️ Features



👨‍🏫 Admin module to manage students and attendance



🧑‍🎓 Student module to view attendance records



📋 Mark attendance by date and class



🧵 Multithreaded logging and data syncing



🔒 Role-based access (Admin / Student)



🛢️ PostgreSQL database integration using JDBC



###### 🛠️ Technologies Used



Component	Technology

Language	Java (JDK 11+)

Database	PostgreSQL

DB Connector	JDBC

Multithreading	Java Threads

Build Tool	Maven / Gradle (optional)

Logging	Custom  / Java Logger



📂 Project Structure



Attendance Management System

├── src/

│   ├── db/                # Database connection and queries

│   ├── models/             # POJOs for Student, Attendance, etc.

│   ├── services/           # Business logic (OOP-based)

│   ├── threads/            # Multithreaded logging / syncing

│   ├── utils/              # Utility classes

│   └── Main.java           # Entry point with menu

├── sol/

│   └── schema's          # PostgreSQL DDL script

├── README.md

└── pom.xml                   # If using Maven or Gradle







Update your DB config in DBConnection.java:



private static final String URL = "jdbc:postgresql://localhost:5432/attendance\_system";

private static final String USER = "PostgreSQL";

private static final String PASSWORD = "1234";



###### 🧪 Sample Menu Options



Welcome to Attendance Management System



1\. Admin Login

2\. Student Login

3\. Exit



--- Admin Menu ---

1\. Add Student

2\. Mark Attendance

3\. View Attendance

4\. Logout



--- Student Menu ---

1\. View My Attendance



2\. Logout


Use the console menu to:

--- Attendance Menu ---
1. Add student
2. List students
3. Mark today’s attendance
4. View attendance by date
5. Exit




✅ PostgreSQL JDBC Maven Dependency

        <dependency>
      <groupId>org.postgresql</groupId>
       <artifactId>postgresql</artifactId>
      <version>42.7.7</version>
     </dependency>




###### 👨‍💻 Author



GitHub: Samiksha  Bhujbal



Email: samikshabhujabal@gmail.com






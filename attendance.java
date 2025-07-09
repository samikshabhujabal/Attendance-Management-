package com.javaproject.app;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
class Student{
	private static final String USER = "postgres";
	private static final String PASSWORD ="1234";
	private static final String URL = "jdbc://postgresql://localhost:5432/javaproject";
    String name;
    int totalClasses;
    int attendedClasses;
	private int id;
 public class Attendance {
 }    // Constructor
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.totalClasses = 0;
        this.attendedClasses = 0;
    }  // Method to mark attendance
    public void markAttendance(boolean attended) {
        totalClasses++;
        if (attended) {
            attendedClasses++;
        }
    } // Method to display attendance record
    public void displayRecord() {
        double attendancePercentage = (totalClasses == 0) ? 0 : ((double) attendedClasses / totalClasses) * 100;
        System.out.println("ID: " + id + " | Name: " + name);
        System.out.println("Total Classes: " + totalClasses);
        System.out.println("Classes Attended: " + attendedClasses);
        System.out.println("Attendance Percentage: " + attendancePercentage + "%");
        System.out.println("----------------------------------------");
    }
}
public class attendance{
    private static Map<Integer, Student> studentDatabase = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);
    // Method to register new student
    public static void registerStudent() {
        System.out.print("Enter Student ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        Student student = new Student(id, name);
        studentDatabase.put(id, student);
        System.out.println("Student Registered Successfully!");
    }
    // Method to mark attendance
    public static void markAttendance() {
        System.out.print("Enter Student ID to mark attendance: ");
        int id = scanner.nextInt();
        if (studentDatabase.containsKey(id)) {
            System.out.print("Mark as present (true/false): ");
            boolean isPresent = scanner.nextBoolean();
            studentDatabase.get(id).markAttendance(isPresent);
            System.out.println("Attendance Marked Successfully!");
        } else {
            System.out.println("Student not found!");
        }
    }// Method to view attendance records
    public static void viewRecords() {
        System.out.print("Enter Student ID to view records: ");
        int id = scanner.nextInt();
        if (studentDatabase.containsKey(id)) {
            studentDatabase.get(id).displayRecord();
        } else {
        	System.out.println("Student not found!");
        }
    }
    public static void main(String[] args) {
        while (true) {
            System.out.println("\n=== Attendance Management System ===");
            System.out.println("1. Register Student");
            System.out.println
            ("2. Mark Attendance");
            System.out.println("3. View Attendance Records");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    registerStudent();
                    break;
                case 2:
                    markAttendance();
                    break;
                case 3:
                    viewRecords();
                    break;
                case 4:
                    System.out.println("Exiting system...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice, please try again!");
            }
        }
    }
}

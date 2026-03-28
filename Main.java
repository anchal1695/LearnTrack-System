package com.airtribe.learntrack;

import com.airtribe.learntrack.entity.*;
import com.airtribe.learntrack.service.StudentService;
import com.airtribe.learntrack.util.IdGenerator;
import java.util.Scanner;

public class Main {
    private static StudentService studentService = new StudentService();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to LearnTrack System");

        while (true) {
            System.out.println("\n1. Add Student\n2. View Students\n3. Exit");
            System.out.print("Enter choice: ");

            try {
                int choice = Integer.parseInt(scanner.nextLine());
                if (choice == 3) break;

                handleMenu(choice);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    private static void handleMenu(int choice) {
        if (choice == 1) {
            System.out.print("Name: "); String name = scanner.nextLine();
            System.out.print("Email: "); String email = scanner.nextLine();
            System.out.print("Batch: "); String batch = scanner.nextLine();

            Student s = new Student(IdGenerator.nextStudentId(), name, email, batch);
            studentService.addStudent(s);
            System.out.println("Student created with ID: " + s.getId());
        } else if (choice == 2) {
            studentService.getAll().forEach(s -> System.out.println(s.getInfo()));
        }
    }
}

package studentdatabasemanagementapp;

import studentdatabasemanagementapp.Student;

import java.util.Scanner;

class StudentManagement {

    public static void main(String[] args) {
        // how many students do we want to add
        System.out.println("Enter the number of students to enroll: ");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        Student[] students = new Student[numOfStudents];

        // create n number of students
        for (int n = 0; n < numOfStudents; n++) {
            students[n] = new Student();
            students[n].enroll();
            students[n].payTuition();
            System.out.println(students[n].toString()); // because the result will be printed out
        }
    }

}
package studentdatabasemanagementapp;

import java.util.Scanner;

public class Student {
    // encapsulation in Java
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = null;
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;

    public Student() {
         Scanner in = new Scanner(System.in);// the standard input stream
         System.out.println("Enter students first name:  ");
         this.firstName = in.nextLine();

         System.out.println("Enter students last name:  ");
         this.lastName = in.nextLine();

        System.out.println("1 - Freshman\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter student class Level:");
        this.gradeYear = in.nextInt();

        setStudentID();
    }

    //Generate an ID
    private void setStudentID(){
        id++;
        this.studentID = gradeYear+ " " + id;
    }

    // Enrol into course
    public void enroll() {
        //
        do {
            System.out.print("Enter a course to enroll (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals ("Q")) {
                courses = courses + "\n  " +  course;
                tuitionBalance = tuitionBalance + costOfCourse;
            } else {
            break;
        }
    } while(1 != 0);
    }

    // balance view
    public void viewBalance() {
        System.out.println("Your balance is: $" + tuitionBalance);
    }
    //pay tuition
    public void payTuition () {
        viewBalance();
        System.out.print("Enter your payment: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for the payment of: $" + payment);
        viewBalance();
    }

    //Show Info
    public String toString() {
        return "Name: " + firstName + "" + lastName +
                "\nGrade level: " + gradeYear +
                "\nStudentID: " + studentID +
                "\nCourses Enrolled: " + courses +
                "\nBalance: $" + tuitionBalance;
    }
}

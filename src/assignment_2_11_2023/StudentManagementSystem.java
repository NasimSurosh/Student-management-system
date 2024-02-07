package assignment_2_11_2023;

import java.util.ArrayList;
import java.util.Scanner;

class Student {
  String name;
  int age;
  int studentID;
  String[] courses;
  String contactInfo;

  public Student(String name, int age, int studentID, String[] courses, String contactInfo) {
      this.name = name;
      this.age = age;
      this.studentID = studentID;
      this.courses = courses;
      this.contactInfo = contactInfo;
  }
}

class StudentManagementSystem {

  ArrayList<Student> students = new ArrayList<Student>();
  int studentIDcounter = 1;

  public void addStudent(String name, int age, String[] courses, String contactInfo) {
      int studentID = studentIDcounter++;
      Student student = new Student(name, age, studentID, courses, contactInfo);
      students.add(student);
      System.out.println("Student added successfully!");
  }
  public void removeStudent(int studentID) {
    for(Student student : students) {
      if(student.studentID==studentID) {
        students.remove(student);
        System.out.println("Student with ID number "+ studentID +" removed!");
        return;
      }
    }
    System.out.println("Student with ID number "+ studentID +" not found!");
  }
  public void listStudents() {
      System.out.println("Student List:");
      for (Student student : students) {
          System.out.println("Name: " + student.name);
          System.out.println("Age: " + student.age);
          System.out.println("StudentID: " + student.studentID);
          System.out.println("Course: " + String.join(",", student.courses));
          System.out.println("Contact: " + student.contactInfo);
          System.out.println();
      } 
    }
  public Student findStudentByID(int studentID) {
    for(Student student : students) {
      if(student.studentID == studentID) {
        return student;
      }
    }
    return null;
  }
    
  public static void main(String[] args) {
  
      StudentManagementSystem sms = new StudentManagementSystem();

      Scanner scan = new Scanner(System.in);
      
      int choice;
      do {
        System.out.println("Student management system menu");
        System.out.println("Enter yout choice");
        System.out.println("1. To add student");
        System.out.println("2. To remove student");
        System.out.println("3. List of students");
        System.out.println("4. To Exit");
        choice = scan.nextInt();
        scan.nextLine();
        
        switch(choice) {
        case 1 :
          System.out.println("Enter student name:");
          String name = scan.nextLine();
          System.out.println("Enter student age:");
          int age = scan.nextInt();
          scan.nextLine();
          System.out.println("Enter course:");
          String[] courses = scan.nextLine().split(",");
          System.out.println("Enter student contact information");
          String contactInfo = scan.nextLine();
          
          sms.addStudent(name, age, courses, contactInfo);
          break;
        case 2:
          System.out.println("Enter student ID to remove:");
          int studentIDto = scan.nextInt();
          sms.removeStudent(studentIDto);
          break;
        case 3:
          sms.listStudents();
        case 4:
          System.out.println("Exiting the program:");
          break;
        default:
          System.out.println("Invalid choice! try again");
          
        }
        
      }while(choice != 4);
      scan.close();
  }
}

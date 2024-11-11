package Array;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

public class Student extends User {


    // TODO: Implement a Student class which is a subclass of User with the following additional properties:
    //studentId: representing the unique identifier of the student.
    //course: representing the course in which the student is enrolled.
    int studentId;
    String course;
    public Student(String name,String email,int id,String course)
    {
        super(name,email);
        this.studentId=id;
        this.course=course;
        super.email=email;
        super.username=name;
    }
    public static void main(String[] args) {
        Student student = new Student("jane_doe", "jane.doe@example.com", 101, "Computer Science");
        System.out.println("Username: " + student.getUsername());
        System.out.println("Email: " + student.getEmail());
        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("Course: " + student.getCourse());
        student.displayInfo();



    }

    static boolean areAllEven(Stream<Integer> stream){
        // write code here
        return stream.allMatch(n -> n % 2 == 0);
    }

    public int getStudentId() {
        return studentId;
    }

    public String getCourse() {
        return course;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("studentId: " + studentId);
        System.out.println("course: " + course);
    }

}



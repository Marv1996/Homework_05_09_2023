package service;

import model.Student;

import java.util.Scanner;

public class StudentService {

    private final Student student = new Student("Marv", 88.2);
    private final Scanner scanner = new Scanner(System.in);

    public Student setStudentInfo() {
        System.out.println("Input name:");
        student.setName(scanner.next());
        System.out.println("Input surname:");
        student.setSurname(scanner.next());
        System.out.println("Input year:");
        student.setYear(scanner.nextInt());
        System.out.println("Input mark:");
        student.setMark(scanner.nextDouble());
        System.out.println("Input gender:");
        student.setGender(scanner.next().charAt(0));
        System.out.println("Input isArmenian:");
        student.setArmenian(scanner.nextBoolean());

        return student;
    }
}

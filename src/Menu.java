import model.Student;
import service.StudentService;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        boolean isActive = true;
        Scanner scanner = new Scanner(System.in);
        StudentService student = new StudentService();
        Student[] arrayStudent = new Student[10];

        while (isActive) {
            System.out.println("----------Menu----------");
            System.out.println("1. Create Student");
            System.out.println("2. Print all Students");
            System.out.println("3. Print small Student");
            System.out.println("4. Print high mark Student");
            System.out.println("5. Print low mark Student");
            System.out.println("6. Print Female Students");
            System.out.println("7. Print Male Student");
            System.out.println("8. Exit");
            int command = scanner.nextInt();
            switch (command) {
                case 1 -> {
                    System.out.println("Please input students count");
                    int count = scanner.nextInt();
                    for (int i = 0; i < count; i++) {
                        if (arrayStudent[i] == null) {
                            arrayStudent[i] = student.setStudentInfo();
                            System.out.println("------------------------");
                        }
                    }
                }
                case 2 -> {
                    for (Student value : arrayStudent) {
                        if (value != null) {
                            value.printStudentInfo();
                            System.out.println("------------------------");
                        }
                    }
                }
                case 3 -> student.findSmallStudent(arrayStudent).printStudentInfo();
                case 4 -> student.findHighMark(arrayStudent).printStudentInfo();
                case 5 -> student.findLowMark(arrayStudent).printStudentInfo();
                case 6 -> student.findFemaleStudent(arrayStudent);
                case 7 -> student.findMaleStudent(arrayStudent);
                case 8 -> isActive = false;
            }
        }

    }
}

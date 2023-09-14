package service;

import model.Student;

import java.util.Scanner;

public class StudentService {

    private final Student student = new Student();
    private final Scanner scanner = new Scanner(System.in);

    public Student setStudentInfo() {
        System.out.println("Input name:");
        String name = scanner.next();
        System.out.println("Input surname:");
        String surname = scanner.next();
        System.out.println("Input year:");
        int year = scanner.nextInt();
        System.out.println("Input mark:");
        double mark = scanner.nextDouble();
        System.out.println("Input gender:");
        char gender = scanner.next().charAt(0);
        System.out.println("Input isArmenian:");
        boolean isArmenian = scanner.nextBoolean();

        return new Student(name, surname, year, mark, gender, isArmenian);
    }

    public void printOldStudent(Student[] arrayStudents) {
        int old = arrayStudents[0].getYear();
        String name = arrayStudents[0].getName();

        for (Student arrayStudent : arrayStudents) {
            if (arrayStudent.getYear() < old) {
                old = arrayStudent.getYear();
                name = arrayStudent.getName();
            }
        }
        System.out.println("Name: " + name + " | Year: " + old);
    }

    public Student findLowMark(Student[] arrayStudents) {
        Student mark = arrayStudents[0];

        for (Student arrayStudent : arrayStudents) {
            if (arrayStudent != null && mark != null) {
                if (arrayStudent.getMark() < mark.getMark()) {
                    mark = arrayStudent;
                }
            }
        }
        return mark;
    }

    public Student findHighMark(Student[] arrayStudents) {
        Student mark = arrayStudents[0];
        for (Student arrayStudent : arrayStudents) {
            if (arrayStudent != null && mark != null) {
                if (arrayStudent.getMark() > mark.getMark()) {
                    mark = arrayStudent;
                }
            }
        }
        return mark;
    }

    public void findMaleStudent(Student[] arrayStudents) {
        Student male = null;
        for (Student arrayStudent : arrayStudents) {
            if (male == null) {
                if (arrayStudent.getGender() == 'M') {
                    male = arrayStudent;
                    male.printStudentInfo();
                }
            }
        }
        if (male == null) {
            System.out.println("No Male student");
        }
    }

    public void findFemaleStudent(Student[] arrayStudents) {
        Student female = null;
        for (Student arrayStudent : arrayStudents) {
            if (female == null) {
                if (arrayStudent.getGender() == 'F') {
                    female = arrayStudent;
                    female.printStudentInfo();
                }
            }
        }
        if (female == null) {
            System.out.println("No Female student");
        }
    }

    public void findArmenianStudent(Student[] arrayStudents) {
        for (Student arrayStudent : arrayStudents) {
            if (arrayStudent.getArmenian()) {
                System.out.println("Name: " + arrayStudent.getName() + " | isArmenian: " + arrayStudent.getArmenian());
            }
        }
    }

    public void findFemaleStudentInfo(Student studentFirst, Student studentSecond, Student studentThird) {
        int femaleCount = 0;
        Student[] arrayStudent = {studentFirst, studentSecond, studentThird};
        for (Student student : arrayStudent) {
            if (student.getGender() == 'F') {
                student.printStudentInfo();
            } else {
                femaleCount++;
            }
        }
        if (femaleCount >= arrayStudent.length) {
            System.out.println("No Female student");
        }
    }

    public Student findSmallStudent(Student[] students) {
        Student min = students[0];
        for (Student value : students) {
            if (value != null && min != null) {
                if (value.getYear() > min.getYear()) {
                    min = value;
                }
            }
        }
        return min;
    }

    public void findSmallestFemaleInfo(Student[] arrayStudents) {
        Student minStudent = null;
        for (Student arrayStudent : arrayStudents) {
            if (minStudent == null) {
                if (arrayStudent.getGender() == 'F') {
                    minStudent = arrayStudent;
                } else if (
                        arrayStudent.getGender() == 'F'
                                && arrayStudent.getYear() > minStudent.getYear()
                ) {
                    minStudent = arrayStudent;
                }
            }
            if (minStudent != null) {
                minStudent.printStudentInfo();
            } else {
                System.out.println("no female student");
            }
        }
    }
}

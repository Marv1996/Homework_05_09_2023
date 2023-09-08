package Function;

import model.Student;

public class StudentFunction {

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

    public void printLowMark(Student[] arrayStudents) {
        double mark = arrayStudents[0].getMark();
        String name = arrayStudents[0].getName();

        for (Student arrayStudent : arrayStudents) {
            if (arrayStudent.getMark() < mark) {
                mark = arrayStudent.getMark();
                name = arrayStudent.getName();
            }
        }
        System.out.println("Name: " + name + " | Mark: " + mark);
    }

    public void findMaleStudent(Student[] arrayStudents) {
        for (Student arrayStudent : arrayStudents) {
            if (arrayStudent.getGender() == 'M') {
                System.out.println("Name: " + arrayStudent.getName() + " | Gender: Male");
            }
        }
    }

    public void findFemaleStudent(Student[] arrayStudents) {
        for (Student arrayStudent : arrayStudents) {
            if (arrayStudent.getGender() == 'F') {
                System.out.println("Name: " + arrayStudent.getName() + " | Gender: Female");
            }
        }
    }

    public void findArmenianStudent(Student[] arrayStudents) {
        for (Student arrayStudent : arrayStudents) {
            if (arrayStudent.getArmenian()) {
                System.out.println("Name: " + arrayStudent.getName() + " | isArmenian: " + arrayStudent.getArmenian());
            }
        }
    }
}

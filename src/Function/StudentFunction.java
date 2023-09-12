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
        System.out.println("Name: " + name + " | Low Mark: " + mark);
    }

    public void printHighMark(Student[] arrayStudents) {
        double mark = arrayStudents[0].getMark();
        String name = arrayStudents[0].getName();

        for (Student arrayStudent : arrayStudents) {
            if (arrayStudent.getMark() > mark) {
                mark = arrayStudent.getMark();
                name = arrayStudent.getName();
            }
        }
        System.out.println("Name: " + name + " | Low Mark: " + mark);
    }

    public void findMaleStudent(Student[] arrayStudents) {
        int maleCount = 0;
        for (Student arrayStudent : arrayStudents) {
            if (arrayStudent.getGender() == 'M') {
                System.out.println("Name: " + arrayStudent.getName() + " | Gender: Male");
            } else {
                maleCount++;
            }
        }
        if (maleCount >= arrayStudents.length) {
            System.out.println("No Male student");
        }
    }

    public void findFemaleStudent(Student[] arrayStudents) {
        int femaleCount = 0;
        for (Student arrayStudent : arrayStudents) {
            if (arrayStudent.getGender() == 'F') {
                System.out.println("Name: " + arrayStudent.getName() + " | Gender: Female");
            } else {
                femaleCount++;
            }
        }
        if (femaleCount >= arrayStudents.length) {
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

    public void findSmallestFemaleInfo(Student[] arrayStudents) {
        int noFemaleCount = 0;
        int old = arrayStudents[0].getYear();
        String name;

        for (Student arrayStudent : arrayStudents) {
            if (arrayStudent.getGender() == 'F') {
                if (arrayStudent.getYear() < old) {
                    old = arrayStudent.getYear();
                    name = arrayStudent.getName();
                    System.out.println("Name: " + name + " | Year: " + old);
                }
            } else if (arrayStudent.getGender() != 'F') {
                noFemaleCount++;
            }
        }
        if (noFemaleCount >= arrayStudents.length) {
            System.out.println("No Female student");
        }

    }
}

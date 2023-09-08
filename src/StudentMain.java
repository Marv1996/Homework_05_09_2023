import Function.StudentFunction;
import model.Student;
import settings.StudentSettings;

public class StudentMain {

    public static void main(String[] args) {

        StudentFunction studentFunction = new StudentFunction();

        Student studentFirst = new StudentSettings().setStudentInfo(
                "Koryun",
                "Yenokyan",
                1996,
                8.8,
                'M',
                true
        );

        Student studentSecond = new StudentSettings().setStudentInfo(
                "Frank",
                "Barton",
                1998,
                7.6,
                'M',
                false
        );

        Student studentThird = new StudentSettings().setStudentInfo(
                "Elina",
                "Mickiewicz",
                2001,
                9.2,
                'F',
                false
        );

        Student[] arrayStudents = {studentFirst, studentSecond, studentThird};

        System.out.println("First Student: ");
        studentFirst.printStudentInfo();
        System.out.println("------------------------------------------------------");
        System.out.println("Second Student: ");
        studentSecond.printStudentInfo();
        System.out.println("------------------------------------------------------");
        System.out.println("Third Student: ");
        studentThird.printStudentInfo();
        System.out.println("------------------------------------------------------");
        System.out.println("Old Student: ");
        studentFunction.printOldStudent(arrayStudents);
        System.out.println("------------------------------------------------------");
        System.out.println("Low Mark");
        studentFunction.printLowMark(arrayStudents);
        System.out.println("------------------------------------------------------");
        System.out.println("Find Male");
        studentFunction.findMaleStudent(arrayStudents);
        System.out.println("------------------------------------------------------");
        System.out.println("Find Female");
        studentFunction.findFemaleStudent(arrayStudents);
        System.out.println("------------------------------------------------------");
        System.out.println("Find Armenian");
        studentFunction.findArmenianStudent(arrayStudents);
        System.out.println("------------------------------------------------------");
        studentThird.printFullName();
    }
}

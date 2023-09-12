import Function.StudentFunction;
import model.Student;
import service.StudentService;

public class StudentMain {

    public static void main(String[] args) {

        StudentFunction studentFunction = new StudentFunction();

        Student studentFirst = new StudentService().setStudentInfo();

        Student studentSecond = new StudentService().setStudentInfo();

        Student studentThird = new StudentService().setStudentInfo();

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
        System.out.println("High Mark");
        studentFunction.printHighMark(arrayStudents);
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
        System.out.println("------------------------------------------------------");
        System.out.println("Female student info");
        studentFunction.findFemaleStudentInfo(studentFirst, studentSecond, studentThird);
        System.out.println("------------------------------------------------------");
        System.out.println("Smallest female student info");
        studentFunction.findSmallestFemaleInfo(arrayStudents);
    }
}

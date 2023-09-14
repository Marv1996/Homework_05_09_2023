import model.Student;
import service.StudentService;

public class StudentMain {

    public static void main(String[] args) {

        StudentService studentService = new StudentService();

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
        studentService.printOldStudent(arrayStudents);
        System.out.println("------------------------------------------------------");
        System.out.println("Low Mark");
        studentService.findLowMark(arrayStudents).printStudentInfo();
        System.out.println("------------------------------------------------------");
        System.out.println("High Mark");
        studentService.findHighMark(arrayStudents).printStudentInfo();
        System.out.println("------------------------------------------------------");
        System.out.println("Find Male");
        studentService.findMaleStudent(arrayStudents);
        System.out.println("------------------------------------------------------");
        System.out.println("Find Female");
        studentService.findFemaleStudent(arrayStudents);
        System.out.println("------------------------------------------------------");
        System.out.println("Find Armenian");
        studentService.findArmenianStudent(arrayStudents);
        System.out.println("------------------------------------------------------");
        studentThird.printFullName();
        System.out.println("------------------------------------------------------");
        System.out.println("Female student info");
        studentService.findFemaleStudentInfo(studentFirst, studentSecond, studentThird);
        System.out.println("------------------------------------------------------");
        System.out.println("Smallest female student info");
        studentService.findSmallestFemaleInfo(arrayStudents);
    }
}

import model.Student;

public class StudentMain {

    public static void main(String[] args) {

        Student studentFirst = new Student();

        studentFirst.name = "Koryun";
        studentFirst.surname = "Yenokyan";
        studentFirst.year = 1996;
        studentFirst.mark = 8;
        studentFirst.gender = 'M';
        studentFirst.isArmenian = true;

        Student studentSecond = new Student();

        studentSecond.name = "Frank";
        studentSecond.surname = "Barton";
        studentSecond.year = 1998;
        studentSecond.mark = 7;
        studentSecond.gender = 'M';
        studentSecond.isArmenian = false;

        Student studentThird = new Student();

        studentThird.name = "Elina";
        studentThird.surname = "Mickiewicz";
        studentThird.year = 2001;
        studentThird.mark = 9;
        studentThird.gender = 'F';
        studentThird.isArmenian = false;

        Student[] arrayStudents = {studentFirst, studentSecond, studentThird};
        int old = arrayStudents[0].year;
        String name = arrayStudents[0].name;

        for (int i = 0; i < arrayStudents.length; i++) {
            if (arrayStudents[i].year < old) {
                old = arrayStudents[i].year;
                name = arrayStudents[i].name;
            }
        }
        System.out.println("Name: " + name + " | Year: " + old);

        int mark = arrayStudents[0].mark;

        for (int i = 0; i < arrayStudents.length; i++) {
            if (arrayStudents[i].mark < mark) {
                mark = arrayStudents[i].mark;
                name = arrayStudents[i].name;
            }

        }
        System.out.println("Name: " + name + " | Mark: " + mark);

        for (int i = 0; i < arrayStudents.length; i++) {
            if (arrayStudents[i].gender == 'F') {
                System.out.println("Name: " + arrayStudents[i].name + " | Gender: " + arrayStudents[i].gender);
            }
        }

        for (int i = 0; i < arrayStudents.length; i++) {
            if (arrayStudents[i].isArmenian) {
                System.out.println(
                        "Name: " + arrayStudents[i].name + " | IsArmenian: " + arrayStudents[i].isArmenian
                );
            }
        }
    }
}

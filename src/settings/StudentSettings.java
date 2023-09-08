package settings;

import model.Student;

public class StudentSettings {

    private final Student student = new Student();

    public Student setStudentInfo(
            String name,
            String surname,
            int year,
            double mark,
            char gender,
            boolean isArmenian
    ) {
        student.setName(name);
        student.setSurname(surname);
        student.setYear(year);
        student.setMark(mark);
        student.setGender(gender);
        student.setArmenian(isArmenian);

        return student;
    }
}

package model;

public class Student {

    private String name;
    private String surname;
    private int year;
    private double mark;
    private char gender;
    private Boolean isArmenian;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 0) {
            this.year = year;
        }
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        if (mark > 0) {
            this.mark = mark;
        }
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Boolean getArmenian() {
        return isArmenian;
    }

    public void setArmenian(Boolean armenian) {
        isArmenian = armenian;
    }

    public void printFullName() {
        System.out.println("Full name: " + name + " " + surname);
    }

    public void printStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Year: " + year);
        System.out.println("Mark: " + mark);
        System.out.println("Gender: " + gender);
        System.out.println("Is Armenian: " + isArmenian);
    }
}

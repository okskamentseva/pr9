package com.company;

public class Student {
    private String name;
    private String surname;
    private int id;
    private double gpa;

    public Student() {
        name = "";
        surname = "";
        id = 0;
        gpa = 0;
    }

    public Student(String name, String surname, int id, double gpa) {
        try {
            if(id < 10000) {
                throw new WrongInn();
            }
        }
        catch (WrongInn e) {
            System.out.println(e.toString() + " пользователя " + name + " " + surname);
        }
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getId() {
        return id;
    }

    public double getGpa() {
        return gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return this.name + " " + this.surname + ", id: " + this.id + ", GPA: " + this.gpa;
    }
}

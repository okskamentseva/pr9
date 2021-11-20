package com.company;

public class Main {
    public static void main(String[] args) {
        Student[] st = new Student[5];
        st[0] = new Student("Арам", "Тарарам", 83749, 2.9);
        st[1] = new Student("Муся", "Куся", 46372, 2.8);
        st[2] = new Student("Ром", "Бором", 12345, 3.3);
        st[3] = new Student("Лиля", "Ляля", 456, 3.5);
        st[4] = new Student("Мотя", "Тетя", 29746, 3.1);

        for (int i = 0; i<5; i++){
            System.out.println(st[i]);}
        SortingStudentsByGPA sortingStudentsByGPA = new SortingStudentsByGPA();
        sortingStudentsByGPA.sortingByGPA(st);

        System.out.println("\n");
        for (int i = 0; i<5; i++){
            System.out.println(st[i]);}
    }
}

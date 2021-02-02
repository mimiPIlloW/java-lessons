package com.java.lessons.lessons4;

import static com.java.lessons.lessons4.Oop.age;
import static com.java.lessons.lessons4.Oop.name;

public class Human {

    // Методы описывают поведение
    void byMilk() {
        System.out.println("By milk");
    }

    void byBread() {
        System.out.println("By bread");
    }

    void birthday() {
        age = 18;
        System.out.println(age);
    }

    static void nameHuman() {
        System.out.println(name = "Bob");
    }
}

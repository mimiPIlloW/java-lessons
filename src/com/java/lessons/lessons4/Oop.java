package com.java.lessons.lessons4;


//Объектно ориентированное программирование основана на объектах
public class Oop {

    // Параметры описывают состояние
    static int age;
    static String name;

    public static void main(String[] args) {

        // создали объект
        Human human = new Human();
        // имя
        Human.nameHuman();
        // день рождение
        human.birthday();
        // вызвали купить хлеб
        human.byBread();

        // вызвали купить молоко
        human.byMilk();

        System.out.println("Good!");
    }
}

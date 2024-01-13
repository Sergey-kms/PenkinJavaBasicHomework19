package ru.penkin.java.basic.homework19;

public class Main {     // В гитхаб vetka_1
    public static void main(String[] args) {
        // Создаю несколько фруктов
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Apple apple4 = new Apple();
        Apple apple5 = new Apple();
        Apple apple6 = new Apple();
        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();
        Orange orange4 = new Orange();
        Orange orange5 = new Orange();

        // Создаю коробки
        Box appleBox = new Box();
        Box orangeBox = new Box();
        Box mixedBox = new Box();

        // Добавляю фрукты в соответствующие коробки
        appleBox.addFruit(apple1);
        appleBox.addFruit(apple2);
        appleBox.addFruit(apple3);
        appleBox.addFruit(apple4);
        appleBox.addFruit(apple5);
        appleBox.addFruit(apple6);

        orangeBox.addFruit(orange1);
        orangeBox.addFruit(orange2);
        orangeBox.addFruit(orange3);
        orangeBox.addFruit(orange4);
        orangeBox.addFruit(orange5);

        mixedBox.addFruit(apple1);
        mixedBox.addFruit(apple2);
        mixedBox.addFruit(apple3);
        mixedBox.addFruit(apple4);
        mixedBox.addFruit(apple5);
        mixedBox.addFruit(apple6);
        mixedBox.addFruit(orange1);
        mixedBox.addFruit(orange2);
        mixedBox.addFruit(orange3);
        mixedBox.addFruit(orange4);
        mixedBox.addFruit(orange5);


        double appleBoxWeight = appleBox.getWeight();
        double orangeBoxWeight = orangeBox.getWeight();

        // Вычисляю вес коробок
        System.out.println("Вес коробки с яблоками: " + appleBoxWeight);
        System.out.println("Вес коробки с апельсинами: " + orangeBoxWeight);
        System.out.println("Вес смешанной коробки и яблоками и апельсинами: " + mixedBox.getWeight());

        // Сравниваю коробки
        System.out.println("Равны ли по весу коробка с яблоками и коробка с апельсинами? " + appleBox.compare(orangeBox));
        System.out.println("Смешанная коробка равна коробке яблоками: " + mixedBox.compare(appleBox));

        // Пересыпаю фрукты из одной коробки в другую
        Box<Orange> newAppleBox = new Box<>();
        appleBox.transfer(newAppleBox);
        System.out.println("Вес новой коробки с яблоками: " + newAppleBox.getWeight());
        System.out.println("Вес коробки с яблоками после переноса: " + appleBox.getWeight());
    }
}
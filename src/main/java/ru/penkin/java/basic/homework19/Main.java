package ru.penkin.java.basic.homework19;

public class Main {     // В гитхаб vetka_2
    public static void main(String[] args) {

        // Создаю коробки
        Box appleBox = new Box();
        Box orangeBox = new Box();
        Box mixedBox = new Box();

        // Добавляю фрукты в соответствующие коробки
        for (int i = 0; i <= 5; i++) {
            appleBox.addFruit(new Apple());
        }

        for (int i = 0; i <= 7; i++) {
            orangeBox.addFruit(new Orange());
        }

        mixedBox.getFruits().addAll(appleBox.getFruits());
        mixedBox.getFruits().addAll(orangeBox.getFruits());

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
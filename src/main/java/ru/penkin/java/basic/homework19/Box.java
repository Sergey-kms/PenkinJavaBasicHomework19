package ru.penkin.java.basic.homework19;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {     // В гитхаб vetka_2
    private List<T> fruits; // Перечень фруктов в коробке.

    public Box() {
        fruits = new ArrayList<T>();
    }

    public List<T> getFruits() {
        return fruits;
    }

    private double weightFruit;


    public void addFruit(T fruit) {     // Метод для добавления фруктов в коробку
        fruits.add(fruit);
    }

    public double getWeight() {     // Метод для вычисления веса коробки
        weightFruit = 0;
        for (T fruit : fruits) {
            weightFruit += fruit.getWeightFruit();    // У всех фруктов вес одинаковый
        }
        return weightFruit;
    }

    public boolean compare(Box<?> otherBox) {       // Метод для сравнения коробок
        return Math.abs(this.getWeight() - otherBox.getWeight()) < 0.0001;
    }

    public void transfer(Box<T> otherBox) {        // Метод пересыпания фруктов из текущей коробки в другую
        if (otherBox == null) {
            System.out.println("Пустое значение передаваемой коробки");
            return;
        } else if (otherBox == this) {
            System.out.println("Передайте другую коробку");
            return;
        }
        otherBox.fruits.addAll(this.fruits);
        this.fruits.clear();
    }
}
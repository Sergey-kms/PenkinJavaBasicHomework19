package ru.penkin.java.basic.homework19;

import java.util.ArrayList;

public class Box<T extends Fruit> {     // В гитхаб vetka_1
    private ArrayList<T> fruits; // Перечень фруктов в коробке

    public Box() {
        fruits = new ArrayList<T>();
    }

    private double weightFruit;

    public double getWeightFruit() {
        return getWeightFruit();
    }

    public void setWeightFruit(double weightFruit) {
        this.weightFruit = weightFruit;
    }

    public void addFruit(T fruit) {     // Метод для добавления фруктов в коробку
        fruits.add(fruit);
    }

    public double getWeight() {     // Метод для вычисления веса коробки
        weightFruit = 0;
        for (T fruit : fruits) {
            weightFruit += 0.25;    // У всех фруктов вес одинаковый
        }
        return weightFruit;
    }

    public boolean compare(Box<?> otherBox) {       // Метод для сравнения коробок
        return Math.abs(this.getWeight() - otherBox.getWeight()) < 0.0001;
    }

    public void transfer(Box<T> otherBox) {         // Метод для пересыпания фруктов из текущей коробки в другую
        otherBox.fruits.addAll(this.fruits);
        this.fruits.clear();
    }
}
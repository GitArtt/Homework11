package ru.geekbrains.homework11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<E extends Fruit> {
    List<E> fruits;

    public Box(E... fruits) {
        this.fruits = new ArrayList<>(Arrays.asList(fruits));
    }

    public double getWeight() {
        double sum = 0.0;
        for (E fruit : fruits) {
            sum += fruit.getWeight();
        }
        return sum;
    }

    public boolean compare(Box<?> box) {
        return Math.abs(getWeight() - box.getWeight()) < 0.00001;
    }

    public void transferThem(Box<E> box) {
        box.getFruits().addAll(fruits);
        fruits.clear();
    }

    public List<E> getFruits() {
        return fruits;
    }
}

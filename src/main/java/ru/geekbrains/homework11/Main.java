package ru.geekbrains.homework11;

import com.sun.org.apache.xpath.internal.operations.Or;

import static ru.geekbrains.homework11.GenChange.*;

public class Main {

    public static void main(String[] args) {
//      Первое, второе задания
        String[] array = new String[]{"there", "is", "some", "text", "inside"};
        changeThem(array, 2, 3);
        for (String s : array) {
            System.out.print(s + " ");
        }
        System.out.println(arrayToList(array).getClass());
//      Третье задание
        Box<Apple> appleBox = new Box<>(new Apple(), new Apple(), new Apple());
        Box<Orange> orangeBox = new Box<>(new Orange(), new Orange());
        Box<Orange> orangeBox1 = new Box<>();
        orangeBox.transferThem(orangeBox1);

        System.out.println(appleBox.getWeight());
        System.out.println(orangeBox.getWeight());
        System.out.println(appleBox.compare(orangeBox));
        System.out.println(appleBox.compare(orangeBox1));
    }

}

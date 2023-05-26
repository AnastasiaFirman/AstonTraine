package org.aston.homework1;

import java.util.ArrayList;

/**
 * The MyArrayListStarter class is a starting point for working with the MyArrayList class.
 */

public class MyArrayListStarter {
    public static void main(String[] args) {
        ArrayList<String> strings = new MyArrayList<>();
        strings.add("Маша");
        strings.add("Катя");
        strings.add("Саша");
        strings.add("Вася");
        strings.add("Оля");
        strings.add("Коля");
        strings.add("Петя");
        System.out.println(strings);
        strings.add(5, "Дима");
        System.out.println(strings);
        strings.remove(5);
        System.out.println(strings);
        strings.set(0, "Рома");
        System.out.println(strings);
        strings.add("Антон");
        System.out.println(strings);
        System.out.println(strings.get(0));
        MyArrayList.quickSort(strings);
        System.out.println(strings);
        strings.clear();
        System.out.println(strings);

        ArrayList<Integer> integerList = new MyArrayList<>();
        integerList.add(89);
        integerList.add(1);
        integerList.add(5);
        integerList.add(122);
        integerList.add(586);
        integerList.add(121);
        integerList.add(100);
        integerList.add(18);
        integerList.add(19);
        MyArrayList.quickSort(integerList);
        System.out.println(integerList);
    }
}

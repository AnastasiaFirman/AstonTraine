package org.aston.homework1;

import java.util.*;

/**
 * An extended ArrayList class that implements the List interface.
 * This class contains methods: add element, add element by index,
 * get element, delete element, clear collection, sort.
 * @param <E> the type of elements in the list
 */

public class MyArrayList<E> extends ArrayList<E> {
    /**
     * An array that stores the elements of the collection.
     */
    private E[] currentArray = (E[]) new Object[0];

    /**
     * Returns the number of elements in this list.
     * @return the number of elements in this list
     */
    @Override
    public int size() {
        return currentArray.length;
    }

    /**
     * Returns true if this list contains no elements.
     * @return true if this list contains no elements
     */

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    /**
     * Appends the specified element to the end of this list
     * @return always returns false
     */
    @Override
    public boolean add(E e) {
        E[] newArray = (E[]) new Object[this.size() + 1];
        for (int i = 0; i < this.size(); i++) {
            newArray[i] = currentArray[i];
        }
        newArray[newArray.length - 1] = e;
        currentArray = newArray;
        return false;
    }

    /**
     * Inserts the specified element at the specified position in this list.
     * @param index index at which the specified element is to be inserted
     * @param element element to be inserted
     */
    @Override
    public void add(int index, E element) {
        E[] newArray = (E[]) new Object[this.size() + 1];
        for (int i = 0; i < index; i++) {
            newArray[i] = currentArray[i];
        }
        newArray[index] = element;
        for (int i = index; i < currentArray.length; i++) {
            newArray[i + 1] = currentArray[i];
        }
        currentArray = newArray;
    }

    /**
     * Removes the element at the specified position in this list.
     * @param index the index of the element to be removed
     * @return the element previously at the specified position
     */
    @Override
    public E remove(int index) {
        E[] newArray = (E[]) new Object[this.size() - 1];
        for (int i = 0; i < index; i++) {
            newArray[i] = currentArray[i];
        }
        for (int i = index + 1; i < currentArray.length; i++) {
            newArray[i - 1] = currentArray[i];
        }
        currentArray = newArray;
        return newArray[index];
    }

    /**
     * Returns the element at the specified position in this list.
     * @param index index of the element to return
     * @return the element at the specified position in this list
     */
    @Override
    public E get(int index) {
        return currentArray[index];
    }

    /**
     * Replaces the element at the specified position in this list with the specified element.
     * @param index index of the element to replace
     * @param element element to be stored at the specified position
     * @return the element previously at the specified position
     */
    @Override
    public E set(int index, E element) {
        E currentElement = currentArray[index];
        currentArray[index] = element;
        return currentElement;
    }

    /**
     * Removes all the elements from this list.
     */
    @Override
    public void clear() {
        currentArray = (E[]) new Object[0];
    }

    /**
     * Returns a string representation of this list.
     * @return a string representation of this list.
     */
    @Override
    public String toString() {
        return Arrays.toString(this.currentArray);
    }

    /**
     * Sorts the input list in ascending order using the quickSort algorithm.
     * This method takes a list of Comparable elements and sorts it in ascending order.
     * It uses recursion to split the list into two parts, sort them separately,
     * and then merge them back together.
     * @param arr input list to sort
     * @param <E> the type of elements in the list
     */
    public static <E extends Comparable<E>> void quickSort(ArrayList<E> arr) {
        if (arr == null || arr.size() <= 1) {
            return;
        }
        int midIndex = arr.size() / 2;
        E mid = arr.get(midIndex);
        ArrayList<E> left = new ArrayList<>();
        ArrayList<E> right = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            if (i == midIndex) {
                continue;
            }
            E element = arr.get(i);
            if (element.compareTo(mid) <= 0) {
                left.add(element);
            } else {
                right.add(element);
            }
        }
        quickSort(left);
        quickSort(right);
        ArrayList<E> result = new ArrayList<>(left);
        result.add(mid);
        result.addAll(right);
        for (int i = 0; i < arr.size(); i++) {
            arr.set(i, result.get(i));
        }
    }
}

import org.aston.homework1.MyArrayList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class MyArrayListTest {
    @Test
    public void addTest() {
        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(1);
        Assertions.assertEquals(1, list.size());
        Assertions.assertEquals(Integer.valueOf(1), list.get(0));
    }

    @Test
    public void addByIndexTest() {
        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(1);
        list.add(2);
        list.add(0, 3);
        Assertions.assertEquals(3, list.size());
        Assertions.assertEquals(Integer.valueOf(3), list.get(0));
        Assertions.assertEquals(Integer.valueOf(1), list.get(1));
        Assertions.assertEquals(Integer.valueOf(2), list.get(2));
    }

    @Test
    public void removeTest() {
        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Integer removedElement = list.remove(0);
        Assertions.assertEquals(2, list.size());
        Assertions.assertEquals(Integer.valueOf(2), list.get(0));
        Assertions.assertEquals(Integer.valueOf(3), list.get(1));
    }

    @Test
    public void getTest() {
        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Assertions.assertEquals(Integer.valueOf(1), list.get(0));
    }

    @Test
    public void testSet() {
        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Integer replacedElement = list.set(0, 4);
        Assertions.assertEquals(Integer.valueOf(1), replacedElement);
        Assertions.assertEquals(Integer.valueOf(4), list.get(0));
    }

    @Test
    public void testClear() {
        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(1);
        list.add(2);
        list.clear();
        Assertions.assertEquals(0, list.size());
    }

    @Test
    void quickSortTest() {
        ArrayList<Integer> integerList = new MyArrayList<>();
        integerList.add(2);
        integerList.add(1);
        integerList.add(3);
        ArrayList<Integer> expected = new MyArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        MyArrayList.quickSort(integerList);
        Assertions.assertEquals(expected, integerList);

        ArrayList<String> stringList = new MyArrayList<>();
        stringList.add("Настя");
        stringList.add("Катя");
        stringList.add("Дима");
        stringList.add("Вася");
        ArrayList<String> expected2 = new MyArrayList<>();
        expected2.add("Вася");
        expected2.add("Дима");
        expected2.add("Катя");
        expected2.add("Настя");
        MyArrayList.quickSort(stringList);
        Assertions.assertEquals(expected2, stringList);
    }

    @Test
    public void testToString() {
        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        String expected = "[1, 2, 3]";
        String actual = list.toString();
        Assertions.assertEquals(expected, actual);
    }
}

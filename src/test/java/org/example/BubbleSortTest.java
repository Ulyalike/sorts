package org.example;


import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;


public class BubbleSortTest {
  @Test
  public void TestSort() {
    List<Integer> list = new ArrayList<>();
    list.add(5);
    list.add(2);
    list.add(8);
    list.add(1);
    list.add(9);

    BubbleSort Bubble = new BubbleSort();
    List<Integer> SortedList = Bubble.sort(list);

    List<Integer> ExpectedList = new ArrayList<>();
    ExpectedList.add(1);
    ExpectedList.add(2);
    ExpectedList.add(5);
    ExpectedList.add(8);
    ExpectedList.add(9);

    assertEquals(ExpectedList, SortedList);
  }

  @Test
  public void TestEmptyList() {
    List<Integer> list = new ArrayList<>();

    BubbleSort Bubble = new BubbleSort();
    List<Integer> SortedList = Bubble.sort(list);

    assertEquals(list, SortedList);
  }

  @Test
  public void TestOneElementList() {
    List<Integer> list = new ArrayList<>();
    list.add(1);

    BubbleSort Bubble = new BubbleSort();
    List<Integer> SortedList = Bubble.sort(list);

    assertEquals(list, SortedList);
  }

  @Test
  public void testSortedList() {
    List<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);

    BubbleSort Bubble = new BubbleSort();
    List<Integer> SortedList = Bubble.sort(list);

    assertEquals(list, SortedList);
  }
}
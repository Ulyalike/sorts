package org.example;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class MergeSortTest {
  @Test
  public void testSort() {
    List<Integer> list = new ArrayList<>();
    list.add(5);
    list.add(2);
    list.add(8);
    list.add(1);
    list.add(9);

    MergeSort Merge = new MergeSort();
    List<Integer> SortedList = Merge.sort(list);

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

    MergeSort Merge = new MergeSort();
    List<Integer> SortedList = Merge.sort(list);

    assertEquals(list, SortedList);
  }

  @Test
  public void TestOneElementList() {
    List<Integer> list = new ArrayList<>();
    list.add(1);

    MergeSort Merge = new MergeSort();
    List<Integer> SortedList = Merge.sort(list);

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

    MergeSort Merge = new MergeSort();
    List<Integer> SortedList = Merge.sort(list);

    assertEquals(list, SortedList);
  }
}
package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    list.add(5);
    list.add(4);
    list.add(3);
    list.add(2);
    list.add(1);

    System.out.println("Before sorting:");
    System.out.println(list);

    VaritySorts Merge = new MergeSort();
    List<Integer> SortedList1 = Interface.sort(list, Merge);
    System.out.println("After sorting with MergeSort:");
    System.out.println(SortedList1);

    VaritySorts Bubble = new BubbleSort();
    List<Integer> SortedList2 = Interface.sort(list, Bubble);
    System.out.println("After sorting with BubbleSort:");
    System.out.println(SortedList2);
  }
}
package org.example;

import java.util.ArrayList;
import java.util.List;

public class BubbleSort implements VaritySorts {
  @Override
  public List<Integer> sort(List<Integer> list) {
    List<Integer> SortedList = new ArrayList<>(list);
    for (int i = 0; i < SortedList.size() - 1; i++) {
      for (int j = i+1; j < SortedList.size() ; j++) {
        if (SortedList.get(i) > SortedList.get(j )) {
          // Swap elements
          int temp = SortedList.get(i);
          SortedList.set(i, SortedList.get(j));
          SortedList.set(j, temp);
        }
      }
    }
    return SortedList;
  }
}
package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeSort implements VaritySorts {
  @Override
  public List<Integer> sort(List<Integer> list) {
    List<Integer> SortedList = new ArrayList<>(list);
    Collections.sort(SortedList);
    return SortedList;
  }
}

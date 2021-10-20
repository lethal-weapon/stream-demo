package com.thoughtworks.collection;

import java.util.List;
import java.util.stream.Collectors;

public class StreamSupplement {

  public StreamSupplement() {
  }

  public List<Integer> sortFromMaxToMin(List<Integer> numbers) {
    return numbers
      .stream()
      .sorted((n1, n2) -> n2 - n1)
      .collect(Collectors.toList());
  }

  public double getAverage(List<Integer> numbers) {
    return numbers
      .stream()
      .mapToInt(Integer::new)
      .average()
      .orElse(0d);
  }

  public int getMaxValue(List<Integer> numbers) {
    return numbers
      .stream()
      .max(Integer::compareTo)
      .orElse(0);
  }
}

package com.thoughtworks.collection;

import java.util.List;

public class StreamReduce {

  public int getLastOdd(List<Integer> numbers) {
    return numbers
      .stream()
      .filter(n -> n % 2 != 0)
      .reduce((n1, n2) -> n2)
      .orElse(0);
  }

  public String getLongest(List<String> words) {
    return words
      .stream()
      .reduce((w1, w2) -> w1.length() >= w2.length() ? w1 : w2)
      .orElse("");
  }

  public int getTotalLength(List<String> words) {
    return words
      .stream()
      .reduce(String::concat)
      .orElse("")
      .length();
  }
}

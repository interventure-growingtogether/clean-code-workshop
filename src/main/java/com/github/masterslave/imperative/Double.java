package com.github.masterslave.imperative;

public class Double {

  private Integer intF = 0; // first number divisible by two

  public Integer number() {
    Integer[] numbers = new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    for (Integer nmbr : numbers) {
      if (nmbr % 2 == 0 && nmbr > 3) {
        intF = nmbr;
        break;
      }
    }

    return intF * 2;
  }

}

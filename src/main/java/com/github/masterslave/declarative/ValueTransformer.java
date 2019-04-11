package com.github.masterslave.declarative;

import static com.github.masterslave.declarative.ValueOperations.isDivisibleByTwo;
import static com.github.masterslave.declarative.ValueOperations.isGreaterThenThree;
import static com.github.masterslave.declarative.ValueOperations.multiplyByTwo;
import static com.github.masterslave.declarative.ValueOperations.numbers;

import java.util.Optional;

public class ValueTransformer {

  public Optional<Integer> multiplyFirstEvenGreaterThenThree() {
    return numbers(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        .filter(isGreaterThenThree().and(isDivisibleByTwo()))
        .map(multiplyByTwo())
        .findFirst();
  }

}

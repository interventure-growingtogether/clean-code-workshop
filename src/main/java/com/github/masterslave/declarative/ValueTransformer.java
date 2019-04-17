package com.github.masterslave.declarative;

import static com.github.masterslave.declarative.ValueOperations.isDivisibleByTwo;
import static com.github.masterslave.declarative.ValueOperations.isGreaterThanThree;
import static com.github.masterslave.declarative.ValueOperations.multiplyByTwo;
import static com.github.masterslave.declarative.ValueOperations.numbers;

import java.util.Optional;

public class ValueTransformer {

  public Optional<Integer> multiplyFirstEvenGreaterThanThree() {
    return numbers(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        .filter(isGreaterThanThree().and(isDivisibleByTwo()))
        .map(multiplyByTwo())
        .findFirst();
  }

}

package com.github.masterslave.declarative;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * @author <a href="mailto:slavisa.avramovic@escriba.de">avramovics</a>
 * @since 2019-04-02
 */
public class ValueOperations {

  public static Stream<Integer> numbers(Integer... integers) {
    return Arrays.stream(integers);
  }

  public static Predicate<Integer> isGreaterThanThree() {
    return n -> n > 3;
  }

  public static Predicate<Integer> isDivisibleByTwo() {
    return n -> n % 2 == 0;
  }

  public static Function<Integer, Integer> multiplyByTwo() {
    return n -> n * 2;
  }

}

package com.github.masterslave.imperative.cleancode;

// Violation 1: Intention Revealing Names => Double to Multiplier
// Violation 2: Use proper language constructs, classname should be a noun
public class Double {

  // Violation 3: Avoid encodings = int is not a necessary prefix
  // Violation 4: Express comments in code => rename variable to firstDivisibleByTwo
  // Violation 5: Use declaration close to its usage => move to a local variable of number method
  private Integer intF = 0; // first number divisible by two


  // Violation 6: Intention Revealing Names
  // Violation 7: Use proper language constructs, function should be a verb => number() to findFirstNumberEvenAndGreater()
  public Integer number() {
    Integer[] numbers = new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    // Violation 8: use pronounceable names => nmbr to number
    // Violation 9: Scope Rule, use short variable names in short scopes =>  for (Integer n : numbers)
    for (Integer nmbr : numbers) {
      // Violation 10: Function with multiple tabs => replace with streams
      // Violation 11: Extract boolean methods and name accordingly
      if (nmbr % 2 == 0 && nmbr > 3) {
        // Violation 12: Scope Rule intF is shorter than nmbr, yet intF has larger scope
        intF = nmbr;
        break;
      }
    }

    return intF * 2;
  }

}

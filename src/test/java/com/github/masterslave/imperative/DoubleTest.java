package com.github.masterslave.imperative;

import static org.junit.Assert.assertThat;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

/**
 * @author <a href="mailto:slavisa.avramovic@escriba.de">avramovics</a>
 * @since 2019-03-27
 */
public class DoubleTest {

  private Double aDouble = new Double();

  @Test
  public void doubleFirstEven() {
    Integer r = aDouble.number();
    assertThat(r, CoreMatchers.is(8));
  }
}

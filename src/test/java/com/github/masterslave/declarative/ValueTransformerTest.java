package com.github.masterslave.declarative;

import static org.junit.Assert.*;

import java.util.Optional;
import org.hamcrest.CoreMatchers;
import org.junit.Test;

/**
 * @author <a href="mailto:slavisa.avramovic@escriba.de">avramovics</a>
 * @since 2019-03-27
 */
public class ValueTransformerTest {

  private ValueTransformer valueTransformer = new ValueTransformer();

  @Test
  public void testDoubleFirstEvent() {
    Optional<Integer> r = valueTransformer.multiplyFirstEvenGreaterThanThree();
    assertThat(r.isPresent(), CoreMatchers.is(Boolean.TRUE));
    assertThat(r.get(), CoreMatchers.is(8));
  }
}

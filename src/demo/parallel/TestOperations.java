package demo.parallel;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestOperations {

  private Complex complexA;
  private Complex complexB;

  @BeforeEach
  public void setUp() {
    complexA = new Complex(2, 3);
    complexB = new Complex(1, 1);
  }

  @Test
  public void testMinus() {
    Complex result = complexA.minus(complexB);

    assertEquals(1, result.re);
    assertEquals(2, result.im);
  }

  @Test
  public void testExp() {
    Complex result = complexA.exp(2);

    assertEquals(-5, result.re);
    assertEquals(12, result.im);
  }
}
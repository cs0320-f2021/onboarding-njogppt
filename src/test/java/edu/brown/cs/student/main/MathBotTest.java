package edu.brown.cs.student.main;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MathBotTest {

  @Test
  public void testAddition() {
    MathBot matherator9000 = new MathBot();
    double output = matherator9000.add(10.5, 3);
    assertEquals(13.5, output, 0.01);
  }

  @Test
  public void testLargerNumbers() {
    MathBot matherator9001 = new MathBot();
    double output = matherator9001.add(100000, 200303);
    assertEquals(300303, output, 0.01);
  }

  @Test
  public void testSubtraction() {
    MathBot matherator9002 = new MathBot();
    double output = matherator9002.subtract(18, 17);
    assertEquals(1, output, 0.01);
  }

  // TODO: add more unit tests of your own
  @Test
  public void testAdditionWithBothNegative() {
    MathBot matherator9000 = new MathBot();
    double output = matherator9000.add(-5, -3.4);
    assertEquals(-8.4, output, 0.01);
  }

  @Test
  public void testBothDecimals() {
    MathBot matherator9001 = new MathBot();
    double output = matherator9001.add(4.5, -2.1);
    assertEquals(2.4, output, 0.01);
  }

  @Test
  public void testSubtraction2() {
    MathBot matherator9002 = new MathBot();
    double output = matherator9002.subtract(18.0, 7.0);
    assertEquals(11.0, output, 0.01);
  }

  @Test
  public void testAdditionWithTensPlace() {
    MathBot matherator9000 = new MathBot();
    double output = matherator9000.add(10.54, 3);
    assertEquals(13.54, output, 0.01);
  }

  @Test
  public void testLargerNumbers3() {
    MathBot matherator9001 = new MathBot();
    double output = matherator9001.add(100, 200303);
    assertEquals(200403, output, 0.01);
  }

  @Test
  public void testSubtractionWithNegatives() {
    MathBot matherator9002 = new MathBot();
    double output = matherator9002.subtract(-18, -17);
    assertEquals(-1, output, 0.01);
  }
}

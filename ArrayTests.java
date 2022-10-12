import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = {3, 6, 5};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{5, 6, 3}, input1);

    int[] input2 = {3, 5};
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{5, 3}, input2);
	}


  @Test
  public void testReversed() {
    int[] input1 = {5, 6};
    assertArrayEquals(new int[]{6, 5}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testAverageWithoutLowest() {
    double[] input1 = {5.0, 6.2, 8.8, 5.0};
    double ans = (6.2 + 8.8 + 5.0) / 3;
    assertEquals(ans, ArrayExamples.averageWithoutLowest(input1), 0.1);
  }
}

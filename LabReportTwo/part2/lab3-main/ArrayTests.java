import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
  @Test
  public void testReversedExpectedFailure() {
    int[] input1 = {1, 2, 3};
    assertArrayEquals(new int[]{3, 2, 1}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversedExpectedNOFailure() {
    int[] input1 = {};
    assertArrayEquals(new int[]{}, ArrayExamples.reversed(input1));
  }

}





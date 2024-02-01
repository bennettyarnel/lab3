import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }
  @Test
  public void testEmptyReversed (){
    int [] testArray = new int [0];
    int [] testArray2 = new int[0];
    ArrayExamples.reversed(testArray);
    ArrayExamples.reverseInPlace(testArray2);
    assertArrayEquals(new int[] {}, ArrayExamples.reversed(testArray));
    assertEquals(testArray.length, 0);
    assertEquals(testArray2.length, 0);

  }
  @Test
  public void testReversal(){
    int [] testArray = {1,2,3,4,5};
    int [] testArray2 = {1,2,3,4,5};
    ArrayExamples.reverseInPlace(testArray2);
    int [] expectedVal = testArray2;
    
    assertArrayEquals(new int[] {5,4,3,2,1}, ArrayExamples.reversed(testArray)); 
    assertEquals(expectedVal, testArray2);
    

  }

}

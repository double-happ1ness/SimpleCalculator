package simpleCalc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class SimpleCalculatorTest {

	@Test
	void testSumOfTwoPositiveIntegers() {
		//Test Input
		int a = 3;
		int b = 2;
		//Test output
		int expectedOutput = 5 ;
		//Unit under test
		SimpleCalculator sc = new SimpleCalculator();
		//actual output / test output
		int actualOutput = sc.sum(a, b);
		//Comparison to Speciication
		Assert.assertEquals(expectedOutput, actualOutput);
		
	}

}

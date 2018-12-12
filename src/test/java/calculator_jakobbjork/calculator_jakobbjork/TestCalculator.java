package calculator_jakobbjork.calculator_jakobbjork;

import static org.junit.Assert.*;


import org.junit.Test;

import calculator_jakobbjork.calculator_jakobbjork.AdvancedCalculator;
import calculator_jakobbjork.calculator_jakobbjork.BasicCalculator;



/**
 * 
 * @author jakobb
 *
 */

public class TestCalculator {
	
	/**
	 * Running 9 different tests for the two different calculators
	 * Both calculators will cycle through +, -, * and / with both positive input values, first value negative, second value negative and both values negative.
	 * The advanced calculator will also cycle through the advanced functions.
	 */
	
	@Test
	public void test0BasicAllPositive() {  
		/**
		 * Tests the basic calculator by cycling through addition, subtraction, multiplication and division with both input values positive
		 * 
		 */
		System.out.println("Testing the basic calculator with all positive values:");
		BasicCalculator basicCalc = new BasicCalculator();
		
		for(int i = 0; i < 60; i++){
			System.out.println("Test " + (i+1) + " of basic with all positive.");
			basicCalc.clearButton();
			int inputA = (int) (Math.random()*10);
			int inputB = i%4;
			int inputC = (int) (Math.random()*10);
			if(inputA == 0){
				basicCalc.zeroButton();
			}
			else if(inputA == 1){
				basicCalc.oneButton();
			}
			else if(inputA == 2){
				basicCalc.twoButton();
			}
			else if(inputA == 3){
				basicCalc.threeButton();
			}
			else if(inputA == 4){
				basicCalc.fourButton();
			}
			else if(inputA == 5){
				basicCalc.fiveButton();
			}
			else if(inputA == 6){
				basicCalc.sixButton();
			}
			else if(inputA == 7){
				basicCalc.sevenButton();
			}
			else if(inputA == 8){
				basicCalc.eightButton();
			}
			else if(inputA == 9){
				basicCalc.nineButton();
			}
			
			if(inputB == 0){
				basicCalc.addition();
			}
			else if(inputB == 1){
				basicCalc.subtraction();
			}
			else if(inputB == 2){
				basicCalc.multiplication();
			}
			else if(inputB == 3){
				basicCalc.division();
			}
			
			if(inputC == 0){
				basicCalc.zeroButton();
			}
			else if(inputC == 1){
				basicCalc.oneButton();
			}
			else if(inputC == 2){
				basicCalc.twoButton();
			}
			else if(inputC == 3){
				basicCalc.threeButton();
			}
			else if(inputC == 4){
				basicCalc.fourButton();
			}
			else if(inputC == 5){
				basicCalc.fiveButton();
			}
			else if(inputC == 6){
				basicCalc.sixButton();
			}
			else if(inputC == 7){
				basicCalc.sevenButton();
			}
			else if(inputC == 8){
				basicCalc.eightButton();
			}
			else if(inputC == 9){
				basicCalc.nineButton();
			}
			
			basicCalc.equals();
			
			double testResult = 0;
			String stringA = String.valueOf(inputA);
			double doubleA = Double.parseDouble(stringA);
			String stringC = String.valueOf(inputC);
			double doubleC = Double.parseDouble(stringC);
			if(inputB == 0){
				testResult = (doubleA + doubleC);
				System.out.println("The result should be: " + (doubleA + doubleC));
			}
			else if(inputB == 1){
				testResult = (doubleA - doubleC);
				System.out.println("The result should be: " + (doubleA - doubleC));
			}
			else if(inputB == 2){
				testResult = (doubleA * doubleC);
				System.out.println("The result should be: " + (doubleA * doubleC));
			}
			else if(inputB == 3){
				testResult = (doubleA / doubleC);
				System.out.println("The result should be: " + (doubleA / doubleC));
			}
			
			
			
			
			double expected = testResult;
			double actual = basicCalc.getCalcResult();
			assertEquals(expected, actual, 0);
			
			System.out.println("");
		}
		
	}
	
	@Test
	public void test1BasicFirstNegative() {
		/**
		 * 
		 * Tests the basic calculator by cycling through addition, subtraction, multiplication and division with the first input value negative
		 */
		System.out.println("Testing the basic calculator with the first value negative:");
		BasicCalculator basicCalc = new BasicCalculator();
		
		for(int i = 0; i < 60; i++){
			System.out.println("Test " + (i+1) + " of basic with first negative.");
			basicCalc.clearButton();
			int inputA = (int) (Math.random()*10);
			int inputB = i%4;
			int inputC = (int) (Math.random()*10);
			basicCalc.paranthesisLeft();
			basicCalc.subtraction();
			if(inputA == 0){
				basicCalc.zeroButton();
			}
			else if(inputA == 1){
				basicCalc.oneButton();
			}
			else if(inputA == 2){
				basicCalc.twoButton();
			}
			else if(inputA == 3){
				basicCalc.threeButton();
			}
			else if(inputA == 4){
				basicCalc.fourButton();
			}
			else if(inputA == 5){
				basicCalc.fiveButton();
			}
			else if(inputA == 6){
				basicCalc.sixButton();
			}
			else if(inputA == 7){
				basicCalc.sevenButton();
			}
			else if(inputA == 8){
				basicCalc.eightButton();
			}
			else if(inputA == 9){
				basicCalc.nineButton();
			}
			basicCalc.paranthesisRight();
			
			if(inputB == 0){
				basicCalc.addition();
			}
			else if(inputB == 1){
				basicCalc.subtraction();
			}
			else if(inputB == 2){
				basicCalc.multiplication();
			}
			else if(inputB == 3){
				basicCalc.division();
			}
			
			if(inputC == 0){
				basicCalc.zeroButton();
			}
			else if(inputC == 1){
				basicCalc.oneButton();
			}
			else if(inputC == 2){
				basicCalc.twoButton();
			}
			else if(inputC == 3){
				basicCalc.threeButton();
			}
			else if(inputC == 4){
				basicCalc.fourButton();
			}
			else if(inputC == 5){
				basicCalc.fiveButton();
			}
			else if(inputC == 6){
				basicCalc.sixButton();
			}
			else if(inputC == 7){
				basicCalc.sevenButton();
			}
			else if(inputC == 8){
				basicCalc.eightButton();
			}
			else if(inputC == 9){
				basicCalc.nineButton();
			}
			
			basicCalc.equals();
			
			double testResult = 0;
			String stringA = String.valueOf(inputA);
			double doubleA = Double.parseDouble(stringA);
			String stringC = String.valueOf(inputC);
			double doubleC = Double.parseDouble(stringC);
			if(inputB == 0){
				testResult = ((-doubleA) + doubleC);
				System.out.println("The result should be: " + ((-doubleA) + doubleC));
			}
			else if(inputB == 1){
				testResult = ((-doubleA) - doubleC);
				System.out.println("The result should be: " + ((-doubleA) - doubleC));
			}
			else if(inputB == 2){
				testResult = ((-doubleA) * doubleC);
				System.out.println("The result should be: " + ((-doubleA) * doubleC));
			}
			else if(inputB == 3){
				testResult = ((-doubleA) / doubleC);
				System.out.println("The result should be: " + ((-doubleA) / doubleC));
			}

			
			

			double expected = testResult;
			double actual = basicCalc.getCalcResult();
			assertEquals(expected, actual, 0);
			System.out.println("");
		}
		
	}
	
	@Test
	public void test2BasicSecondNegative() {
		
		/**
		 * 
		 * Tests the basic calculator by cycling through addition, subtraction, multiplication and division with both the second input value negative
		 */
		
		System.out.println("Testing the basic calculator with the second value negative:");
		BasicCalculator basicCalc = new BasicCalculator();

		for(int i = 0; i < 60; i++){
			System.out.println("Test " + (i+1) + "of basic with last negative.");
			basicCalc.clearButton();
			int inputA = (int) (Math.random()*10);
			int inputB = i%4;
			int inputC = (int) (Math.random()*10);
			if(inputA == 0){
				basicCalc.zeroButton();
			}
			else if(inputA == 1){
				basicCalc.oneButton();
			}
			else if(inputA == 2){
				basicCalc.twoButton();
			}
			else if(inputA == 3){
				basicCalc.threeButton();
			}
			else if(inputA == 4){
				basicCalc.fourButton();
			}
			else if(inputA == 5){
				basicCalc.fiveButton();
			}
			else if(inputA == 6){
				basicCalc.sixButton();
			}
			else if(inputA == 7){
				basicCalc.sevenButton();
			}
			else if(inputA == 8){
				basicCalc.eightButton();
			}
			else if(inputA == 9){
				basicCalc.nineButton();
			}
			
			if(inputB == 0){
				basicCalc.addition();
			}
			else if(inputB == 1){
				basicCalc.subtraction();
			}
			else if(inputB == 2){
				basicCalc.multiplication();
			}
			else if(inputB == 3){
				basicCalc.division();
			}
			basicCalc.paranthesisLeft();
			basicCalc.subtraction();
			if(inputC == 0){
				basicCalc.zeroButton();
			}
			else if(inputC == 1){
				basicCalc.oneButton();
			}
			else if(inputC == 2){
				basicCalc.twoButton();
			}
			else if(inputC == 3){
				basicCalc.threeButton();
			}
			else if(inputC == 4){
				basicCalc.fourButton();
			}
			else if(inputC == 5){
				basicCalc.fiveButton();
			}
			else if(inputC == 6){
				basicCalc.sixButton();
			}
			else if(inputC == 7){
				basicCalc.sevenButton();
			}
			else if(inputC == 8){
				basicCalc.eightButton();
			}
			else if(inputC == 9){
				basicCalc.nineButton();
			}
			basicCalc.paranthesisRight();
			basicCalc.equals();
			
			double testResult = 0;
			String stringA = String.valueOf(inputA);
			double doubleA = Double.parseDouble(stringA);
			String stringC = String.valueOf(inputC);
			double doubleC = Double.parseDouble(stringC);
			if(inputB == 0){
				testResult = (doubleA + (-doubleC));
				System.out.println("The result should be: " + (doubleA + (-doubleC)));
			}
			else if(inputB == 1){
				testResult = (doubleA - (-doubleC));
				System.out.println("The result should be: " + (doubleA - (-doubleC)));
			}
			else if(inputB == 2){
				testResult = (doubleA * (-doubleC));
				System.out.println("The result should be: " + (doubleA * (-doubleC)));
			}
			else if(inputB == 3){
				testResult = (doubleA / (-doubleC));
				System.out.println("The result should be: " + (doubleA / (-doubleC)));
			}

			

			double expected = testResult;
			double actual = basicCalc.getCalcResult();
			assertEquals(expected, actual, 0);
			System.out.println("");
		}
		
	}
	

	@Test
	public void test3BasicAllNegative() {
		
		/**
		 * 
		 * Tests the basic calculator by cycling through addition, subtraction, multiplication and division with both input values negative
		 * 
		 */
		System.out.println("Testing the basic calculator with both values negative:");
		BasicCalculator basicCalc = new BasicCalculator();

		for(int i = 0; i < 60; i++){
			System.out.println("Test " + (i+1) + "of basic with all negative.");
			basicCalc.clearButton();
			int inputA = (int) (Math.random()*10);
			int inputB = i%4;
			int inputC = (int) (Math.random()*10);
			basicCalc.paranthesisLeft();
			basicCalc.subtraction();
			if(inputA == 0){
				basicCalc.zeroButton();
			}
			else if(inputA == 1){
				basicCalc.oneButton();
			}
			else if(inputA == 2){
				basicCalc.twoButton();
			}
			else if(inputA == 3){
				basicCalc.threeButton();
			}
			else if(inputA == 4){
				basicCalc.fourButton();
			}
			else if(inputA == 5){
				basicCalc.fiveButton();
			}
			else if(inputA == 6){
				basicCalc.sixButton();
			}
			else if(inputA == 7){
				basicCalc.sevenButton();
			}
			else if(inputA == 8){
				basicCalc.eightButton();
			}
			else if(inputA == 9){
				basicCalc.nineButton();
			}
			basicCalc.paranthesisRight();
			
			if(inputB == 0){
				basicCalc.addition();
			}
			else if(inputB == 1){
				basicCalc.subtraction();
			}
			else if(inputB == 2){
				basicCalc.multiplication();
			}
			else if(inputB == 3){
				basicCalc.division();
			}
			
			basicCalc.paranthesisLeft();
			basicCalc.subtraction();
			if(inputC == 0){
				basicCalc.zeroButton();
			}
			else if(inputC == 1){
				basicCalc.oneButton();
			}
			else if(inputC == 2){
				basicCalc.twoButton();
			}
			else if(inputC == 3){
				basicCalc.threeButton();
			}
			else if(inputC == 4){
				basicCalc.fourButton();
			}
			else if(inputC == 5){
				basicCalc.fiveButton();
			}
			else if(inputC == 6){
				basicCalc.sixButton();
			}
			else if(inputC == 7){
				basicCalc.sevenButton();
			}
			else if(inputC == 8){
				basicCalc.eightButton();
			}
			else if(inputC == 9){
				basicCalc.nineButton();
			}
			basicCalc.paranthesisRight();
			basicCalc.equals();
			
			double testResult = 0;
			String stringA = String.valueOf(inputA);
			double doubleA = Double.parseDouble(stringA);
			String stringC = String.valueOf(inputC);
			double doubleC = Double.parseDouble(stringC);
			if(inputB == 0){
				testResult = ((-doubleA) + (-doubleC));
				System.out.println("The result should be: " + ((-doubleA) + (-doubleC)));
			}
			else if(inputB == 1){
				testResult = ((-doubleA) - (-doubleC));
				System.out.println("The result should be: " + ((-doubleA) - (-doubleC)));
			}
			else if(inputB == 2){
				testResult = ((-doubleA) * (-doubleC));
				System.out.println("The result should be: " + ((-doubleA) * (-doubleC)));
			}
			else if(inputB == 3){
				testResult = ((-doubleA) / (-doubleC));
				System.out.println("The result should be: " + ((-doubleA) / (-doubleC)));
			}

			

			double expected = testResult;
			double actual = basicCalc.getCalcResult();
			assertEquals(expected, actual, 0);
			System.out.println("");
		}
		
	}
	

	@Test
	public void test4AdvancedAllPositive() {
		
		/**
		 * 
		 * Tests the advanced calculator by cycling through addition, subtraction, multiplication and division with both input values positive	
		 * 
		 */
		System.out.println("Testing the advanced calculator with all positive values:");
		AdvancedCalculator advancedCalc = new AdvancedCalculator();
		
		for(int i = 0; i < 60; i++){
			System.out.println("Test " + (i+1) + "of adv with all positive.");
			advancedCalc.clearButton();
			int inputA = (int) (Math.random()*10);
			int inputB = i%4;
			int inputC = (int) (Math.random()*10);
			if(inputA == 0){
				advancedCalc.zeroButton();
			}
			else if(inputA == 1){
				advancedCalc.oneButton();
			}
			else if(inputA == 2){
				advancedCalc.twoButton();
			}
			else if(inputA == 3){
				advancedCalc.threeButton();
			}
			else if(inputA == 4){
				advancedCalc.fourButton();
			}
			else if(inputA == 5){
				advancedCalc.fiveButton();
			}
			else if(inputA == 6){
				advancedCalc.sixButton();
			}
			else if(inputA == 7){
				advancedCalc.sevenButton();
			}
			else if(inputA == 8){
				advancedCalc.eightButton();
			}
			else if(inputA == 9){
				advancedCalc.nineButton();
			}
			
			if(inputB == 0){
				advancedCalc.addition();
			}
			else if(inputB == 1){
				advancedCalc.subtraction();
			}
			else if(inputB == 2){
				advancedCalc.multiplication();
			}
			else if(inputB == 3){
				advancedCalc.division();
			}
			
			if(inputC == 0){
				advancedCalc.zeroButton();
			}
			else if(inputC == 1){
				advancedCalc.oneButton();
			}
			else if(inputC == 2){
				advancedCalc.twoButton();
			}
			else if(inputC == 3){
				advancedCalc.threeButton();
			}
			else if(inputC == 4){
				advancedCalc.fourButton();
			}
			else if(inputC == 5){
				advancedCalc.fiveButton();
			}
			else if(inputC == 6){
				advancedCalc.sixButton();
			}
			else if(inputC == 7){
				advancedCalc.sevenButton();
			}
			else if(inputC == 8){
				advancedCalc.eightButton();
			}
			else if(inputC == 9){
				advancedCalc.nineButton();
			}
			
			advancedCalc.equals();
			double testResult = 0;
			String stringA = String.valueOf(inputA);
			double doubleA = Double.parseDouble(stringA);
			String stringC = String.valueOf(inputC);
			double doubleC = Double.parseDouble(stringC);
			if(inputB == 0){
				testResult = (doubleA + doubleC);
				System.out.println("The result should be: " + (doubleA + doubleC));
			}
			else if(inputB == 1){
				testResult = (doubleA - doubleC);
				System.out.println("The result should be: " + (doubleA - doubleC));
			}
			else if(inputB == 2){
				testResult = (doubleA * doubleC);
				System.out.println("The result should be: " + (doubleA * doubleC));
			}
			else if(inputB == 3){
				testResult = (doubleA / doubleC);
				System.out.println("The result should be: " + (doubleA / doubleC));
			}

			

			double expected = testResult;
			double actual = advancedCalc.getCalcResult();
			assertEquals(expected, actual, 0);
			System.out.println("");
		}
		
	}
	
	@Test
	public void test5AdvancedFirstNegative() {
		
		/**
		 * 
		 * Tests the advanced calculator by cycling through addition, subtraction, multiplication and division with the first input value negative
		 * 
		 */
		System.out.println("Testing the advanced calculator with the first value negative:");
		AdvancedCalculator advancedCalc = new AdvancedCalculator();
		
		for(int i = 0; i < 60; i++){
			System.out.println("Test " + (i+1) + "of adv with first negative.");
			advancedCalc.clearButton();
			int inputA = (int) (Math.random()*10);
			int inputB = i%4;
			int inputC = (int) (Math.random()*10);
			advancedCalc.paranthesisLeft();
			advancedCalc.subtraction();
			if(inputA == 0){
				advancedCalc.zeroButton();
			}
			else if(inputA == 1){
				advancedCalc.oneButton();
			}
			else if(inputA == 2){
				advancedCalc.twoButton();
			}
			else if(inputA == 3){
				advancedCalc.threeButton();
			}
			else if(inputA == 4){
				advancedCalc.fourButton();
			}
			else if(inputA == 5){
				advancedCalc.fiveButton();
			}
			else if(inputA == 6){
				advancedCalc.sixButton();
			}
			else if(inputA == 7){
				advancedCalc.sevenButton();
			}
			else if(inputA == 8){
				advancedCalc.eightButton();
			}
			else if(inputA == 9){
				advancedCalc.nineButton();
			}
			advancedCalc.paranthesisRight();
			
			if(inputB == 0){
				advancedCalc.addition();
			}
			else if(inputB == 1){
				advancedCalc.subtraction();
			}
			else if(inputB == 2){
				advancedCalc.multiplication();
			}
			else if(inputB == 3){
				advancedCalc.division();
			}
			
			if(inputC == 0){
				advancedCalc.zeroButton();
			}
			else if(inputC == 1){
				advancedCalc.oneButton();
			}
			else if(inputC == 2){
				advancedCalc.twoButton();
			}
			else if(inputC == 3){
				advancedCalc.threeButton();
			}
			else if(inputC == 4){
				advancedCalc.fourButton();
			}
			else if(inputC == 5){
				advancedCalc.fiveButton();
			}
			else if(inputC == 6){
				advancedCalc.sixButton();
			}
			else if(inputC == 7){
				advancedCalc.sevenButton();
			}
			else if(inputC == 8){
				advancedCalc.eightButton();
			}
			else if(inputC == 9){
				advancedCalc.nineButton();
			}
			
			advancedCalc.equals();
			
			double testResult = 0;
			String stringA = String.valueOf(inputA);
			double doubleA = Double.parseDouble(stringA);
			String stringC = String.valueOf(inputC);
			double doubleC = Double.parseDouble(stringC);
			if(inputB == 0){
				testResult = ((-doubleA) + doubleC);
				System.out.println("The result should be: " + ((-doubleA) + doubleC));
			}
			else if(inputB == 1){
				testResult = ((-doubleA) - doubleC);
				System.out.println("The result should be: " + ((-doubleA) - doubleC));
			}
			else if(inputB == 2){
				testResult = ((-doubleA) * doubleC);
				System.out.println("The result should be: " + ((-doubleA) * doubleC));
			}
			else if(inputB == 3){
				testResult = ((-doubleA) / doubleC);
				System.out.println("The result should be: " + ((-doubleA) / doubleC));
			}

			

			double expected = testResult;
			double actual = advancedCalc.getCalcResult();
			assertEquals(expected, actual, 0);
			System.out.println("");
		}
		
	}
	
	@Test
	public void test6AdvancedSecondNegative() {
		
		/**
		 * 
		 * Tests the advanced calculator by cycling through addition, subtraction, multiplication and division with the second input value negative
		 * 
		 */
		System.out.println("Testing the advanced calculator with the second value negative:");
		AdvancedCalculator advancedCalc = new AdvancedCalculator();

		for(int i = 0; i < 60; i++){
			System.out.println("Test " + (i+1) + "of adv with last negative.");
			advancedCalc.clearButton();
			int inputA = (int) (Math.random()*10);
			int inputB = i%4;
			int inputC = (int) (Math.random()*10);
			if(inputA == 0){
				advancedCalc.zeroButton();
			}
			else if(inputA == 1){
				advancedCalc.oneButton();
			}
			else if(inputA == 2){
				advancedCalc.twoButton();
			}
			else if(inputA == 3){
				advancedCalc.threeButton();
			}
			else if(inputA == 4){
				advancedCalc.fourButton();
			}
			else if(inputA == 5){
				advancedCalc.fiveButton();
			}
			else if(inputA == 6){
				advancedCalc.sixButton();
			}
			else if(inputA == 7){
				advancedCalc.sevenButton();
			}
			else if(inputA == 8){
				advancedCalc.eightButton();
			}
			else if(inputA == 9){
				advancedCalc.nineButton();
			}
			
			if(inputB == 0){
				advancedCalc.addition();
			}
			else if(inputB == 1){
				advancedCalc.subtraction();
			}
			else if(inputB == 2){
				advancedCalc.multiplication();
			}
			else if(inputB == 3){
				advancedCalc.division();
			}
			advancedCalc.paranthesisLeft();
			advancedCalc.subtraction();
			if(inputC == 0){
				advancedCalc.zeroButton();
			}
			else if(inputC == 1){
				advancedCalc.oneButton();
			}
			else if(inputC == 2){
				advancedCalc.twoButton();
			}
			else if(inputC == 3){
				advancedCalc.threeButton();
			}
			else if(inputC == 4){
				advancedCalc.fourButton();
			}
			else if(inputC == 5){
				advancedCalc.fiveButton();
			}
			else if(inputC == 6){
				advancedCalc.sixButton();
			}
			else if(inputC == 7){
				advancedCalc.sevenButton();
			}
			else if(inputC == 8){
				advancedCalc.eightButton();
			}
			else if(inputC == 9){
				advancedCalc.nineButton();
			}
			advancedCalc.paranthesisRight();
			advancedCalc.equals();
			
			double testResult = 0;
			String stringA = String.valueOf(inputA);
			double doubleA = Double.parseDouble(stringA);
			String stringC = String.valueOf(inputC);
			double doubleC = Double.parseDouble(stringC);
			if(inputB == 0){
				testResult = (doubleA + (-doubleC));
				System.out.println("The result should be: " + (doubleA + (-doubleC)));
			}
			else if(inputB == 1){
				testResult = (doubleA - (-doubleC));
				System.out.println("The result should be: " + (doubleA - (-doubleC)));
			}
			else if(inputB == 2){
				testResult = (doubleA * (-doubleC));
				System.out.println("The result should be: " + (doubleA * (-doubleC)));
			}
			else if(inputB == 3){
				testResult = (doubleA / (-doubleC));
				System.out.println("The result should be: " + (doubleA / (-doubleC)));
			}


			double expected = testResult;
			double actual = advancedCalc.getCalcResult();
			assertEquals(expected, actual, 0);
			System.out.println("");
		}
		
	}
	

	@Test
	public void test7AdvancedAllNegative() {
		
		/**
		 * 
		 * Tests the advanced calculator by cycling through addition, subtraction, multiplication and division with both input values negative
		 */
		System.out.println("Testing the advanced calculator with both values negative:");
		AdvancedCalculator advancedCalc = new AdvancedCalculator();

		for(int i = 0; i < 60; i++){
			System.out.println("Test " + (i+1) + "of adv with both negative.");
			advancedCalc.clearButton();
			int inputA = (int) (Math.random()*10);
			int inputB = i%4;
			int inputC = (int) (Math.random()*10);
			advancedCalc.paranthesisLeft();
			advancedCalc.subtraction();
			if(inputA == 0){
				advancedCalc.zeroButton();
			}
			else if(inputA == 1){
				advancedCalc.oneButton();
			}
			else if(inputA == 2){
				advancedCalc.twoButton();
			}
			else if(inputA == 3){
				advancedCalc.threeButton();
			}
			else if(inputA == 4){
				advancedCalc.fourButton();
			}
			else if(inputA == 5){
				advancedCalc.fiveButton();
			}
			else if(inputA == 6){
				advancedCalc.sixButton();
			}
			else if(inputA == 7){
				advancedCalc.sevenButton();
			}
			else if(inputA == 8){
				advancedCalc.eightButton();
			}
			else if(inputA == 9){
				advancedCalc.nineButton();
			}
			advancedCalc.paranthesisRight();
			
			if(inputB == 0){
				advancedCalc.addition();
			}
			else if(inputB == 1){
				advancedCalc.subtraction();
			}
			else if(inputB == 2){
				advancedCalc.multiplication();
			}
			else if(inputB == 3){
				advancedCalc.division();
			}
			
			advancedCalc.paranthesisLeft();
			advancedCalc.subtraction();
			if(inputC == 0){
				advancedCalc.zeroButton();
			}
			else if(inputC == 1){
				advancedCalc.oneButton();
			}
			else if(inputC == 2){
				advancedCalc.twoButton();
			}
			else if(inputC == 3){
				advancedCalc.threeButton();
			}
			else if(inputC == 4){
				advancedCalc.fourButton();
			}
			else if(inputC == 5){
				advancedCalc.fiveButton();
			}
			else if(inputC == 6){
				advancedCalc.sixButton();
			}
			else if(inputC == 7){
				advancedCalc.sevenButton();
			}
			else if(inputC == 8){
				advancedCalc.eightButton();
			}
			else if(inputC == 9){
				advancedCalc.nineButton();
			}
			advancedCalc.paranthesisRight();
			advancedCalc.equals();
			
			double testResult = 0;
			String stringA = String.valueOf(inputA);
			double doubleA = Double.parseDouble(stringA);
			String stringC = String.valueOf(inputC);
			double doubleC = Double.parseDouble(stringC);
			if(inputB == 0){
				testResult = ((-doubleA) + (-doubleC));
				System.out.println("The result should be: " + ((-doubleA) + (-doubleC)));
			}
			else if(inputB == 1){
				testResult = ((-doubleA) - (-doubleC));
				System.out.println("The result should be: " + ((-doubleA) - (-doubleC)));
			}
			else if(inputB == 2){
				testResult = ((-doubleA) * (-doubleC));
				System.out.println("The result should be: " + ((-doubleA) * (-doubleC)));
			}
			else if(inputB == 3){
				testResult = ((-doubleA) / (-doubleC));
				System.out.println("The result should be: " + ((-doubleA) / (-doubleC)));
			}


			double expected = testResult;
			double actual = advancedCalc.getCalcResult();
			assertEquals(expected, actual, 0);
			System.out.println("");
		}
		
	}
	
	@Test
	public void test8AdvancedAdvFunctions() {
		
		/**
		 * Testing the advanced functions of the advanced calculator by cycling through powered numbers, squared numbers, log, cos, sin and square roots
		 */
		System.out.println("Testing the advanced functions of the advanced calculator:");
		AdvancedCalculator advancedCalc = new AdvancedCalculator();

		for(int i = 0; i < 120; i++){
			System.out.println("Test " + (i+1) + "of adv funct.");
			advancedCalc.clearButton();
			int inputA = (int) (Math.random()*10);
			int inputB = i%6;
			System.out.println("The numbers generated were: " + inputA + " and " + inputB);
			
			if(inputA == 0){
				advancedCalc.zeroButton();
			}
			else if(inputA == 1){
				advancedCalc.oneButton();
			}
			else if(inputA == 2){
				advancedCalc.twoButton();
			}
			else if(inputA == 3){
				advancedCalc.threeButton();
			}
			else if(inputA == 4){
				advancedCalc.fourButton();
			}
			else if(inputA == 5){
				advancedCalc.fiveButton();
			}
			else if(inputA == 6){
				advancedCalc.sixButton();
			}
			else if(inputA == 7){
				advancedCalc.sevenButton();
			}
			else if(inputA == 8){
				advancedCalc.eightButton();
			}
			else if(inputA == 9){
				advancedCalc.nineButton();
			}
			
			if(inputB == 0){
				advancedCalc.xX();
				advancedCalc.threeButton();
				advancedCalc.equals();
			}
			else if(inputB == 1){
				advancedCalc.logButton();
				advancedCalc.equals();
			}
			else if(inputB == 2){
				advancedCalc.sqrtButton();
				advancedCalc.equals();
			}
			else if(inputB == 3){
				advancedCalc.xSquared();
				advancedCalc.equals();
			}
			else if(inputB == 4){
				advancedCalc.sinButton();
				advancedCalc.equals();
			}
			else if(inputB == 5){
				advancedCalc.cosButton();
				advancedCalc.equals();
			}
			
			double testResult = 0;
			String stringA = String.valueOf(inputA);
			double doubleA = Double.parseDouble(stringA);
			if(inputB == 0){
				System.out.println("The result should be: " + (Math.pow(doubleA, 3)) + " calculating " + doubleA + "^3");
				testResult = Math.pow(doubleA, 3);
			}
			else if(inputB == 1){
				System.out.println("The result should be: " + (Math.log(doubleA)) + " calculating the log of " + doubleA);
				testResult = Math.log(doubleA);
			}
			else if(inputB == 2){
				System.out.println("The result should be: " + (Math.sqrt(doubleA)) + " calculating the square root of " + doubleA);
				testResult = Math.sqrt(doubleA);
			}
			else if(inputB == 3){
				System.out.println("The result should be: " + (doubleA * doubleA) + " when squaring " + doubleA);
				testResult = (doubleA * doubleA);
			}
			else if(inputB == 4){
				System.out.println("The result should be: " + (Math.sin(doubleA)) + ", calculating the sin of " + doubleA);
				testResult = Math.sin(doubleA);
			}
			else if(inputB == 5){
				System.out.println("The result should be: " + (Math.cos(doubleA)) + ", calculating the cos of " + doubleA);
				testResult = Math.cos(doubleA);
			}

			
			double expected = testResult;
			double actual = advancedCalc.getCalcResult();
			assertEquals(expected, actual, 0);
			System.out.println("");
			
		}
		
	}
	
	@Test
	public void test9BasicInputZero() {  
		/**
		 * Tests the basic calculator by cycling through addition, subtraction, multiplication and division with the first value being 0
		 * 
		 */
		System.out.println("Testing the basic calculator with all positive values:");
		BasicCalculator basicCalc = new BasicCalculator();
		
		for(int i = 0; i < 60; i++){
			System.out.println("Test " + (i+1) + " of basic with all positive.");
			basicCalc.clearButton();
			int inputA = 0;
			int inputB = i%4;
			int inputC = (int) (Math.random()*10);
			if(inputA == 0){
				basicCalc.zeroButton();
			}
			
			if(inputB == 0){
				basicCalc.addition();
			}
			else if(inputB == 1){
				basicCalc.subtraction();
			}
			else if(inputB == 2){
				basicCalc.multiplication();
			}
			else if(inputB == 3){
				basicCalc.division();
			}
			
			if(inputC == 0){
				basicCalc.zeroButton();
			}
			else if(inputC == 1){
				basicCalc.oneButton();
			}
			else if(inputC == 2){
				basicCalc.twoButton();
			}
			else if(inputC == 3){
				basicCalc.threeButton();
			}
			else if(inputC == 4){
				basicCalc.fourButton();
			}
			else if(inputC == 5){
				basicCalc.fiveButton();
			}
			else if(inputC == 6){
				basicCalc.sixButton();
			}
			else if(inputC == 7){
				basicCalc.sevenButton();
			}
			else if(inputC == 8){
				basicCalc.eightButton();
			}
			else if(inputC == 9){
				basicCalc.nineButton();
			}
			
			basicCalc.equals();
			
			double testResult = 0;
			String stringA = String.valueOf(inputA);
			double doubleA = Double.parseDouble(stringA);
			String stringC = String.valueOf(inputC);
			double doubleC = Double.parseDouble(stringC);
			if(inputB == 0){
				testResult = (doubleA + doubleC);
				System.out.println("The result should be: " + (doubleA + doubleC));
			}
			else if(inputB == 1){
				testResult = (doubleA - doubleC);
				System.out.println("The result should be: " + (doubleA - doubleC));
			}
			else if(inputB == 2){
				testResult = (doubleA * doubleC);
				System.out.println("The result should be: " + (doubleA * doubleC));
			}
			else if(inputB == 3){
				testResult = (doubleA / doubleC);
				System.out.println("The result should be: " + (doubleA / doubleC));
			}
			
			
			
			
			double expected = testResult;
			double actual = basicCalc.getCalcResult();
			assertEquals(expected, actual, 0);
			
			System.out.println("");
		}
		
	}
	
	@Test
	public void test10AdvancedInputZero() {  
		/**
		 * Tests the advanced calculator by cycling through addition, subtraction, multiplication and division with the first value being 0
		 * 
		 */
		System.out.println("Testing the basic calculator with all positive values:");
		AdvancedCalculator advancedCalc = new AdvancedCalculator();
		
		for(int i = 0; i < 60; i++){
			System.out.println("Test " + (i+1) + " of basic with all positive.");
			advancedCalc.clearButton();
			int inputA = 0;
			int inputB = i%4;
			int inputC = (int) (Math.random()*10);
			if(inputA == 0){
				advancedCalc.zeroButton();
			}
			
			if(inputB == 0){
				advancedCalc.addition();
			}
			else if(inputB == 1){
				advancedCalc.subtraction();
			}
			else if(inputB == 2){
				advancedCalc.multiplication();
			}
			else if(inputB == 3){
				advancedCalc.division();
			}
			
			if(inputC == 0){
				advancedCalc.zeroButton();
			}
			else if(inputC == 1){
				advancedCalc.oneButton();
			}
			else if(inputC == 2){
				advancedCalc.twoButton();
			}
			else if(inputC == 3){
				advancedCalc.threeButton();
			}
			else if(inputC == 4){
				advancedCalc.fourButton();
			}
			else if(inputC == 5){
				advancedCalc.fiveButton();
			}
			else if(inputC == 6){
				advancedCalc.sixButton();
			}
			else if(inputC == 7){
				advancedCalc.sevenButton();
			}
			else if(inputC == 8){
				advancedCalc.eightButton();
			}
			else if(inputC == 9){
				advancedCalc.nineButton();
			}
			
			advancedCalc.equals();
			
			double testResult = 0;
			String stringA = String.valueOf(inputA);
			double doubleA = Double.parseDouble(stringA);
			String stringC = String.valueOf(inputC);
			double doubleC = Double.parseDouble(stringC);
			if(inputB == 0){
				testResult = (doubleA + doubleC);
				System.out.println("The result should be: " + (doubleA + doubleC));
			}
			else if(inputB == 1){
				testResult = (doubleA - doubleC);
				System.out.println("The result should be: " + (doubleA - doubleC));
			}
			else if(inputB == 2){
				testResult = (doubleA * doubleC);
				System.out.println("The result should be: " + (doubleA * doubleC));
			}
			else if(inputB == 3){
				testResult = (doubleA / doubleC);
				System.out.println("The result should be: " + (doubleA / doubleC));
			}
			
			
			
			
			double expected = testResult;
			double actual = advancedCalc.getCalcResult();
			assertEquals(expected, actual, 0);
			
			System.out.println("");
		}
		
	}
	
	@Test
	public void test11BasicDecimals() {  
		/**
		 * Tests the basic calculator by cycling through addition, subtraction, multiplication and division with both input values positive but with the second one including a decimal
		 * 
		 */
		System.out.println("Testing the basic calculator with all positive values:");
		BasicCalculator basicCalc = new BasicCalculator();
		
		for(int i = 0; i < 60; i++){
			System.out.println("Test " + (i+1) + " of basic with all positive.");
			basicCalc.clearButton();
			int inputA = (int) (Math.random()*10);
			int inputB = i%4;
			int inputC = (int) (Math.random()*10);
			if(inputA == 0){
				basicCalc.zeroButton();
			}
			else if(inputA == 1){
				basicCalc.oneButton();
			}
			else if(inputA == 2){
				basicCalc.twoButton();
			}
			else if(inputA == 3){
				basicCalc.threeButton();
			}
			else if(inputA == 4){
				basicCalc.fourButton();
			}
			else if(inputA == 5){
				basicCalc.fiveButton();
			}
			else if(inputA == 6){
				basicCalc.sixButton();
			}
			else if(inputA == 7){
				basicCalc.sevenButton();
			}
			else if(inputA == 8){
				basicCalc.eightButton();
			}
			else if(inputA == 9){
				basicCalc.nineButton();
			}
			
			if(inputB == 0){
				basicCalc.addition();
			}
			else if(inputB == 1){
				basicCalc.subtraction();
			}
			else if(inputB == 2){
				basicCalc.multiplication();
			}
			else if(inputB == 3){
				basicCalc.division();
			}
			
			basicCalc.paranthesisLeft();
			basicCalc.zeroButton();
			basicCalc.decimalButton();
			if(inputC == 0){
				basicCalc.zeroButton();
			}
			else if(inputC == 1){
				basicCalc.oneButton();
			}
			else if(inputC == 2){
				basicCalc.twoButton();
			}
			else if(inputC == 3){
				basicCalc.threeButton();
			}
			else if(inputC == 4){
				basicCalc.fourButton();
			}
			else if(inputC == 5){
				basicCalc.fiveButton();
			}
			else if(inputC == 6){
				basicCalc.sixButton();
			}
			else if(inputC == 7){
				basicCalc.sevenButton();
			}
			else if(inputC == 8){
				basicCalc.eightButton();
			}
			else if(inputC == 9){
				basicCalc.nineButton();
			}
			basicCalc.paranthesisRight();
			
			basicCalc.equals();
			
			double testResult = 0;
			String stringA = String.valueOf(inputA);
			double doubleA = Double.parseDouble(stringA);
			String stringC = String.valueOf("0."+inputC);
			double doubleC = Double.parseDouble(stringC);
			if(inputB == 0){
				testResult = (doubleA + doubleC);
				System.out.println("The result should be: " + (doubleA + doubleC));
			}
			else if(inputB == 1){
				testResult = (doubleA - doubleC);
				System.out.println("The result should be: " + (doubleA - doubleC));
			}
			else if(inputB == 2){
				testResult = (doubleA * doubleC);
				System.out.println("The result should be: " + (doubleA * doubleC));
			}
			else if(inputB == 3){
				testResult = (doubleA / doubleC);
				System.out.println("The result should be: " + (doubleA / doubleC));
			}
			
			
			
			
			double expected = testResult;
			double actual = basicCalc.getCalcResult();
			assertEquals(expected, actual, 0);
			
			System.out.println("");
		}
		
	}
	
	@Test
	public void test12AdvancedDecimals() {  
		/**
		 * Tests the advanced calculator by cycling through addition, subtraction, multiplication and division with both input values positive but with the second one including a decimal
		 * 
		 */
		System.out.println("Testing the basic calculator with all positive values:");
		AdvancedCalculator advancedCalc = new AdvancedCalculator();
		
		for(int i = 0; i < 60; i++){
			System.out.println("Test " + (i+1) + " of basic with all positive.");
			advancedCalc.clearButton();
			int inputA = (int) (Math.random()*10);
			int inputB = i%4;
			int inputC = (int) (Math.random()*10);
			if(inputA == 0){
				advancedCalc.zeroButton();
			}
			else if(inputA == 1){
				advancedCalc.oneButton();
			}
			else if(inputA == 2){
				advancedCalc.twoButton();
			}
			else if(inputA == 3){
				advancedCalc.threeButton();
			}
			else if(inputA == 4){
				advancedCalc.fourButton();
			}
			else if(inputA == 5){
				advancedCalc.fiveButton();
			}
			else if(inputA == 6){
				advancedCalc.sixButton();
			}
			else if(inputA == 7){
				advancedCalc.sevenButton();
			}
			else if(inputA == 8){
				advancedCalc.eightButton();
			}
			else if(inputA == 9){
				advancedCalc.nineButton();
			}
			
			if(inputB == 0){
				advancedCalc.addition();
			}
			else if(inputB == 1){
				advancedCalc.subtraction();
			}
			else if(inputB == 2){
				advancedCalc.multiplication();
			}
			else if(inputB == 3){
				advancedCalc.division();
			}
			
			advancedCalc.paranthesisLeft();
			advancedCalc.zeroButton();
			advancedCalc.decimalButton();
			if(inputC == 0){
				advancedCalc.zeroButton();
			}
			else if(inputC == 1){
				advancedCalc.oneButton();
			}
			else if(inputC == 2){
				advancedCalc.twoButton();
			}
			else if(inputC == 3){
				advancedCalc.threeButton();
			}
			else if(inputC == 4){
				advancedCalc.fourButton();
			}
			else if(inputC == 5){
				advancedCalc.fiveButton();
			}
			else if(inputC == 6){
				advancedCalc.sixButton();
			}
			else if(inputC == 7){
				advancedCalc.sevenButton();
			}
			else if(inputC == 8){
				advancedCalc.eightButton();
			}
			else if(inputC == 9){
				advancedCalc.nineButton();
			}
			advancedCalc.paranthesisRight();
			
			advancedCalc.equals();
			
			double testResult = 0;
			String stringA = String.valueOf(inputA);
			double doubleA = Double.parseDouble(stringA);
			String stringC = String.valueOf("0."+inputC);
			double doubleC = Double.parseDouble(stringC);
			if(inputB == 0){
				testResult = (doubleA + doubleC);
				System.out.println("The result should be: " + (doubleA + doubleC));
			}
			else if(inputB == 1){
				testResult = (doubleA - doubleC);
				System.out.println("The result should be: " + (doubleA - doubleC));
			}
			else if(inputB == 2){
				testResult = (doubleA * doubleC);
				System.out.println("The result should be: " + (doubleA * doubleC));
			}
			else if(inputB == 3){
				testResult = (doubleA / doubleC);
				System.out.println("The result should be: " + (doubleA / doubleC));
			}
			
			
			
			
			double expected = testResult;
			double actual = advancedCalc.getCalcResult();
			assertEquals(expected, actual, 0);
			
			System.out.println("");
		}
		
	}
	
	

}

package week3LabsAndHomework;
import java.io.*;
import java.util.*;
public class Week3Exercises {
//	static String repeatWord(String userWord, int numTimes) {
//		
//	    // WRITE YOUR CODE HERE
//		String addWord = userWord;
//		for (int i = 0; i < (numTimes - 1); i++) {
//		userWord += addWord;
//	}
//	return userWord;
//	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//			int numTimes = 3;
//			String userWord = "Stop";
//			System.out.println(repeatWord(userWord,numTimes));
//		}
//	}

//static void fizzBuzz(int num1) {
//	    
//	    // WRITE YOUR CODE HERE
//        if (num1 % 3 == 0 && num1 % 5 == 0) {
//            System.out.println("FizzBuzz");
//        } else if (num1 % 5 == 0) {
//            System.out.println("Buzz");
//        } else if (num1 % 3 == 0) {
//            System.out.println("Fizz");
//        } else {
//            System.out.println("Hello world!");
//        }
///***** DO NOT CHANGE THE CODE BELOW THIS LINE *****/
//	}
//    
//	public static void main(String[] args) {
//		int num1=90;
//		fizzBuzz(num1);
//	}
//}

	
//	static int returnSum(int x, int y, int z){
//        int answer = x + y + z;
//        return x;
//    }
//    public static void main(String[] args) {
//        int a = 10, b = 10, c = 10;
//        System.out.println(returnSum(a,b,c));
//    }
//}
	
	

//	static int[] createArray(int a, int b, int c, int d, int e) {
//		// WRITE YOUR CODE HERE:  This uses a Method to create an Array, and then it returns a number from the array.
//		int[] createArray = {a,b,c,d,e};
//		return createArray;
//	    
//		
///***** DO NOT CHANGE THE CODE BELOW THIS LINE *****/
//	}
//
//	public static void main(String[] args) {
//		//Scanner in = new Scanner(System.in);
//		int a,b,c,d,e;
//		a = 1;
//		b = 2;
//		c = 3;
//		d = 4;
//		e = 5;
//		int[] mainArray = createArray(a, b, c, d, e);
//		System.out.println("The third number in your array is: " + mainArray[2]);
//	}
//}	
	
//	static int sumOfDigits(int digits) {
	    // WRITE YOUR CODE HERE
	//	int sumAll = 0;
//		String listOfDigits = Integer.toString(digits);
//		for (int i = 0; i < listOfDigits.length(); i++) {
//			sumAll += Character.getNumericValue(listOfDigits.charAt(i));
//		}
		//Alternate way of doing this:
//		 while (digits != 0) {
//	            sumAll += digits % 10; // Add the last digit to sum
//	            digits /= 10;       // Remove the last digit
//	        }
//		return sumAll;
//		
///***** DO NOT CHANGE THE CODE BELOW THIS LINE *****/
//	}
//
//	public static void main(String[] args) {
//		//Scanner in = new Scanner(System.in);
//		int digits = 12;
//		int sumAll = sumOfDigits(digits);
//		System.out.println("The sum of all digits for the value " + digits + " is " + sumAll + ".");
//	}
	
//	public static void main(String[] args) {
//    int addItUp = followTheMath(10, 5, 8, 11);
//    System.out.println(addItUp);
//	}
//static int followTheMath(int num1, int num2, int num3, int num4){
//    int total = 0;
//    if (num1 < num4){
//        total += num2;
//    }
//    if (num2 == num3){
//        total += num4;
//    } else {
//        total += num1;
//    }
//    total += num3;
//    return num3;
//}
//
//	
//}	
	
	

//	static boolean passwordChecker(String password) {
//		// WRITE YOUR CODE HERE
//		int passwordLength = password.length();
//		boolean containsSpecialChars;
//		boolean returnThis = false;
//		if (passwordLength >=8) {
//			if (containsSpecialChars = password.matches(".*[!$%&].*")) { // You could also use a series of password.contains("!") || tests in the if.
//				returnThis = true;										// Or another way is to use Character.isLetter(c), after defining a char array: char[] charArray = str.toCharArray(); and using a for (char c : charArray) loop to check it.
//			}																// or char c = str.charAt(i);
//		} else {
//			returnThis = false;
//		}
//		return returnThis;
//		
///***** DO NOT CHANGE THE CODE BELOW THIS LINE *****/
//	}
//
//	public static void main(String[] args) {
//		//Scanner in = new Scanner(System.in);
//		String password = "password%";
//        boolean meetsRequirement = passwordChecker(password);
//		if (meetsRequirement) {
//		    System.out.println(password + " meets the requirements.");
//		} else {
//		    System.out.println(password + " does not meet the requirements.");
//		}
//	}
//}
	
	
//	static int avgNameLength(String[] names) {
//		// WRITE YOUR CODE HERE
//		int nameLengthTotal = 0;
//		int returnThis;
//		for (String name : names) {
//			nameLengthTotal += name.length();
//		}
//		returnThis = nameLengthTotal / names.length;
//		return returnThis;
//		
///***** DO NOT CHANGE THE CODE BELOW THIS LINE *****/
//	}
//
//	public static void main(String[] args) {
//		//Scanner in = new Scanner(System.in);
//		String[] names;
//		names = new String[5];
//		names[0] = "Jeff";
//		names[1] = "Bradley";
//		names[2] = "Hermon";
//		names[3] = "Dexter";
//		names[4] = "Baumgartner";
//		
//		int avgLength = avgNameLength(names);
//		System.out.println("The average name length is " + avgLength + ".");
//	}
//}	
	
	public static int rectanglePerimeter(int length, int width) {
		int perimeter = 0;
		perimeter = (length + width) * 2;
		return perimeter;
	}
	
	//---------------------------------------
	public static void main(String[] args) {
		//Scanner in = new Scanner(System.in);
	    int length = 100;
		int width = 22;
		int perimeter = rectanglePerimeter(length, width);
		System.out.println("The rectangle has a perimeter of " + perimeter + ".");
	}
}	
	
	
	
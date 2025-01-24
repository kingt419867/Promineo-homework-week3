package week3LabsAndHomework;
import java.io.*;
import java.util.*;
public class week3ArraysHomework {

//	static void addX(int[] arr, int x) {
//		System.out.println("**Original**"); // Keep this print statement
//    /***** DO NOT CHANGE THE CODE ABOVE THIS LINE *****/
//        // WRITE YOUR CODE HERE FOR PART 1
//		for (int i=0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
//    
//    /***** DO NOT CHANGE THE CODE BELOW THIS LINE *****/ 	
//		System.out.println("**New Array**"); // Keep this print statement
//    /***** DO NOT CHANGE THE CODE ABOVE THIS LINE *****/
//        // WRITE YOUR CODE HERE FOR PART 2 
//		for (int i=0; i < arr.length; i++) {
//			arr[i] = arr[i] + x;
//			System.out.println(arr[i]);
//		}
//		// The above can also be done with this:
////				arr[0] = a;
////		        arr[arr.length - 1] = b;
////		        
////		        for ( int x : arr ) {
////		            System.out.println(x);
////		        }
//
//    /***** DO NOT CHANGE THE CODE BELOW THIS LINE *****/ 
//	}
//	public static void main(String[] args) {
//		//Scanner in = new Scanner(System.in);
//		int x = 5;
//		int[] arr = { 5, 10, 44, -4, 10 };
//		//x = in.nextInt();
//		addX(arr, x);
//	}
//}
	
	
//	public static void main(String[] args){
//        int[] arr = new int[5];
//        arr[3] = 12;
//        System.out.println(arr.length);
//    }
//}

//	static void charArray(String userWord) {
//	    /***** DO NOT CHANGE THE CODE ABOVE THIS LINE *****/
//
//	        // WRITE YOUR CODE HERE FOR
//	        char[] wordChar = userWord.toCharArray();
//	        for (int i = 0; i < userWord.length(); i++) {
//	            wordChar[i] = userWord.charAt(i);
//	            System.out.println(wordChar[i]);
//	        }
//	        
//	    /***** DO NOT CHANGE THE CODE BELOW THIS LINE *****/ 	
//		}
//		public static void main(String[] args) {
//			//Scanner in = new Scanner(System.in);
//			String word;
//			word = "Change";
//			charArray(word);
//		}
//	}	
	
	
//	static char[] wordToArray(String userWord) {
//	    /***** DO NOT CHANGE THE CODE ABOVE THIS LINE *****/
//
//	        // WRITE YOUR CODE HERE
//	        char[] charArray = userWord.toCharArray();
//	        for (int i = 0; i < userWord.length(); i++) {
//	            charArray[i] = userWord.charAt(i);
//	        }
//	        return charArray;
//	         
//	    /***** DO NOT CHANGE THE CODE BELOW THIS LINE *****/ 	 
//		}
//
//		 public static void main(String[] args) {
//			//Scanner in = new Scanner(System.in);
//			String userWord;;
//			userWord = "Crazy";
//			System.out.println("Your array is: ");
//			System.out.println(Arrays.toString(wordToArray(userWord)));
//		}
//	}	
	
//	static int[] buildArray(int num) {
//	    
//	    // WRITE YOUR CODE HERE
//			int[] numArray = new int[num];
//	        for (int i = 0; i < num; i++) { // This populates the array with the counted size of the array, itself.
//	            numArray[i] = i;
//	        }
//	        return numArray;
//	// ***** DO NOT CHANGE THE CODE BELOW THIS LINE *****
//		}
//		public static void main(String[] args) {
//			Scanner in = new Scanner(System.in);
//			int num;
//			num = in.nextInt();
//			System.out.println("Your array is: ");
//			System.out.println(Arrays.toString(buildArray(num)));
//		}
//	}	
	
	
	
//	int[] arr = new int[5];  // This does about the same thing as the one above it.
//	for ( int i = 1; i <= 5; i++){
//	    arr[i - 1] = i;
//	}
//	System.out.println(arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3] + " " + arr[4]);
//	
//}
//}		
	
	
//	static void newArray(String word1, String word2, String word3, String[] arr) {
//	// WRITE YOUR CODE HERE
//	String[] newArr = {word1, word2, word3};
//	String[] bigArray = new String[8];
//	for (int i = 0; i < arr.length; i++) {
//		bigArray[i] = arr[i];
//	}
//	for (int j = 0; j < newArr.length; j++) {
//		bigArray[j+5] = newArr[j];
//	}
//	for (int k = 0; k < bigArray.length; k++) {
//		System.out.println(bigArray[k]);
//	}
//	
///****** DO NOT CHANGE THE CODE BELOW THIS LINE ******/
//	}
//	public static void main(String[] args) {
//		//Scanner in = new Scanner(System.in);
//		String[] arr = {"Astros", "Reds", "Phillies", "Dodgers", "Angels"};
//		String word1, word2, word3;
//		word1 = "Baseball";
//		word2 = "Basketball";
//		word3 = "Football";
//		newArray(word1, word2, word3, arr);
//		
//	}
//}	
	
	
//	static void reverseArray(int a, int b, int c, int d, int e) {
//		int[] arr = {a, b, c, d, e};
//    /****** DO NOT CHANGE THE CODE ABOVE THIS LINE ******/
//	// WRITE YOUR CODE HERE
//	int[] reverseArr = {e, d, c, b, a};
//	for (int i = 0; i < arr.length; i++) {
//		System.out.println(arr[i]);
//	}
//	for (int j = 0; j < reverseArr.length; j++) {
//		System.out.println(reverseArr[j]);
//	}
//		
//    /****** DO NOT CHANGE THE CODE BELOW THIS LINE ******/
//	}
//	public static void main(String[] args) {
//		//Scanner in = new Scanner(System.in);
//		int a,b,c,d,e;
//		a = 1;
//		b = 2;
//		c = 3;
//		d = 4;
//		e = 5;
//		reverseArray(a, b, c, d, e);
//	}
//}	
	
	
//	static void multidimensional(int a, int b) {
//	    /****** DO NOT CHANGE THE CODE ABOVE THIS LINE ******/
//		    // Check for error -- invalid parameters with an if/else
//			if (a > 2 && b > 2) {
//			    // If both parameters are > 2
//			    // Declare a multidimensional array something like this:
//			    //          int[][] arr = new int[param1][param2];
//			int[][] arr = new int[a][b];    
//			
//			    // Create two loops to populate your new multidimensional array
//			    // Note:  you will need a new index in each for-loop. 
//			    //          one index will be used for the first for-loop's index (0 to param1 - 1)
//			    //          the second index will be used for the second for-loop's index (0 to param2 - 1)		
//			for (int i = 0; i < arr.length; i++) {
//			    for (int j = 0; j < arr[i].length; j++) {
//			        arr[i][j] = j;
//			        System.out.print(arr[i][j] + " ");
//			    }
//			    System.out.println(); // Taken together, these 2 print statements will print out the entire table, row by row, as a table.
//			} 
//			System.out.println(arr[0][arr[0].length - 1]);
//			
//			    // After you have populated your multidimensional array, 
//			    // Print out the value of arr[firstPosition][lastPosition]
//			} else {	// This ends the error checking ifelse statement, at the top.
//				System.out.println("Both numbers need to be greater than 2.");
//			}
//			
//		}
//		
//	    /****** DO NOT CHANGE THE CODE BElOW THIS LINE ******/
		//public static void main(String[] args) {
//			//Scanner in = new Scanner(System.in);
//			int input1, input2;
//			input1 = 10;
//			input2 = 15;
//			multidimensional(input1, input2);
//		}
//	}	

		
	public static int power(int base, int exponent) { // This calculates a base raised to the power of an exponent.
		int result = 1;
		for (int index = 1; index <= exponent; index++) {
			result = result * base;
		}
		return result;
	}
	
	public static void main(String[] args) {
		int base = 3;
		int exponent = 4;
		//int result = 1;
		//System.out.println(power(result));
		int result = power(base, exponent);
		System.out.println(result);
	
	}
}
	
		
	
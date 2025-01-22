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
	
	
	static char[] wordToArray(String userWord) {
	    /***** DO NOT CHANGE THE CODE ABOVE THIS LINE *****/

	        // WRITE YOUR CODE HERE
	        char[] charArray = userWord.toCharArray();
	        for (int i = 0; i < userWord.length(); i++) {
	            charArray[i] = userWord.charAt(i);
	        }
	        return charArray;
	         
	    /***** DO NOT CHANGE THE CODE BELOW THIS LINE *****/ 	 
		}

		 public static void main(String[] args) {
			//Scanner in = new Scanner(System.in);
			String userWord;;
			userWord = "Crazy";
			System.out.println("Your array is: ");
			System.out.println(Arrays.toString(wordToArray(userWord)));
		}
	}	
	
	
	
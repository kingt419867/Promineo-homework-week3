package week3LabsAndHomework;

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

	
	static int returnSum(int x, int y, int z){
        int answer = x + y + z;
        return x;
    }
    public static void main(String[] args) {
        int a = 10, b = 10, c = 10;
        System.out.println(returnSum(a,b,c));
    }
}
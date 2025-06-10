package task_day2;

import java.util.Scanner;

public class palindrome {
	
      public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String str = scanner.nextLine();

	       
	        str = str.toLowerCase();

	        boolean isPalindrome = checkPalindrome(str);
	        System.out.println( isPalindrome);
	        
	        scanner.close();
	    }

	    public static boolean checkPalindrome(String str) {
	        int left = 0;
	        int right = str.length() - 1;

	        while (left < right) {
	            if (str.charAt(left) != str.charAt(right)) {
	                return false;
	            }
	            left++;
	            right--;
	        }
	        return true;
	    }
	}



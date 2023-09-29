/*
 * File			:palindrome.java
 * Description	:Program to find whether a number is palindrome or not
 * Author		:Alen Jojimon
 * Version		:1.0 
 * Date 		:29/09/2023
 */
import java.util.Scanner;
public class palindrome {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		String input=sc.next();
		boolean isPalindrome=check(input);
		if(isPalindrome) {
			System.out.println("the given string is palindrome");
		
		}
		else {
			System.out.println("the given string is not palindrome");
		}
	}
	static boolean check(String input) {
		char[]charArray=input.toCharArray();
		int length=input.length();
		for(int i=0;i<=length/2;i++) {
			if(charArray[i]!=charArray[length-i-1]) {
				return false;
			}
		}
		return true;
	}
}
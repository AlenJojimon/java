/*
 * File			:frequency.java
 * Description	:Program to find the frequency of a number in a string
 * Author		:Alen Jojimon
 * Version		:1.0 
 * Date 		:29/09/2023
 */
import java.util.Scanner;
public class frequency {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String input=sc.nextLine();
		System.out.println("Enter the character:");
		char checkMe=sc.next().charAt(0);
		int charCount=checkFreq(input,checkMe);
		System.out.println("The number of occurence of the character is "+charCount);
		}
	static int checkFreq(String input,char checkMe) {
		char[]charArray=input.toCharArray();
		int charCount=0;
		for(int i=0;i<input.length();i++) {
			if(charArray[i]==checkMe) {
				charCount++;
			}
		}
		return charCount;
	}
}



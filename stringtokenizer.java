import java.util.Scanner;
import java.util.StringTokenizer;
public class stringtokenizer {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		System.out.println("Enter the numbers:");
		String input=sc.nextLine();
		StringTokenizer token=new StringTokenizer(input);
		System.out.println("The numbers are:");
		while(token.hasMoreTokens()) {
			int num=Integer.parseInt(token.nextToken());
			System.out.println(num);
			sum+=num;
		}
		System.out.println("The sum ="+sum);
		sc.close();
	}

}

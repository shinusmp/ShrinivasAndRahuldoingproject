package logical_string;

import java.util.Scanner;

public class Count_the_stringWords {

	public static void main(String[] args) {
		
		System.out.println("enter the string");
		
		Scanner sc=new Scanner(System.in);
		
		String s=sc.nextLine();
		int count=1;
		
		for(int i=1;i<s.length();i++) {
		
		if ((s.charAt(i)==' ') && (s.charAt(i+1)!=' ')) {
			
			count++;
		}
				
				
		}
		
		System.out.println("number of words in string :"+count);
	}
}

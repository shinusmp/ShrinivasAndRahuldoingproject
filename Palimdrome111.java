package logical_string;

import java.util.Scanner;

public class Palimdrome111 {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter a string");
		String s=sc.next();
		
		String originalString=s;
		
		int len = s.length();
		String rev="";
		
		for(int i=len-1;i>=0;i--) {
			
			rev=rev+s.charAt(i);	
		}
		
		if(originalString.equals(rev)) {
			System.out.println("string is palimdrome");
		}else {
			System.out.println("string is not palimdrome");
		}
	}

}

package logical_string;

import java.util.Scanner;

public class Palimdrome_String {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a string");
		
		String s=sc.next();
		
		String org_s=s;
		
		String rev="";
		
		int len=s.length();
		
		for(int i=len-1;i>=0;i--) {
			
			rev=rev+s.charAt(i);
		}
		
		//System.out.println(rev);
		
		if(org_s.equals(rev)) {
			System.out.println(org_s+" string is palimdrome");
		}else {
			System.out.println(org_s+" string is not palimdrome");
		}
	}

}

package logical_string;

public class Reverse_words_string {
	
	public static void main(String[] args) {
		
		String str="welcome To java";
		
		String words[]=str.split(" ");
		
		String reverseString="";
		
		for(String w:words) {
			String reverseword="";
			
			for(int i=w.length()-1;i>=0;i--) {
				reverseword=reverseword+w.charAt(i);
			}
			
			reverseString=reverseString+reverseword+" ";
			}
				
		System.out.println("reverse words from string :"+reverseString);
	}

}

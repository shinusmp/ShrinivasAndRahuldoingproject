package logical_string;

public class Reverse_words_string_2logic {
	
	public static void main(String[] args) {
		
		String str="welcome to java";
		
		String[] words=str.split("\\s");
		String reversewords="";
		
		for(String w:words) {
			
			StringBuilder sb=new StringBuilder(w);
			
			sb.reverse();
			
			reversewords =reversewords+sb.toString()+" ";
			
		}
		System.out.println(reversewords);
	}

}

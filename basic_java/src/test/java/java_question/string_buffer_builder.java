package java_question;

public class string_buffer_builder {

	
	public static void main(String[] args) {
		 
		
		
		String str="s";
		
		
		for(int i=0;i<5;i++) {
			 str=str+i;
		}
		System.out.println("  "+str);
		
		
		StringBuilder sb = new StringBuilder("a");
		for(int i = 0; i < 5; i++) {
		    sb.append(i);
		}
		
		System.out.println(sb.toString());
		
		
		
		
		
		
		
		
	}
	
}



















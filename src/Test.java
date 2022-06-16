
public class Test {
	
	public static void main(String[] args) {
	
	String str="aaaabbccccccddd";
	
	int count=0;
	
	for(int i=0; i<str.length();i++) {
		
		for(int j=0; j<str.length();j++) {
			
			if(str.charAt(i)==str.charAt(j)) {
				count++;
			}
		}
		
		
		char s = str.charAt(i);
		String s1= String.valueOf(s);
		
		System.out.println(s1+count);
		count=0;
	}
	
	}

}

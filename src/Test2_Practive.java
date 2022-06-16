import java.util.ArrayList;

public class Test2_Practive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = ("Milind Wagh");
		//String[] splitString = s.split("Milind");
		//System.out.println(splitString[0]);
		//System.out.println(splitString[1].trim());
		
		/*for (int i=0; i<s.length(); i++)
		{
			System.out.println(s.charAt(i));
		}*/
		
		for(int i=s.length()-1; i>=0; i--)
		{
			System.out.print(s.charAt(i));
			
		}
		for (int i=0; i<s.length(); i++)
		{
			System.out.println(s.charAt(i));
		}
	
}
}

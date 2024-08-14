package logicalPrograms;

public class PalindromString {

	public static void main(String[] args) {
		
		String s="Pune";
		String  rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println("Original String "+s);
		System.out.println("Revese String "+rev);
		
		if(s.equals(rev))
		{
			System.out.println("String is Palindrome");
		}
		else
		{
			System.out.println("String is not Palindrome");
		}
	}

}

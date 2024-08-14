package logicalPrograms;

public class OccuraceOfCharLnString {

	public static void main(String[] args) {
		
		
		//count char A
		String s="RADAR";
		int count =0;
		for(int i=0;i<=s.length()-1;i++)
		{
			char temp=s.charAt(i);
			if(temp=='A')
			{
				count++;
			}
		}
		System.out.println("Occurance of A is " +count);
		
		
	}

}

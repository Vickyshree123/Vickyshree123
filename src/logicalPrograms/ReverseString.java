package logicalPrograms;

public class ReverseString {

	public static void main(String[] args) {
		
		String s="Velocity";
		String rev="";
		System.out.println(s);
		for(int i=s.length()-1;i>=0;i--)//7,6,5
		{
			rev=rev+s.charAt(i);
			//y=""+y
			//yt=Y+t
			//yti=yt+i
		}
		System.out.println(rev);
	}

}

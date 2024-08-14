package logicalPrograms;

public class ReverseTheNumberUsingMethod {

	public static void main(String[] args) {
		
		
		int number=1234;//4321
		int revNumber;
		System.out.println("Original number"+number);
		String numberInString=Integer.toString(number);
		String rev="";
		
		
		for(int i=numberInString.length()-1;i>0;i--)
		{
			rev=rev+ numberInString.charAt(i);
		}
		//System.out.println(rev);
		
		revNumber=Integer.parseInt(rev);
		
		System.out.println("Reverse number " +revNumber);
		
	}

}

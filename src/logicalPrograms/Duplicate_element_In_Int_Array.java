package logicalPrograms;

public class Duplicate_element_In_Int_Array {

	public static void main(String[] args) {
		
		int ar[]= {1,2,3,4,3,5,7,5,8,9,1,7};
		int count=0;
		System.out.println("Duplicate element are:");
		for(int i=0;i<ar.length;i++)//i=0,1,2
		{
			for(int j=i+1;j<ar.length;j++)//j=1,2//j=2,3..//3,4
			{
				if (ar[i]==ar[j])//
				{
					System.out.println(ar[i]+ "");
					count++;
				}
					
					
			}
		}
		System.out.println();
		System.out.println("Number of duplicate elements are " +count);
	

	}

}
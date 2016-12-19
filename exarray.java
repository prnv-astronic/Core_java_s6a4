package Core_javaS6;

public class exarray {

	
	
	public static void main(String[] args) {
		int [] check=new int [5];
	
		int loop=0;
		boolean flag= false;
		check[0]=1;
		check[1]=2;
		check[2]=3;
		check[3]=4;
		check[4]=6;
		System.out.println("Checking for No 5 in array:...");
		for(loop=0;loop<check.length;loop++)
		{
			if(check[loop]==5)
			{
				System.out.println("Number 5 found\nAT location:"+loop+"in Array");
				System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
				flag=true;
				
			}
			else
			{
				flag=false;
			}
						
		}
		if(!flag)
		{
			System.out.println("Number 5  not found in Array");
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
			
		}
		
		System.out.println("Checking for No 6 in array:...");
		for(loop=0;loop<check.length;loop++)
		{
			if(check[loop]==6)
			{
				System.out.println("Number 6 found\nAT location:"+loop+"in Array");
				flag=true;
				
			}
			else
			{
				flag=false;
			}
						
		}
		if(!flag)
		{
			System.out.println("Number 6  not found in Array");
			
		}
	}

}

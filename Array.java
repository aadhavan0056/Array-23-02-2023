package array;

public class Array {

	public static void main(String[] args) {
		int a[]= {1,5,8,3,4,7,6};
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2 !=0)
			{
				System.out.println(a[i]);
			}
			
		}
****************************************************************************************************
		int a[]= {1,5,8,3,4,7,6};
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
			}
			
		}
***********************************************************************************************		
		int a[]= {7,49,54,28,4,14};
		int counter=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%7==0)
			{
				System.out.println(a[i]);
			}
			
		}
*****************************************************************************************************		
		int a[]= {5,5,5,5,5,8,5};
		int counter=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==5)
			{
				counter=counter+1;
				
				}
	        }
		  System.out.println(counter);
**********************************************************************************************
		
		int a[]= {23,44,5,55,12,8,12};
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>=10 && a[i]<=99)
			{
				
				 System.out.println(a[i]);
				}
	        }
	
		 
	}

}

package Twoarrey;

public class Twoarrey {

	public static void main(String[] args) {
		int a[]= {7,4,1,4,7,3};
		int b[]= {8,4,1,2,4,9};
		int c[]=new int[a.length+b.length];
		
		for(int i=0;i<a.length;i++)
		{   
			c[i]=a[i];
		}  
			for(int i=0;i<b.length;i++)
			{
				c[i+a.length]=b[i];
			}
          
           
		for(int i:c)
		{
			System.out.println(i);
	}

	}

}

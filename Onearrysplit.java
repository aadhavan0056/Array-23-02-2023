package Onearrysplit;

public class Onearrysplit {

	public static void main(String[] args) {
		int a[]= {7,4,1,4,7,3,8,4,1,2,4,9};
		int b[]= new int[a.length/2];
		int c[]=new int[a.length/2];
		
		for(int i=0;i<b.length;i++)
		{   
			b[i]=a[i];
		}  
			for(int i=0;i<c.length;i++)
			{
				c[i]=a[i+b.length];
			}
          
           
		for(int i:b)
		{
			System.out.println(i);
	    }
		for(int i:c)
		{
			System.out.println(i);
	    }

	}

}

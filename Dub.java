package dub;

public class Dub {
	public static void main(String[] args) {
		int a[]= {7,5,4,1,5,4,7,3};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
             
             if(a[i]==a[j])
             {
            	 a[j]=0;
             }
             
	      }

         }
		for(int i:a)
			System.out.println(i);
	}
}



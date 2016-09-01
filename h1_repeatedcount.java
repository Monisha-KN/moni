package h1_repeatedcount;

public class h1_repeatedcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={1,2,4,4,5,6,3,2,1};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println("repeated number - "+a[i]);
				}
			}
		}

	}

}

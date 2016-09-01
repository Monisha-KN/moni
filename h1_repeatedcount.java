package h1_repeatedcount;

public class h1_repeatedcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] b={1,2,4,5,6,3,2,1};
		
		for(int i=0;i<b.length;i++)
		{
			for(int j=i+1;j<b.length;j++)
			{
				if(b[i]==b[j])
				{
					System.out.println("repeated number - "+b[i]);
				}
			}
		}

	}

}

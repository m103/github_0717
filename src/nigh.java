
public class nigh {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int z;
		
		System.out.printf("  ");
		for(int x=1 ; x<10; x++)
		{
			System.out.printf("%d ",x);
		}
		
		System.out.printf("\n");
		
		for (int i=1;i<10;i++)
		{
			System.out.printf("%d ",i);
			for(int j=1;j<10  ;j++)
			{
			   if(j < i + 1 ){
				z=i*j;
				System.out.printf("%d ",z);
				
			}
			   }
			
			System.out.printf("\n");
		}
		
		// TODO Auto-generated method stub

	}
	}

//}
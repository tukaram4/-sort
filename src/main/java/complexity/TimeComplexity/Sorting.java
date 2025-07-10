package complexity.TimeComplexity;

public class Sorting {
	public int[] SelectionSort(int[] array)
	 {
		int n= array.length;
		for (int i = 0; i<n-1;i++)
		{
			int minindex = i;
			for (int j=i+1;j<=n-1;j++)
			{
				if(array[j]<array[minindex]) {
					minindex= j;
					
				}
			
				
			}
			int temp= array[i];
			 array[i]=array[minindex];
			 array[minindex]=temp;
		
		}
		
		return	array;
		
		
		
	 }
	
	

}

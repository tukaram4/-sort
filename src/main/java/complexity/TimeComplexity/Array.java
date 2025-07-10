package complexity.TimeComplexity;

public class Array {

	
	public int linearsearch (int[] array,int element) {
		for( int i=0; i<array.length-1;i++) {
			if(array[i]==element) {
				return i;
			}
		
		}
	
	return -1;
	}
}

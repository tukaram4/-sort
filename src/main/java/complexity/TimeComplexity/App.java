package complexity.TimeComplexity;

/**
 * Hello world!
 *
 */
public class App 
{
//    public static void main( String[] args )
//    {
//        Array ar =new Array();
//        int[] array = {12,34,56,78,89};
//        System.out.println(ar. linearsearch(array,56));
//    }
//	public static void main(String[] args) {
//		BinarySearch bs= new BinarySearch();
//		int[] array = {34,56,67,78,84};
//			System.out.println(bs.binarysearch(array, 78));
//	}
	public static void main(String[] args) {
		Sorting sr= new Sorting();
		int[] array= {34,5,8};
		int[] data =  sr.SelectionSort(array);

for(int i:data)
{
	System.out.println(i);
}
	}
	
}

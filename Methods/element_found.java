package Methods;
import java.util.Scanner;
import java.util.Arrays;
public class element_found
{
   
    
    boolean linearSearch(int[]array, int target){
        for(int i=0;i<array.length;i++){
            if(array[i] == target)
               return true;
        }
        return false;
    }
    
    boolean binarySearch(int []array, int target){
        // step 1: sorting
        
        Arrays.sort(array);
        int left = 0, right = array.length - 1;
        
        while(left <= right){
            int mid = (left+right)/2;
            
            if(array[mid]==target)
                return true;
            if(target > array[mid])
                left = mid+1;
            else
                right = mid - 1;
        }
        
        return false;
    }
	public static void main(String[] args) {
	    element_found m = new element_found();
		Scanner sc= new Scanner(System.in);
		int size = sc.nextInt();
		int[] array = new int[size];
		
		for(int i = 0;i<size;i++){
		    array[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		boolean search = m.binarySearch(array, target);
		System.out.println(search?"Element found":"Not Found");
        sc.close();
	}
}
// Searching :
// 1. linear Search
// 2. binary search






/*Sample i/p:

5
10 4 2 6 8

2

Sample o/p: Element Found*/
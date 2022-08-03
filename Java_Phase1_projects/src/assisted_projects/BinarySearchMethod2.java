package assisted_projects;

import java.util.Scanner;

public class BinarySearchMethod2 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int length=sc.nextInt();
		System.out.println("Enter the elements of array");
		int[] array=new int[length];
		for(int i=0;i<length;i++)
			array[i]=sc.nextInt();
		
		SelectionSort s=new SelectionSort();
		s.selectionsort(array,length);
		
		System.out.println("Sorted array is ");
		for(int i=0;i<length;i++)
			System.out.println(array[i]+" ");
		
		System.out.println("Enter the element to search");
		int search=sc.nextInt();
		
		int result=binarySearch(array,0,length-1,search);
		if (result == -1)
	         System.out.println("The element is not present in the array");
	      else
	         System.out.println("The element has been found at index " + result);

}
	   static int binarySearch(int my_arr[], int left, int right, int x){
		      if (right >= left){
		         int mid = (left +right) / 2;
		         if (my_arr[mid] == x)
		        	 return mid;
		         else
		        	 if (my_arr[mid] > x)
		        		 return binarySearch(my_arr, left, mid - 1, x);
		        	 else
		        		 return binarySearch(my_arr, mid + 1, right, x);
		      }
		      return -1;
		   }
	   }
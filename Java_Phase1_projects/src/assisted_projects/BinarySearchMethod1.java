package assisted_projects;

import java.util.Scanner;

public class BinarySearchMethod1 {

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
		
		int ans =binarySearch(array,0,length-1,search);
		if(ans==-1) 
			System.out.println(" Element is not present");
		else
			System.out.println("Element is found");

	}

	public static int  binarySearch(int[] array, int start,int end, int key) {
		int ans=0;
		while(start<=end) {
			int mid=(start+end)/2;
			if(array[mid]==key) {
			    return ans=1 ;
			    }
			else {
				if(array[mid]<key)
					return start=mid+1;
				else
					return end=mid-1;
			}
				
		}
		return -1;
	}
		
	}	


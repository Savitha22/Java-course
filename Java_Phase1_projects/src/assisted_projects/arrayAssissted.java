package assisted_projects;

public class arrayAssissted {

	public static void main(String[] args) {

		//single-dimensional array
		int a[]= {12,24,36,48,62};
		for(int i=0;i<5;i++) {
			System.out.println("Elements of array a: "+a[i]);
		}


		//multidimensional array
		int[][] b = {
			     	{4,8,2,1,9}, 
				    {3,8,2,4}};
      
		System.out.println("\nLength of row 1: " + b[0].length);
      }
}


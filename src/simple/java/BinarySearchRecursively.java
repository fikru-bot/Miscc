package simple.java;

public class BinarySearchRecursively {
	public static void findRecursively(int arr[], int start, int end, int search) {
		 
        if(start > end) {
           System.out.println("Index not found");
        }

        int mid = (start + end)/2;

        if(arr[mid] == search) {
               System.out.println(mid);
               
        
        } else if(arr[mid] < search) {
        	
               findRecursively(arr, mid+1, end, search);

        } else {
              findRecursively(arr, start, mid - 1, search);
        }

}

	public static void main(String[] args) {
		  int arr[] = {10, 12, 14, 15, 16, 20};
          int search = 20;
 
          int start = 0;
          int end = arr.length-1;
 
          findRecursively(arr, start, end, search);

	}

}

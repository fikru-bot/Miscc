package simple.java;

import java.util.Arrays;

public class ExponentialSearch {
// exponential search also known as doubling search which is used for searching sorted
//or unbounded/infinite arrays. this mechanism is used to find the range where the search 
//the search key may present.

public static  void main(String[] args){

    int[] arr = {6,12,18,24,32};
    int length= (arr.length-1);
    int value = 18;
    int outcome = exponentialSearch(arr,length,value);

    if(outcome<0){

       System.out.println( "Element is not present in the array");

    }else {

        System.out.println( "Element is  present in the array at index :"+outcome);
       }
    }
    
public static int exponentialSearch(int[] arr ,int length, int value ){

        if(arr[0]==value){
            return 0;
            }
        int i=1;
        while(i<length && arr[i]<=value){

            i=i*2;
        }
        return Arrays.binarySearch(arr,i/2,Math.min(i,length),value);
        }
}

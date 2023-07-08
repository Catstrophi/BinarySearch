import java.io.*;
import java.util.*;

/*
What is Binary Search?
    Binary Search is when we restrict the left and right most boundary and split it in half.
    With this we can use the process of elimination to find the target value.
        Used as 2^n, where is n is the length of the arr
            thus the formula is Log2(x)
    Pros:
        fast and more efficient
    Cons:
        the arr needs to be sorted
 */

public class BinarySearch {
    public static void main(String[] args) throws FileNotFoundException {
        // Gets the value from the imported file
        Scanner sc = new Scanner(new File("src/arrayVal"));

        // Gets the value and splits it into a String[]
        String[] arr = sc.nextLine().split(" ");

        // Takes the String[] and copies it to a int[]
        int[] arr1 = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            arr1[i] = Integer.parseInt(arr[i]);
        }

        System.out.println(binarySearch(arr1, 102));
    }
    public static int binarySearch(int[] arr, int val){
        // Sorts the arr and gets the left and right most value for the restriction
        Arrays.sort(arr);
        int lMax = 0;
        int rMax = arr.length - 1;

        // while left max is less to equal to right max, cannot go over
        while (lMax <= rMax) {
            // The mid is the mid of the left and right most restriction and not the array
            int mid = (lMax + rMax) / 2;
            // If the mid is the value we are looking for
            if(arr[mid] == val) {
                return mid;
            }
            // If the value of mid is less than the value, we need to shift it over to the right
            else if(arr[mid] < val) {
                lMax = mid + 1;
            }
            // If the value fo mid is more than the value, we need to shift is over to the left
            else{
                rMax = mid - 1;
            }
        }

        // If the value isn't in the arr, then we return -1
        return -1;
    }
}




# BinarySearch
Binary search for integers

The code imports the necessary Java classes: java.io.* and java.util.*.

Inside the BinarySearch class, there is a main method that serves as the entry point of the program. It throws a FileNotFoundException.
The main method reads input values from a file named "src/arrayVal" using a Scanner.
The values read from the file are split into a String array (arr) using whitespace as the delimiter.
The arr array is then copied to an int array (arr1) by converting each element from String to int.

The binarySearch method is called with the arr1 array and the value 102 as arguments, and the result is printed to the console.
The binarySearch method takes an array (arr) and a value (val) as parameters.

It starts by sorting the array using Arrays.sort(arr).
Two variables, lMax and rMax, are initialized to store the leftmost and rightmost indices of the search boundary.
The code enters a while loop that continues until the leftmost index is less than or equal to the rightmost index.

Inside the loop, the midpoint index (mid) is calculated as the average of the leftmost and rightmost indices.

If the value at the midpoint index in the array matches the target value, it is found, and the midpoint index is returned.

If the value at the midpoint index is less than the target value, the leftmost index is shifted to mid + 1 to search in the right half of the array.

If the value at the midpoint index is greater than the target value, the rightmost index is shifted to mid - 1 to search in the left half of the array.

If the target value is not found in the array, the loop continues until the leftmost index becomes greater than the rightmost index.

In that case, the method returns -1 to indicate that the target value was not found.


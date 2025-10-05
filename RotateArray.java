
import java.io.*;

class RotateArray {
    
    // Function to rotate the array to the left by d positions
    public static void rotate(int arr[], int d, int n) {
        
        int p = 1;
        while (p <= d) {
          
            // Store the first element in a temporary variable
            int first = arr[0];
            
            // Shift each element one position to the left
            for (int i = 0; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            
            // Place the first element at the end of the array
            arr[n - 1] = first;
            p++;
        }

        // Print the rotated array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int N = arr.length;
        
        // Rotate the array 2 times to the left
        int d = 2;

        // Function call to rotate the array
        rotate(arr, d, N);
    }
}

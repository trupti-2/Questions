// Q1: Merge two arrays by satisfying given constraints
// Given two sorted arrays X[] and Y[] of size m and n each where m >= n and X[] has exactly n vacant cells,
//  merge elements of Y[] in their correct position in array X[], i.e., merge (X, Y) by keeping the sorted order.

// For example,

// Input: X[] = { 0, 2, 0, 3, 0, 5, 6, 0, 0 }
// Y[] = { 1, 8, 9, 10, 15 } The vacant cells in X[] is represented by 0 
// Output: X[] = { 1, 2, 3, 5, 6, 8, 9, 10, 15 }
public class Q1 {
    public static void main(String[] args) {
        int[] X = { 0, 2, 0, 3, 0, 5, 6, 0, 0 };
        int[] Y = { 1, 8, 9, 10, 15 };

        ArrayMerge(X, Y);

        System.out.println("Merged array X[]:");
        for (int num : X) {
            System.out.print(num + " ");
        }
    }

    public static void ArrayMerge(int[] X, int[] Y) {
        int m = X.length;
        int n = Y.length;
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < m && j < n) {
            if (X[i] == 0) {
                i++;
            } else if (X[i] > Y[j]) {
                X[k++] = Y[j++];
            } else {
                X[k++] = X[i++];
            }
        }

        while (j < n) {
            X[k++] = Y[j++];
        }
    }
}

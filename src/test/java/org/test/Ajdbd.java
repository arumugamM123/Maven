package org.test;

public class Ajdbd {
    public int findMissingNumber(int[] arr) {

        int n = arr.length;
        int totalSum = (n + 1) * (n + 2) / 2;
        int arrSum = 0;
        for (int i = 0; i < n; i++) {
            arrSum += arr[i];
        }
        return totalSum - arrSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        int missingNumber = findMissingNumber(arr);
        System.out.println("Missing number is: " + missingNumber);
        
        
    }
}

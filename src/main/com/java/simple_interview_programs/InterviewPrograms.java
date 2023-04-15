package main.com.java.simple_interview_programs;

public class InterviewPrograms {

    /**
     * 1. Get all even numbers 1 to 100
     * @return
     */
    public int[] getEvenNumbers() {
        int[] evenNumbers = new int[50];
        for(int i=0; i<100; i++) {
            if(i%2==0) {
                evenNumbers[i/2] = i; //
            }
        }
        return evenNumbers;
    }

    /**
     * 2. Missing number from 1 to 20
     * @return
     */
    public int getMissingNumber() {
        int n= 20;
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 15, 16, 17, 18, 19, 20};

        int sum = 0;
        for(int i=0; i < arr.length; i++) {
            sum += arr[i];
        }

        int sumOfNumbers = n*(n+1)/2;

        return sumOfNumbers - sum;
    }

    /**
     * 3. swap elements
     *
     * @param a
     * @param b
     */
    public void swapElements(int a, int b) {
        System.out.println("Before Swapping: a - " + a + ": b - "+ b);

        int temp = a;  // in temp 10
        a = b;  // a = 20
        b = temp; // b= 10

        System.out.println("After Swapping: a - " + a + ": b - "+ b);
    }


    /**
     * Print array elements.
     *
     * @param arr
     */
    public void printElementsInAnArray(int[] arr) {
       for(int i=0; i<arr.length; i++) {
           System.out.println(arr[i]);
       }
    }
}

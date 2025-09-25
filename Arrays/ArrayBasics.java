 import java.util.Scanner;

 public class ArrayBasics {
     public static void main(String[] args) {
        // One way of intializing an array.
         int[] x = {6,19,7,69,9,171,5};
         System.out.println(x[3]); //indexing
         x[3] = 89;
         System.out.println(x[3]); //Updating element

        // Second way
         int[] arr = new int[4]; //Array of size 4.
         arr[0] = 0;
         arr[1] = 5;
         arr[2] = -8;
         arr[3] = 40;

        // Default value in an array is 0.

         Scanner sc = new Scanner(System.in);
         System.out.print("Enter the size of an array: ");
         int size = sc.nextInt();

//         int[] arr = new int[size];

         for (int i = 0; i < arr.length; i++) {
             arr[i] = sc.nextInt();
         }

         for (int i = 0; i < arr.length; i++) {
             System.out.print(arr[i] + " ");
         } } }

import java.util.Scanner;

public class MaxElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();


        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }

        int num1 = -1;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > num1) num1 = arr[i];
        }

        System.out.println("Maximum element of an array is: " + num1);


    }
}

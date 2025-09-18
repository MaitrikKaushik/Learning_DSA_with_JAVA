import java.util.Scanner;

public class SumOfElements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = input.nextInt();

        int[] add = new int[size];
        for(int i = 0; i < add.length; i++){
            add[i] = input.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < add.length; i++) {
            sum = sum + add[i];
        }

        System.out.println("Sum of elements of this array is: " + sum);
    }
}

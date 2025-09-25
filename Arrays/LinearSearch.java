import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,5,8,4};
        int target = 5;
        int found = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {found = i; break; }
        }
        if(found!=-1) System.out.println("Element exists at index: " + found);
        else System.out.println("Element not found in an array.");
    }
}

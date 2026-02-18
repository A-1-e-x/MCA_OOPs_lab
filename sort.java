import java.util.Arrays;
import java.util.Scanner;
public class sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter the total number of strings:");
        int n = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[n];
        System.out.println("Enter the strings:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }
        Arrays.sort(arr);
        System.out.println("Sorted list of strings:");
        for(int i=0;i<n;i++) {
            System.out.println(arr[i]);
        }
    }
}


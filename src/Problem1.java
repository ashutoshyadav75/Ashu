import java.sql.SQLOutput;
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element number:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array element: ");
        for( int i = 0 ; i< n ; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = o ; i< n ; i++){
            if(arr[i] > 35)
                System.out.println("Index Number : " arr[i]);
        }
    }
}x
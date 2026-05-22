import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class InputandOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the target element: ");
        int x = sc.nextInt();
        System.out.print("Enter the array size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the array element: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean flag = false;
        for(int i = 0; i < n; i++) {
            if (arr[i] == x)
                flag = true;
            break;
        }
        if(flag = true )
            System.out.println("ELement is found:" + );
        else
            System.out.println("Element is not found");
    }
}

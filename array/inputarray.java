package array;

import java.util.Scanner;

public class inputarray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size for an array : ");
        int num = scan.nextInt();

        int[] arr = new int[num];

        for(int i=0;i<num;i++){
            System.out.print("Enter the value :");
            arr[i]=scan.nextInt();
        }
        for(int j=0;j<num;j++){
            System.out.println(arr[j]);
        }

    }
    
}

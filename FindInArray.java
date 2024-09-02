import java.util.Scanner;

public class FindInArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Size");
        int n = sc.nextInt();
        System.out.println("K");
        int k = sc.nextInt();
        int[] a = new int[n];

        for(int i=0;i<n;i++){
            System.out.println("value of array");
            a[i] = sc.nextInt();
        }

        for(int i=0;i<n;i++){
            if(a[i]==k) System.out.println(i);
        }
    }
}
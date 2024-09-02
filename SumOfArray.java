import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size 1");
        int n =  sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter values for arr 1");
            a[i] = sc.nextInt();
        }
        System.out.println("Enter size 2");
        int m =  sc.nextInt();
        int[] b = new int[m];
        for(int i=0;i<m;i++){
            System.out.println("Enter values for arr 2");
            b[i] = sc.nextInt();
        }
        int max = Math.max(m, n);
        int[] c = new int[max];

        for(int i=max-1;i>=0;i--){
            
        }




    }
    
}

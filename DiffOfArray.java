import java.util.Scanner;

public class DiffOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size 1");
        int n =  sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter values for arr 1");
            a[i] = sc.nextInt();
        }
        System.out.println("Enter size 2");
        int m =  sc.nextInt();
        int[] b = new int[m];
        for(int i=0;i<m;i++){
            System.out.print("Enter values for arr 2");
            b[i] = sc.nextInt();
        }
        int max = Math.max(m, n);
        int[] c = new int[max];
        int min = Math.min(n,m);
        for(int i=max-1;i>=0;i--){
            if(max == m && min-1>=0){
                c[i] = b[i] - a[min-1];
                min--;
            }else if(max ==n && min-1>=0){
               c[i] = a[i]-b[min-1];
               min--; 
            }
        }
        if(max==m){
            for(int i=max-n-1;i>=0;i--){
                c[i] = b[i];
            }
        }
        if(max==n){
            for(int i=max-m-1;i>=0;i--){
                c[i] = a[i];
            }
        }

        for(int i=0;i<max;i++){
            System.out.print(c[i]+",");
        }


        


    }
}

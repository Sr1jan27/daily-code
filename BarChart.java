import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int n  = sc.nextInt();

        int[] a = new int[n];
        int max = 0;
        for(int i=0;i<n;i++){  
            System.out.println("Enter Bar chart value");
            a[i] = sc.nextInt();
            if(max<a[i]) max = a[i];


            
            
        }
        for(int j=max;j>0;j--){
            for(int i=0;i<n;i++){
                if(j<=a[i]){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.
                out.println();
           
            System.out.println();
            
            System.out.println();

            
        }
    }
    
}

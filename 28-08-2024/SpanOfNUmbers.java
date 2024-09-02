
import java.util.Scanner;

public class SpanOfNUmbers {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int[] arrY = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter a number");
            arrY[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int idx = 0; idx < arrY.length; idx++) {
            if(arrY[idx]>max) max = arrY[idx];
            if(arrY[idx]<min) min = arrY[idx];
            
        }

        System.out.println("Span of numbers =" + (max-min));
        sc.close();

    }
}

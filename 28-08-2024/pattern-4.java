import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        //Pattern 4
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i-1;j++){
                System.out.print("  ");
            }
            for(int j=i;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
    
}
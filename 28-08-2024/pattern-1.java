import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        //Pattern 1 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
    
}
import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        // digits of a number from left to right
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a large number");
        int n = sc.nextInt();
        int sample = n;
        int cnt=0;
        int rev =0;
        while(n>0){
            rev  = rev*10 + n%10;
            n = n/10;
        }
        
        while(rev>0){
            System.out.println(rev%10+" ...");
            rev = rev/10;
        }
        
        
    }
}
import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        //Benjamin Bulbs
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        
        for(int i=1;i*i<=n;i++){
            System.out.println(i*i);
        }
        
        
    }
}
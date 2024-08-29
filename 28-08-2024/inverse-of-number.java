import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        // inverse a number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a large number");
        int n = sc.nextInt();
        int val = n;
        int inv=0;
        int op =1;
        while(n>0)
        {
            int od = n%10;
            int id = op;
            int ip = od;
            
            inv = inv + id*(int)Math.pow(10,ip-1);
            
            n = n/10;
            op++;
        }
        
        System.out.println(inv +" is inverse of " + val);
        
    }
}
    
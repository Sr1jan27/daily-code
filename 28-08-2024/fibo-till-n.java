import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Give me a number");
        int n = sc.nextInt();
        int a1=0;
        int a2=1;
        System.out.print(a1 +", "+ a2+", ");
        while(n-->0){
            int a3 = a1+a2;
            if(n>1){
                System.out.print(a3 +", ");
                a1 = a2;
                a2=a3;
            }
        }
        
    }
}
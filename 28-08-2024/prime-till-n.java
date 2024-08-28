import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Give me a starting number");
        int s = sc.nextInt();
        System.out.println("Give me a ending number");
        int e = sc.nextInt();

        while(s<=e){
            boolean val = isPrime(s);
            if(val) System.out.println(s);
            s++;
        }
        
    }
    
    public static boolean isPrime(int a){
        for(int i=2;i*i<=a;i++){
            if(a%i==0) return false;
        }
        return true;
    }
}
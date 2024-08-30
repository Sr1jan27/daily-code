import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("print prime factors");
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        for(int div =2;div<=n;div++){
            while(n%div==0){
                System.out.println(div);
                n = n/div;
            }
        }
    }
}

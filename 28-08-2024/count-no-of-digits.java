import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a large number");
        int n = sc.nextInt();
       
        int cnt=0;
        while(n>0){
            cnt++;
            n= n/10;
        }
         System.out.println(cnt+ " digits are there");
    }
}
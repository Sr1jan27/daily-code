import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        // Convert a number in any base b to any base c
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number in any base");
        int n = sc.nextInt();
        System.out.println("Enter the base in which it is ");
        int b = sc.nextInt();
        System.out.println("Enter the base in which we want to convert ");
        int c = sc.nextInt();
        
        int convertedNumber = 0;
        int a =0;
        while(n>0){
            int rem = n%c;
            convertedNumber = convertedNumber +rem*(int)Math.pow(b,a);
            a++;
            n/=c;
        }
        
        System.out.println(convertedNumber);
    }
}
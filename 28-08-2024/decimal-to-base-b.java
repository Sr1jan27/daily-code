import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        // decimal to any base b 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number");
        int n = sc.nextInt();
        System.out.println("Enter the base to which we have to convert");
        int b = sc.nextInt();
        
        int convertedNumber = 0;
        int a =0;
        while(n>0){
            int rem = n%b;
            convertedNumber = convertedNumber +rem*(int)Math.pow(10,a);
            a++;
            n/=b;
        }
        
        System.out.println(convertedNumber);
    }
}
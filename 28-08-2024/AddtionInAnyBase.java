import java.util.Scanner;

public class AddtionInAnyBase {
    
    public static void main(String[] args) {
        // Addition of two numbers in any base given 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base in which it is ");
        int b = sc.nextInt();
        System.out.println("Enter a number in same base");
        int x = sc.nextInt();
        System.out.println("Enter another number to add");
        int y = sc.nextInt();
        int convertedNumberx = convertToDecimal(x,b);
        int convertedNumbery = convertToDecimal(y,b);
        int z = convertedNumberx + convertedNumbery;
        z = decimalToAnyBase(z,b);
        
        System.out.println("After addition answer is --> "+ z);
        sc.close();
    }
    public static int convertToDecimal(int x, int base){
        
        int convertedNumber = 0;
        int a =0;
        while(x>0){
            int rem = x%10;
            convertedNumber = convertedNumber +rem*(int)Math.pow(base,a);
            a++;
            x/=10;

            
        }
        
        return convertedNumber;
        
    }
    
    public static int decimalToAnyBase(int x, int base){
        
        int convertedNumber = 0;
        int a =0;
        while(x>0){
            int rem = x%base;
            convertedNumber = convertedNumber +rem*(int)Math.pow(10,a);
            a++;
            x/=base;
        }
        
        return convertedNumber;
        
    }
}

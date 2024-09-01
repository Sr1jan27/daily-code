import java.util.Scanner;

public class MultiplicationInAnyBase {
    
public static void main(String[] args) {
        // Multiplication of two numbers in any base given 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base in which it is ");
        int b = sc.nextInt();
        System.out.println("Enter a number in same base");
        int x = sc.nextInt();
        System.out.println("Enter another number to add");
        int y = sc.nextInt();

        int valueOfSubstraction = multiplyInAnyBase(x,y,b);
        System.out.println("After addition answer is --> "+ valueOfSubstraction);
        sc.close();
    }

    private static int multiplyInAnyBase(int x, int y, int b) {
        int convertedNumberx = convertToDecimal(x, b);
        int convertedNumbery = convertToDecimal(y, b);
        int decimalAnswer = convertedNumberx*convertedNumbery;
        return decimalToAnyBase(decimalAnswer, b);
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

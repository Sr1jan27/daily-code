import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        // pyhtogoras triplet 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        System.out.println("Enter another number");
        int r = sc.nextInt();
        System.out.println("Enter another number");
        int l = sc.nextInt();
        
        
        if(n>r && n>l){
            if(n*n==(r*r+l*l)) System.out.println("true");
            else System.out.println("false");
        }else if(l>r && l>n){
            if(l*l==(r*r+n*n)) System.out.println("true");
            else System.out.println("false");
        }else {
            if(r*r==(l*l+n*n)) System.out.println("true");
            else System.out.println("false");
        }
        
        
        
    }
}
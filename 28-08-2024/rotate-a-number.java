import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        // inverse a number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int val = n;
        int rotate = 0;
        System.out.println("Enter a number to rotate by");
        int r = sc.nextInt();
        int size =0;
        while(n>0)
        {
            size++;
            n = n/10;
        }
        n = val;
        r = r%size;
        if(r<0){
            r = r+size;
        }
        int div = 1;
        int mul =1;
        for(int i=1;i<=size;i++){
            if(i<=r) div *=10;
            else mul*=10;
        }
        
        int quo = n/div;
        int rem = n % div;
        
        int rot = rem*mul + quo;
        System.out.println(rot +" is rotate of " + val);
        
    }

}
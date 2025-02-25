
import java.util.Scanner;
import java.util.Stack;

public class DuplicateBrackets {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine(); 
    

    Stack<Character> st = new Stack<>();
    for (int i = 0; i < s.length(); i++){
        char c = s.charAt(i);
        if(c==')'){
            if(st.peek()=='('){
                System.out.println("true");
                
            }else {
                while(st.peek()!='('){
                    st.pop();
                }
                st.pop();
            }
        }
        else{
            st.push(c);
        }
    }
    System.out.println("False");
}

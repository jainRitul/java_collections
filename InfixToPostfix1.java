import java.util.ArrayDeque;
import java.util.Stack;

public class InfixToPostfix1 {
    static int prec(char c){
         if(c == '^'){
            return 3;

         }
         else if(c =='*' || c=='/')
         return 2;
         else if(c=='+' || c=='-')
         return 1;
         else 
         return 0;
    }
    static char associativity(char c){
        if(c == '^')
        return 'R';
        return 'L';
    }
    public static void main(String[] args) {
        String s = "a+b*c+d";
        infix(s);
    }
    static void infix(String s){
        StringBuilder res = new StringBuilder();
        Stack<Character>stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if((c>='a' && c<='z' )|| (c>='A' && c<='Z') || (c>='0' && c<='9')){
                res.append(c);
            }
            else if(c ==')')
            { 
                while (!stack.isEmpty() && stack.peek()!= '(') {
                res.append(stack.pop());   
                }
                stack.pop();

            }
            else if(c=='('){
                stack.push(c);
            }
            else{
                while (!stack.isEmpty() && ((prec(c) < prec(stack.peek()))||
                                        (prec(c) == prec(stack.peek()))&&
                                        (associativity(c)=='L')) ){
                    res.append(stack.pop());
                                }stack.push(c);
            }

        }
        while (!stack.isEmpty()) {
            res.append(stack.pop());
        }
        System.out.println(res);

    }
}

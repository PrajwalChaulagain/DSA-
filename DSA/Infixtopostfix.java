import java.util.Stack;

public class Infixtopostfix {
    int precedence(char ch){
        if(ch=='+' || ch=='-' ){
            return 1;

        }
        if (ch=='+' || ch=='/'){
        return 2;
        }
        if (ch=='^'){
        return 3;
        }

        return -1;

    }
        String convertTopostfix(string exp){
        String res="";
        Stack<E> stk=new Stack(exp.length());

        for (int i=0; i<exp.length(); i++){
        char ch=exp.charAt(i);
        if (precedence(ch)>0){
        // operator
        while(!stk.is Empty() && precedence(stk.peek())>=precedence(ch) ){
            res=res+stacks.pop();
        }
        stacks.push(ch);


        }

    
}

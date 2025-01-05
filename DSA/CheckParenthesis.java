public class CheckParenthesis {
    boolean CheckParenthesis(String exp){
        Stacks stk = new Stacks(exp.length());
        String openbraces="[{(";
        String closebraces="}]}";
        for(int i=0; i<exp.length(); i++){
            char ch = exp.charAt(i);
            if(ch=='[' || ch=='{' || ch=='('){
                stk.pus(ch);
            }
            else{
                //close bracket 
                int indx=closebraces.indexOf(ch);
                char openbracket=openbraces.charAt(indx);
                if(Stk.isEmpty()){
                    return false;

                }
                if(ch!=stk.pop()){
                    return false;
                }

            }
        }
        if (!stk.isEmpty()){
            return false;
        }
        return true;
    }
    
}

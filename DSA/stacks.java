public class stacks{
    int [] stk;
    int top=-1;
    int size;
    
    stacks(int size){
        stk=new int[size];
        this.size=size;

    }

    void push(int data){
        if(isFull()){
        System.out.println("stack overflow");
    }
    else{
        //top++
        stk[++top]=data;
    }
    
    }
    int pop(){
        if (isEmpty()){
            System.out.println("stack underflow");
            return -9999;
        }
        //int temp=top;
        //top--;
        return stk[top--];
    }
        


    boolean isFull(){
        return top==size-1;
    }

    boolean isEmpty(){
        return top==-1;
    }
}

public static void main(String[] args){
    stacks s=new stacks(5);
    s.push(10);
    s.push(20);
    System.out.println(s.pop());

}
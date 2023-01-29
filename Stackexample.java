import java.util.Stack;
public class Stackexample{
   public static void main(String args[]){
    Stack <Integer> stk =new Stack<>();
    boolean result=stk.empty();
    System.out.println("stack is empty:"+result);
    stk.push(10);
    stk.push(30);
    stk.push(40);
    System.out.println("elements in stack:"+stk);
    result=stk.empty();
    System.out.println("stack is empty:"+result);
    stk.pop();
    stk.pop();
    stk.pop();
    System.out.println("stack is empty?:"+stk);



   }
}
 
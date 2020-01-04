package JZOffer;

import java.util.Stack;

/**
 * Created by Amie on 2018/7/16.
 */
public class Solution9 {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();
    public void push(int node){
        stack1.push(node);
    }
    public void pop(){
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        stack2.pop();
    }
}

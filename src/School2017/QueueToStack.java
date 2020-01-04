package School2017;

import java.util.LinkedList;

/**
 * Created by Amie on 2018/9/8.
 */
public class QueueToStack {
    LinkedList<Integer> queue1 = new LinkedList<>();
    LinkedList<Integer> queue2 = new LinkedList<>();
    public void push(int value){
        if (queue1.isEmpty() && queue2.isEmpty()) {
            queue1.addLast(value);
            return;
        }
        if (queue1.isEmpty()) {
            queue2.addLast(value);
            return;
        }
        if (queue2.isEmpty()) {
            queue1.addLast(value);
            return;
        }
    }
    public int pop(){
        if (queue1.isEmpty() && queue2.isEmpty()){
            try {
                throw new Exception("stack is empty");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else if (queue1.isEmpty()){
            while (queue2.size()>1){
                queue1.addLast(queue2.poll());
            }
            return queue2.poll();
        }
        else{
            while (queue1.size()>1){
                queue2.addLast(queue1.poll());
            }
            return queue1.poll();
        }
        return -1;
    }

    public static void main(String[] args) {
        QueueToStack queueToStack = new QueueToStack();
        queueToStack.push(1);
        queueToStack.push(2);
        System.out.println(queueToStack.pop());
        System.out.println(queueToStack.pop());
        queueToStack.push(3);
        System.out.println(queueToStack.pop());
        System.out.println(queueToStack.pop());
    }
}

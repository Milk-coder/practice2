import java.util.LinkedList;
import java.util.Queue;

public class MyStack1 {
    Queue<Integer> queue1;
    Queue<Integer> queue2;
     MyStack1(){
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }
    public void push(int x){
         if(queue1.isEmpty()){
             queue2.offer(x);
         }
         else{
             queue1.offer(x);
         }
    }
    public int pop(){
         int ret = 0;
         if(queue1.isEmpty()){
             int sz = queue2.size();
             while(sz > 1){
                 queue1.offer(queue2.poll());
                 --sz;
             }
             ret = queue2.poll();
         }
         else{
            int sz = queue1.size();
            while(sz > 1){
                queue2.offer(queue1.poll());
                --sz;
            }
            ret = queue1.poll();
         }
         return  ret;
    }
    public int top(){
         int ret = pop();
         push(ret);
         return  ret;
    }
    public boolean empty(){
         return  queue1.isEmpty()&& queue2.isEmpty();
    }

    public static void main(String[] args) {
        MyStack1 st = new MyStack1();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st.queue1);
        System.out.println(st.queue2);
        System.out.println(st.pop());
    }
}

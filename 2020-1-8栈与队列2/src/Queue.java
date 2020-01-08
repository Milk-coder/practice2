
public class Queue {
    class Node{
        int value;
        Node next;

    }
        Node front;
        Node rear;
        int size;
        public Queue(){
            //空队列
            front = rear = null;
            size = 0;
        }
        public void offer(int value) {
            Node newNode = new Node();
            newNode.value = value;
            newNode.next = null;
            //空队列
            if (front == null) {
                front = rear = newNode;
            }
            //尾插
            else {
                rear.next = newNode;
                rear = rear.next;
            }
            ++size;
        }
        public void po11(){
            if(front == null){
                return;
            }
            front = front.next;
            //处理最后一个结点
            if(front == null)
                rear = null;
                    --size;
        }
        public int peek(){
            if(front == null){
                throw new RuntimeException("队列为空");
            }
            return  front.value;
        }
        public int rear(){
            if(front == null){
                return  -1;
            }
            return  rear.value;
        }
        public int size(){
            return  size;
        }
        public boolean empty(){
            return  size == 0;
            //return  front == null;
        }

    public static void main(String[] args) {
        Queue q = new Queue();
        System.out.println(q.empty());
        System.out.println(q.size());
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        q.offer(5);
        System.out.println(q.empty());
        System.out.println(q.size());
        while(!q.empty()){
            System.out.println(q.peek());
            q.po11();;
        }
        System.out.println(q.empty());
        System.out.println(q.size());
    }
}

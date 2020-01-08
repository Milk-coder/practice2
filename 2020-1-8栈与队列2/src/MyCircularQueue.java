public class MyCircularQueue {
   private  int[] array;
   private  int front;//队头元素的位置
   private  int rear;//队尾元素的下一个位置

    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        array = new int[k+1];//存k个元素
        front = rear = 0;
    }

    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
     if(isFull()){
         return  false;
     }
     //尾插
     array[rear++] = value;
     //判断位置是否越界，保证为环状
        rear = rear % array.length;
       // if(rear == array.length)
          //  rear = 0;
        return  true;
    }

    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        //判断队列是否为空
     if(isEmpty()){
        return  false;
    }
     front++;
     //判断位置是否越界，位置更新
     front = front% array.length;
        return  true;
    }

    /** Get the front item from the queue. */
    public int Front() {
        if(isEmpty())
            return  -1;
         return  array[front];
    }

    /** Get the last item from the queue. */
    public int Rear() {
        if(isEmpty()){
            return  -1;
        }
        if(rear == 0){
            return  array[array.length-1];
        }
         return  array[rear-1];
    }

    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        return  front == rear;
    }

    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        return  (rear+1)%array.length == front;
    }
}

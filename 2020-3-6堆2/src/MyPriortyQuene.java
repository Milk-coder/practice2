import java.util.Arrays;

public class MyPriortyQuene {
    private int[] arr = new int[8];
    private int sz;

    public void offer(int value) {
        //优先级队列入队操作
        if (sz == arr.length) {
            arr = Arrays.copyOf(arr, arr.length * 2);
        }

        //1.尾插
        //2.向上调整
        arr[sz++] = value;
        Mheap.shiftUpSmall(arr, sz, sz - 1);
    }
    //出队的操作
    //1.交换swap（0，size-1)
    //2.尾删
    //3.向下调整
    public int poll(){
        if(sz > 0){
            int peek = arr[0];
            Mheap.swap(arr,0,sz-1);
            --sz;
            Mheap.shiftDownSmall(arr,sz,0);
            return  peek;
        }
        return  -1;
    }
    public int peek(){
        return arr[0];
    }
    public  boolean isEmpty(){
        return  sz == 0;
    }
}
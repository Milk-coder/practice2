import java.util.Arrays;

public class HeadSort {
    public static void swap(int[] arr, int i, int j){
        int temp  = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    //大堆
    public static void shiftDownBig(int[] arr,int parent,int sz){
        int child = 2 * parent +1;
        while(child < sz){
            //比较两个孩子的大小
            if(child +1 <sz && arr[child+1] > arr[child]){
                ++child;
            }
            if(arr[child] > arr[parent]){
            swap(arr,child,parent);
            parent = child;
            child = 2*parent +1;
            }
            else
                break;
        }
    }
    public static void heapSort(int[] arr){
        int len = arr.length;
        //建堆,最后一个非叶子节点开始向下调整
        for(int i = (len-2)/2;i >= 0; --i){
            shiftDownBig(arr,i,len);
        }
        //交换
        // end -未排序元素的位置
        int end = len-1;
        while(end > 0){
            swap(arr,0,end);
            shiftDownBig(arr,0,end);
            --end;
        }
    }

    public static void main(String[] args) {
        int[] arr ={1,2,5,2,6,3,8};
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }


}

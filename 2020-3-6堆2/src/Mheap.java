import java.util.Arrays;
import java.util.PriorityQueue;

public class Mheap {
        //交换函数
        public static void swap(int[] arr, int i, int j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp                                                                               ;
        }
        //大堆向下调整
        public static void shiftDownBig(int[] arr, int sz, int parent) {
            int child = parent * 2 + 1;
            while (child < sz) {
                //右孩子出界不存在或右孩子的值大于左孩子
                if (child + 1 < sz && arr[child + 1] > arr[child]) {
                    ++child;
                }
                //比较-交换-更新
                if (arr[child] > arr[parent]) {
                    swap(arr, child, parent);
                    parent = child;
                    child = parent * 2 + 1;
                } else {
                    break;
                }
            }
        }
        //大堆向上调整
        public static void shiftUpBig(int[] arr,int sz,int child) {
            int parent = (child - 1) / 2;
            while (child > 0) {
                //比较-交换-更新
                if (arr[child] > arr[parent]) {
                    swap(arr, child, parent);
                    child = parent;
                    parent = (child - 1) / 2;
                } else {
                    break;
                }
            }
        }
        //小堆向下调整
        public static  void shiftDownSmall(int[] arr,int sz,int parent){
            int child = parent * 2 + 1;
            while (child < sz) {
                if (child + 1 < sz && arr[child + 1] < arr[child]) {
                    ++child;
                }
                if (arr[child] < arr[parent]) {
                    swap(arr, child, parent);
                    parent = child;
                    child = parent * 2 + 1;
                } else {
                    break;
                }
            }
        }
        //小堆向上调整
        public static void shiftUpSmall(int[] arr,int sz,int child) {
            int parent = (child - 1) / 2;
            while (child > 0) {
                //比较-交换-更新
                if (arr[child] < arr[parent]) {
                    swap(arr, child, parent);
                    child = parent;
                    parent = (child - 1) / 2;
                } else {
                    break;
                }
            }
        }
        // 创建大堆
        public static  void creatBig(int[] arr){
            for(int i = (arr.length - 2)/2; i>= 0; --i){
                shiftDownBig(arr,arr.length,i);
            }
        }
        //创建小堆
        public  static  void creatSmall(int[] arr){
            for(int i = (arr.length - 2)/2; i>= 0; --i){
                shiftDownSmall(arr,arr.length,i);
            }
        }

        public static void main(String[] args) {
            int[] arr = {6,4,3,7,20,56,89,25};
            System.out.println(Arrays.toString(arr));
            creatBig(arr);
            System.out.println(Arrays.toString(arr));
            creatSmall(arr);
           System.out.println(Arrays.toString(arr));
        }

    }

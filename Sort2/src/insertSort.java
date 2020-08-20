import java.util.Arrays;
// 插入排序
public class insertSort {
    public static void insertSort1(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            //i表示已排序数据的最后一个位置
            int key = arr[i + 1];
            int end = i;
            while (end >= 0 && arr[end] > key) {
                arr[end + 1] = arr[end];
                --end;
            }
            arr[end + 1] = key;
        }
    }
    public static void insertSort2(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            //i 表示下一个待排序元素的位置
            int key = arr[i];
            int end = i - 1;
            while (end >= 0 && arr[end] > key) {
                arr[end + 1] = arr[end];
                --end;
            }
            arr[end + 1] = key;

        }
    }



    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 8, 5, 3, 10, 4, 7};
        insertSort1(arr);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        insertSort2(arr);
        System.out.println(Arrays.toString(arr));
    }
}


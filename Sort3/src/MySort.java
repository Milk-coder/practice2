import java.util.Arrays;

public class MySort {
    public static void swap(int[] arr,int i ,int j){
        int temp = arr[i];
        arr[i] = arr [j];
        arr[j] = temp;
    }
    //挖坑法
      public static  int  partion2(int[] arr,int left,int right){
          //获取基准值
          int key = arr[left];
          //挖坑填坑
          while(left < right){
              //从右边找第一个小于KEY的值，填左边的坑
              while(left < right && arr[right] >= key)
                  --right;
                  //填坑
                  arr[left] = arr[right];
              //从左边找第一个大于KEY的值，填右边的坑
              while (left < right && arr[left] <= key)
                  ++left;
                  arr[right] = arr [left];
              }
          arr[left] = key;
          return  left;
      }
      //前后遍历法
      public  static int parition3(int[] arr,int left,int right){
          int prev = left;
          int cur = left +1;
          int key = arr[left];
          while(cur  <= right){
              if(arr[cur] < key && ++prev != cur){
                  swap(arr,prev,cur);
                  ++cur;
              }
          }
          swap(arr,left,prev);
          return  prev;
      }
      public  static void quickSort(int[] arr,int left,int right){
          if(left < right) {
             /* int mid = partion2(arr, left, right);*/
              int mid = parition3(arr, left, right);
              quickSort(arr,left, mid-1);
              quickSort(arr,mid+1,right);
          }
      }

    public static void main(String[] args) {
          int[] arr = {6,1,2,5,9,3,4,7,10,8};
          quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

}

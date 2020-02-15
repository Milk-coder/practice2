import java.util.Arrays;
class Solution {
    // 大写转换成小写字母
    public String toLowerCase(String str) {
        char[] a = new char[str.length()];
        int n = str.length();
        for (int i = 0; i <= n; i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                a[i] = (char) (str.charAt(i) + 32);//类型转换
            }
            else {
                a[i] = str.charAt(i);
            }
        }
        return String.valueOf(a);
    }
    //旋转数组，将数组中的元素向右移动k个位置(后面优化）
    public void rotate (int[] nums,int k){
        k = k % nums.length;
        for(int i = 0;i< k;i++){
            int temp = nums[nums.length -1];
            for(int j=nums.length -2;j>= 0;j--){//一个一个往后移
                nums[j+1] = nums[j];
            }
            nums[0] = temp;
        }
    }

    public static void main(String[] args) {
        Solution a = new Solution();
        int[] nums = {1,2,3,4,5};
        a.rotate(nums,2);
        System.out.println(Arrays.toString(nums));
    }



}
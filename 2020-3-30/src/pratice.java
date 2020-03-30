import java.util.Scanner;

//统计回文
public class pratice {
    //判断是否为回文结构
    public  static  boolean isHuiWen(StringBuffer s) {
        /*int i = 0;
        int j = s.length()-1;
        while(i<j){
            if(s.charAt(i)!= s.charAt(j)){
                return  false;
            }
            i++;
            j--;
        }
        return  true;*/
        StringBuffer sb = new StringBuffer(s);
        sb.reverse();
        if(s.toString().equals(sb.toString())){
            return  true;
        }
        return  false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String a = scanner.next();
            String b = scanner.next();
            int count = 0;
            int sz = a.length();
            for(int i = 0;i<= sz; i++){
                StringBuffer sb = new StringBuffer(a);
                //插入b到字符串a中
                sb.insert(i,b);
                if(isHuiWen(sb)){
                    count++;
                }
            }
            System.out.println(count);
        }
    }

}

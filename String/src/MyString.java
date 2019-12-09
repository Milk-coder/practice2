import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyString {

    //利用静态属性模拟常量池
    private  static List<MyString> constantpool  = new ArrayList<>( );
     //String 里面是value/ length;
    private  final  char[] value;
    private  final int length;
    public  MyString(char[] value){
        this.value = Arrays.copyOf(value, value.length);
        this.length = value.length;
    }
    public MyString concat (MyString s){
        char[] v = new char[length + s.length];
        System.arraycopy(value,0,v,0,length);
        System.arraycopy(s.value,0,v,length,s.length);
        return new MyString(v);
    }
    public char[] toCharArray(){
        return Arrays.copyOf(value,length);
    }
    public MyString intern(){
        for(MyString s :constantpool){
            if(s.equals(this)){
                return  s;
            }
        }
        constantpool.add(this);
        return  this;
    }


}

import java.util.Arrays;
public class MyArrayList{
	private int[] array;
	private int size;
	
	MyArrayList(){
		array = new int[10];
		size = 0;
	}
	//尾插
	public void pushBack(int element){
		array[size++] = element;
	}
	//尾删
	public void popBack(){
		array[--size] = 0;
	}
	//头插
	public void pushFront(int element){
		//原有数据后移一格
		for(int i = size-1;i>= 0;i--){
			array[i+1] = array[i];
			
		}
			array[0] = element;
			size++;
	}
	//头删
	public void popFront(){
		for(int i =1; i<=size;i++){
			array[i-1] = array[i];
		}
		array[size-1] = 0;
		size--;
	}
	//指定下标插入
	public void insert(int element,int index){
		for(int i = size-1;i>=index;i--){
			array[i+1]= array[i];
		}
			array[index] = element;
			size++;
	}
	@Override
	public String toString(){
		return Arrays.toString(Arrays.copyOf(array,size));
	}
	public static void main(String[] args){
		MyArrayList list = new MyArrayList();
		list.pushBack(1);
		list.pushBack(2);
		list.pushBack(3);
		list.pushFront(20);
		list.popBack();
		list.insert(5,2);
		list.popFront();
		System.out.println(list);
	}
}
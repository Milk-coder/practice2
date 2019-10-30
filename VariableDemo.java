public class VariableDemo{
	public static void main(String[] args){
		
		short minShort = Short.MIN_VALUE;//类型的最小值
		short maxShort = Short.MAX_VALUE;//类型的最大值
		long  minLong  = Long.MIN_VALUE;
		long  maxLhort = Long.MAX_VALUE;
		
		
		System.out.println(minShort);
		System.out.println(maxShort);
		System.out.println(minLong);
		System.out.println(minLong);
		int a = 0b1010;
		long b = 10L;//Long类型字面量
		System.out.println(a);
		System.out.println(b);
		String s = "hello world";
		System.out.println(s);
	    System.out.println(args[0]);//访问数组第一个元素
		System.out.println(args[1]);
		System.out.println("Hello World");
		System.out.println("开题报告");
	}
}
import java.util.ArrayList;import java.util.Arrays;import java.util.List;//接口interface  Condition{    boolean judge(String s1,String s2);}class EqualsCondition implements  Condition{    @Override    public boolean judge(String s1, String s2) {        return s1.equals(s2);    }}public class StringMethods{    public static List<String> find(List<String> origin, String s, Condition condition){        List<String> result = new ArrayList<>();        for(String s1: origin){            if(condition.judge(s,s1)){                result.add(s1);            }        }        return  result;    }    //找出所有相等的    public static List<String> findEquals (List<String>origin ,String s){       /* List<String> result = new ArrayList<>();        for(String s1: origin){            if(s1.equals(s)){                result.add(s1);            }        }        return  result;*/       return  find(origin, s, new EqualsCondition());    }    //小于s的    public static List<String> findLessThan(List<String>origin, String s){        /*List<String> result = new ArrayList<>();        for(String s1: origin){            if(s1.compareTo(s)< 0){                result.add(s1);            }        }*/        //匿名类        Condition condition = new Condition() {            @Override            public boolean judge(String s1, String s2) {                return s1.compareTo(s2) < 0;            }        };        return  find(origin, s, condition);    }    //不区分大小写    public static List<String> findEqualsIgnoreCase(List<String>origin, String s){       /* List<String> result = new ArrayList<>();        for(String s1: origin){            if(s1.equalsIgnoreCase(s)){                result.add(s1);            }        }*/       Condition condition = (s1, s2) -> s1.equalsIgnoreCase(s2);        return  find(origin, s, condition);    }    // 结尾包含s的    public static List<String> findEndsWith(List<String>origin, String s){       /* List<String> result = new ArrayList<>();        for(String s1: origin){            if(s1.endsWith(s)){                result.add(s1);            }        }        return  result;*/       Condition condition = (s1, s2) -> s1.endsWith(s2);       return find( origin,s,condition);    }    //包含s的    public static List<String> findContains(List<String>origin, String s){        /*List<String> result = new ArrayList<>();        for(String s1: origin){            if(s1.contains(s)){                result.add(s1);            }        }        return  result;*/        Condition condition = (s1, s2) -> s1.contains(s2);        return find( origin,s,condition);    }    //判断    private  static boolean isNumber(String s) {        for (char c : s.toCharArray()) {            if(c<'0'|| c>'9'){                return  false;            }        }        return true;    }    public static void main(String[] args) {       /* List<String> origin = new ArrayList<>();        origin.add("add");        origin.add("hello");        origin.add("BIT");        origin.add("world");        System.out.println(isNumber("0"));        System.out.println(findEquals(origin,"hello"));        System.out.println(findLessThan(origin,"bite"));        System.out.println(findEqualsIgnoreCase(origin,"WORLD"));        System.out.println(findContains(origin,"d"));*/        //regex:正则表达式        /*String command = "javac -encoding UTF-8 StringMethod.java";        String [] brgs = command.split(" ");        System.out.println(Arrays.toString(brgs)); */       /* String domain = "www.baidu.com";        String [] subdomain = domain.split("\\.");        System.out.println(Arrays.toString(subdomain));*/       String[] subdomain ={"www","baidu","com"};        System.out.println(String.join( ".",subdomain));        //concat 字符串拼接        String S1 = "HELLO";        String s2= S1.concat("world");        System.out.println(s2);    }}
package baseapi.Day01;
/*
字符串常量池，程序中直接写上双引号的字符串，就在字符串常量池中；
对于基本数值类型来说  ==是对于数值的比较
对于引用类型来说，== 是对于地址的比较
 */
public class day01String {
    public static void main(String[] args) {
        String  str4 = new String();
        System.out.println(str4);
        char[]  chararry = {'a','b','c'};
        String str2 = new String(chararry);
        System.out.println(str2);
        byte[] bytearry = {90,91,92};
        String  str3 = new String(bytearry);
        System.out.println(str3);
        String  str5 = "Hello Word";
        System.out.println(str5);

    }
}

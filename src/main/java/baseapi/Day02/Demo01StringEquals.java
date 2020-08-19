package baseapi.Day02;
/*
==是进行对象的地址比较，字符串的比较可以使用2个方法：
1.public boolean equals(Object obj)参数可以是任何对象
2.
 */

public class Demo01StringEquals {
    public static void main(String[] args) {
        String str1 = "Hello";
        char[] charArry = {'H', 'e', 'l', 'l', 'o'};
        String str2 = new String(charArry);
        System.out.println(str1.equals(str2));
    }
}

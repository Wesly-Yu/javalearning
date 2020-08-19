package baseapi.Day02;
/*
String 中获取相关的常用方法有：
public int lengh():获取字符串当中含有的字符个数，拿到字符长度
public String concat(String str):将当前的字符串和参数拼接并返回新的字符串
public char charAt(int index):获取指定索引的字符串
public int indexof(String str):查找指定参数字符串在本字符串中首次出现的索引位置，如果没有则返回-1


 */
public class Demo02StringGet {
    public static void main(String[] args) {
        //获取字符串的长度
        int length = "dhawiuhoijoiejfioj".length();
        System.out.println("字符创的长度是："+length);

        //拼接字符串
        String str1 = "Hello";
        String str2 = "Word";
        String str3 = str1.concat(str2);
        System.out.println(str3);
        System.out.println("------------------------");
        char ch = "Hello".charAt(1);
        System.out.println("字母1所在的位置："+ch);
        System.out.println("-----------------------------------");
        String  oringinal = "HelloWord";
        int index = oringinal.indexOf("ord");
        System.out.println(index);


    }
}

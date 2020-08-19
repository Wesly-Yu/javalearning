package baseapi.Day02;
/*
String 中常见的转换方法有：
public char[] toCharArray(), 将当前字符串拆分为字符数组作为返回值
pubic  byte[] getBytes(), 获得当前字符串底层的字符数组
public String replace(CharSequence  oldstring, CharSequence newString)将
字符串中指定位置的字符替换为新的指定字符串，返回替换的结果，新字符串


 */
public class Demo04StringConvert {
    public static void main(String[] args) {
        char[] chars = "HelloWord".toCharArray();
        System.out.println(chars[0]);
        System.out.println(chars.length);
        System.out.println("----------------------------------------");
        byte[] bytes = "abcdefg".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        System.out.println("-------------------------------------------");
        String str1 = "what are you doing here";
        String replace = str1.replace("doing", "fuck doing");
        System.out.println(replace);

    }
}

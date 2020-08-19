package baseapi.Day02;
/*
字符串的截取方法
public String substring(int index)截取从参数位置一直到字符串的末尾，然后返回字符串
public String  substring(int begin, int end)指定字符串的截取 开始位置与结束位置  中间的字符串
备注：[)左闭右开区间
 */
public class Demo03StringCut {
    public static void main(String[] args) {
        String  str1 = "HelloWord";
        String str2 = str1.substring(5);
        System.out.println(str2);
        System.out.println("-----------------");
        String str3 = str1.substring(5,9);
        System.out.println(str3);
    }
}

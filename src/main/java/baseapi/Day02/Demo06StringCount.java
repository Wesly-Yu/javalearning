package baseapi.Day02;

import java.util.Scanner;

/*
输入一串字符串，统计其中每个字符出现的次数
 */
public class Demo06StringCount {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String input = sc.next();
        int countUpper = 0;
        int countLower = 0;
        int countNumber = 0;
        int countOther = 0;
        char[] charsArray = input.toCharArray();
        for (int i = 0; i < charsArray.length; i++) {
            char ch = charsArray[i];
            if('A'<=ch && ch<='Z'){
                countUpper++;
            }else if ('a'<=ch &&ch<='z'){
                countLower++;
            }else if('0'<=ch &&ch<='9'){
                countNumber++;
            }
            countOther++;
        }
        System.out.println("大写字母有："+countUpper);
        System.out.println("小写字母有："+countLower);
        System.out.println("数字有："+countNumber);
        System.out.println("其他字符有："+countOther);

    }
}

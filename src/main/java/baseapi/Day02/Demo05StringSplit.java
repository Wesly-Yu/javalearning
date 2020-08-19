package baseapi.Day02;
/*


 */
public class Demo05StringSplit {
    public static void main(String[] args) {
        String str1 = " aa,bb,cc,dd";
        String[] str2 = str1.trim().split(",");
        for (int i = 0; i < str2.length; i++) {
            System.out.println(str2[i]);

        }

    }
}

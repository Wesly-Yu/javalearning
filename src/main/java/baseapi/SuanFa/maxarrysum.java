package baseapi.SuanFa;

import com.google.gson.internal.$Gson$Types;

public class maxarrysum {
    public static void main(String[] args) {
        reverse();
    }

    public static  void reverse(){
        String slist = "abcdefg";
        String  a ="";
        char[] chars = slist.toCharArray();
        for (int i = chars.length-1; i>=0; i--) {
            a+=chars[i];
        }
        System.out.println(getType(a));
        System.out.println(a);
    }
    public static String getType(Object o){
        return o.getClass().getName().toString();
    }

}

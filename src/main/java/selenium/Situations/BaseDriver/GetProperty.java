package selenium.Situations.BaseDriver;

import org.testng.annotations.Test;

import java.io.*;
import java.util.Properties;

public class GetProperty {
    @Test
    public static void getPropertied() throws IOException {
        Properties  pro = new Properties();
//        String configpath = "..\\resources\\configure\\config.properties";
        InputStream inputStream = Object.class.getResourceAsStream("/config.properties");
        InputStreamReader inputStreamReader = null;
        String value = null;
        try{
            inputStreamReader = new InputStreamReader(inputStream,"GBK");
            pro.load(inputStreamReader);
//            value = (String) pro.get(keyword);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        System.out.println(pro.get("baseUrl"));
    }

//    public static void main(String[] args) throws IOException {
//        String baseurl = getPropertied("baseUrl");
//        System.out.println(baseurl);
//    }
}

package selenium.Situations.BaseDriver;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import java.io.*;
import java.util.Properties;

public class GetProperty {
//    @Test
//    public static void getPropertied() throws Exception {
//        Properties  pro = new Properties();
////        String configpath = "src/main/resources/configure/basedata.properties";
//        InputStream inputStream = Object.class.getResourceAsStream("");
//        InputStreamReader inputStreamReader = null;
//        String value = null;
//        try{
//            pro = PropertiesLoaderUtils.loadAllProperties("basedata.properties");
//            System.out.println(new String(pro.getProperty("baseUrl").getBytes("iso-8859-1"),"gbk"));
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }
//
//    }

    public static void main(String[] args) throws IOException {
        Properties  pro = new Properties();
        try{
            pro = PropertiesLoaderUtils.loadAllProperties("configure/basedata.properties");
            System.out.println(pro.getProperty("baseUrl"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}

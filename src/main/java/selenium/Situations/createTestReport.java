package selenium.Situations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class createTestReport {
    public static void main() {
        String mainpath = System.getProperty("user.dir");
        String cmd = "allure serve" +"  "+mainpath+"\\allure-results";
        try{
            Process process = Runtime.getRuntime().exec(cmd);
            InputStream inputStream = process.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream,"GBK");
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String content = bufferedReader.readLine();
            while (content !=null){
                System.out.println(content);
                content = bufferedReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

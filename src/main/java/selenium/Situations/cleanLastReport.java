package selenium.Situations;

import selenium.Situations.BaseDriver.BaseClass;

import java.io.File;

public class cleanLastReport {

    public static  void deletDir(String path){
        File file = new File(path);
        if (!file.exists()){
            System.out.println("文件路径不存在");
        }
        String[] content = file.list();//获取当前目录下所有文件和文件夹
        for(String name:content){
            File temp = new File(path,name);
            if(temp.isDirectory()){//判断是否是目录
                deletDir(temp.getAbsolutePath());//递归调用删除目录里面的内容
                temp.delete();//删除空目录
            }else {
                if(!temp.delete()){
                    System.out.println("删除"+name+"失败");
                }
            }
        }

    }
}

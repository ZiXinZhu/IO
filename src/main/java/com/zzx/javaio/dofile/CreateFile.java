package com.zzx.javaio.dofile;

import java.io.File;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * Created by:  Vivian
 * Date: 2018/7/31 21:58
 */
public class CreateFile {

    /**
     * 创建文件
     */
    public void createfile(){
      //  String path="F:\\file\\f.txt";
        String path="F:\\file\\f\\j\\t.txt";
        File file=new File(path);
        if (!file.exists()) {
            file.getParentFile().mkdirs();//依次创建目录
        }
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
      //  File file1=new File("F:\\file\\f\\j");
        CreateFile createFile=new CreateFile();
        createFile.createfile();
        DeleteFile deleteFile=new DeleteFile();
      //  deleteFile.deletefile(file1);
       // deleteFile.deletepath("F:\\file\\f\\j");
    }
}

package com.zzx.javaio.byte_type;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * Created by:  Vivian
 * Date: 2018/7/31 16:45
 */
public class Fileoutputstream {
    public void fileoutputstream(byte[] arr,String path) throws IOException {
        FileOutputStream fileOutputStream=new FileOutputStream(path);
        fileOutputStream.write(arr);
        if(fileOutputStream!=null){
            try {
                fileOutputStream.close();
            }catch (Exception e){
                System.out.println("写入失败！");
            }
        }
    }
}

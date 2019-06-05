package com.zzx.javaio.byte_type;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * Created by:  Vivian
 * Date: 2018/7/31 16:45
 */
public class Fileinputstreams {
    public byte[] fileinpustream(String oldpath) throws IOException {
        FileInputStream fileinputstream=new FileInputStream(oldpath);
        int size=fileinputstream.available();
        byte[] arr=new byte[size];
        fileinputstream.read(arr);

        if(arr!=null){
          try {
              fileinputstream.close();
          }catch (Exception e){
              System.out.println("读取失败！");
          }
        }
        return arr;
    }
}

package com.zzx.javaio.charactor_type;

import javax.xml.crypto.Data;
import java.io.*;

/**
 * Created with IntelliJ IDEA.
 * Created by:  Vivian
 * Date: 2018/7/31 18:43
 */
public class Filereader {
    public String filereader(String path) throws IOException {
        String str = "";
        try {
            //创建文件输入字符流
            FileReader filereader = new FileReader(path);
            while (true) {
                char c = 0;
                c = (char) filereader.read();
                if(c==65535){
                    break;
                }
                str=str+c;

            }
        } catch (Exception e) {

        }
        System.out.println(str);
        return str;
    }
}

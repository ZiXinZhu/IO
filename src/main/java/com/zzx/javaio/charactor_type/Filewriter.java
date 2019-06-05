package com.zzx.javaio.charactor_type;

import java.io.FileWriter;
import java.io.IOException;


public class Filewriter {
    public void filewriter(String newpath, String str) throws IOException {

        try {
            FileWriter writer = new FileWriter(newpath, false);//追加方式的写入，否则会覆盖文件前面的内容
            writer.write(str);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

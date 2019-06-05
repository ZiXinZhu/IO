package com.zzx.javaio.charactor_type;

import java.io.*;

/**
 * Created by Mr.John on 2018/12/18 17:19.
 **/
public class NewFile {
    public static void main(String[] args) throws IOException {

        //TODO 使用BufferedReader和BufferedWriter读取文件
        BufferedReader bf = new BufferedReader(new FileReader("F:\\perduce.txt"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("F:\\fil\\fi.txt" ));
        String strs = "";
        while (true) {
            String str = bf.readLine();
            if (str == null) break;
            strs = strs + str;
        }
        bf.close();

        bufferedWriter.write(strs);
        bufferedWriter.close();

        //TODO 使用BufferedInputStream和BufferedOutputStream读取文件
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("F:\\perduce.txt"));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("F:\\fil\\ZX.txt"));
        int length = bufferedInputStream.available();
        byte[] b = new byte[length];
        //缓冲区的内容读到数组
        bufferedInputStream.read(b);
        //缓冲区的内容写入到文件
        bufferedOutputStream.write(b);
        bufferedOutputStream.flush();

        byte[] by=new byte[]{1,5,3,7,6,9,8,2,4,0};
        BufferedOutputStream outputStream=new BufferedOutputStream(new FileOutputStream("F:\\fil\\LV.txt"));
        outputStream.write(by);
        outputStream.flush();
    }
}

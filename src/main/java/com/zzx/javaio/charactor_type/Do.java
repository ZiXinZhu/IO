package com.zzx.javaio.charactor_type;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * Created by:  Vivian
 * Date: 2018/7/31 20:31
 */
public class Do {
    public static void main(String[] args) throws IOException {
        Filereader filereader = new Filereader();
        Filewriter filewriter = new Filewriter();
        filewriter.filewriter("F:\\file\\2.txt", filereader.filereader("F:\\zzx\\1.txt"));


    }
}

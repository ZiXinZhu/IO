package com.zzx.javaio.byte_type;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * Created by:  Vivian
 * Date: 2018/7/31 17:01
 */
public class Do {
    public static void main(String[] args) throws IOException {
        Fileinputstreams fileinputstreams =new Fileinputstreams();
        Fileoutputstream fileoutputstream=new Fileoutputstream();
        fileoutputstream.fileoutputstream(fileinputstreams.fileinpustream("F:\\zzx\\1.avi"),"F:\\file\\1.avi");
    }
}

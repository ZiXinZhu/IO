package com.zzx.javaio.dofile;

import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * Created by:  Vivian
 * Date: 2018/7/31 22:28
 */
public class DeleteFile {
    //判断是否为路径的正则表达式
    private static String matches = "[A-Za-z]:\\\\[^:?\"><*]*";

    /**
     *  删除文件或者目录
     * @param file
     */
    public void deletefile(File file) {
        File[] files = file.listFiles();
        for (File f:files
             ) {
                f.delete();
        }
    }
    public void deletepath(String  path) {
        if(path.matches(matches)){
            File file=new File(path);
            File[] files = file.listFiles();
            if(files!=null) {
                for (File f : files
                        ) {
                    f.delete();
                }
            }
        }

    }


}

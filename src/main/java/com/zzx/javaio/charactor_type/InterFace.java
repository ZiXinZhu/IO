package com.zzx.javaio.charactor_type;

import java.io.*;

/**
 * Created by Mr.John on 2018/12/18 14:11.
 **/
public class InterFace {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new FileReader("F:\\perduce.txt"));
        String string = buffer.readLine();
        Productor productor = new Productor();
        productor.name = string.substring(0, string.indexOf(","));
        string = string.substring(string.indexOf(",") + 1);
        productor.price = Integer.parseInt(string.substring(0, string.indexOf(",")));
        string = string.substring(string.indexOf(",") + 1);
        productor.type = string.substring(0, string.indexOf(","));
        string = string.substring(string.indexOf(",") + 1);
        productor.number = Integer.parseInt(string);
        string = buffer.readLine();
        Productor productor_x = new Productor();
        productor_x.name = string.substring(0, string.indexOf(","));
        string = string.substring(string.indexOf(",") + 1);
        productor_x.price = Integer.parseInt(string.substring(0, string.indexOf(",")));
        string = string.substring(string.indexOf(",") + 1);
        productor_x.type = string.substring(0, string.indexOf(","));
        string = string.substring(string.indexOf(",") + 1);
        productor_x.number = Integer.parseInt(string);
        System.out.println(productor.name);
        System.out.println(productor.price);
        System.out.println(productor.type);
        System.out.println(productor.number);
    }


}

class Productor {
    String name;
    int price;
    String type;
    int number;
}
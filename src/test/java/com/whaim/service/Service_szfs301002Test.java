package com.whaim.service;

import com.whaim.datagram.DataParser;
import org.junit.Test;

import java.io.FileReader;

/**
 * Created by 王海明 on 2017/6/29.
 */
public class Service_szfs301002Test {
    @Test
    public void process() throws Exception {


        DataParser parser=  new DataParser();

        FileReader fr= new FileReader("E:\\git\\Center\\src\\main\\resources\\xml\\sample.xml");
        char[] buffer=new char[2048];
        fr.read(buffer);


    }

}
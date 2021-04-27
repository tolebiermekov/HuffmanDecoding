package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Encoder {
    public static MyDict readCode(String name) throws FileNotFoundException {
        File myObj = new File(name);
        Scanner myReader = new Scanner(myObj);

        String s = myReader.nextLine();

        String[] arr = s.split(Character.toString((char)2));
        MyDict mmm = new MyDict();
        for(String x : arr) {
            mmm.add(new DictNode(x.split(Character.toString((char)1))[0].charAt(0), x.split(Character.toString((char)1))[1]));
        }
        return mmm;
    }

    public static String readDecodedText(String name) throws FileNotFoundException {
        return new Scanner(new File(name)).nextLine();
    }

    public static String encodedTextToText(MyDict dict, String encoded) {
        for(DictNode x : dict.getTemp()) {
            System.out.println(x.getA() + " - " + x.getCode());
        }
        String temp = "", text = "";
        for(char x : encoded.toCharArray()) {
            temp += x;
            if(dict.findByCode(temp) != 1) {
                text += dict.findByCode(temp);
                temp = "";
            }
        }
        return text;
    }
}

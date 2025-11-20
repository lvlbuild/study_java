package org.example.spider;

import java.util.regex.Pattern;

public class SpiderDemo5 {
    public static void main(String[] args) {
        String str ="我要做一只笑笑笑鸟鸟鸟鸟";
        Pattern p= Pattern.compile("(.)\\1+");
        String res=str.replaceAll("(.)\\1+","$1");
        System.out.println(res);
    }
}

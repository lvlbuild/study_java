package org.example.spider;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SpiderDemo1 {
        /**
     * 主函数，用于演示正则表达式匹配功能
     * 该函数使用正则表达式查找字符串中符合特定模式的子串并输出
     *
     * @param args 命令行参数数组
     */
    public static void main(String[] args) {
        // 定义待匹配的字符串
        String string = "java123javajava456java789java0abcejavafghijkjava";

        // 编译正则表达式模式：匹配"java"后跟0-2位数字的字符串
        Pattern p = Pattern.compile("java\\d{0,2}");

        // 创建匹配器对象
        Matcher m = p.matcher(string);

        // 查找并输出所有匹配的子串,贪婪匹配，匹配尽可能长的字符串
        while (m.find()){
            String s=m.group();
            System.out.println(s);
        }

    }


    public static void method(String string) {

    }
}

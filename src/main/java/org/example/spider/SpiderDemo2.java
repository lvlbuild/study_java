package org.example.spider;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SpiderDemo2 {
        /**
     * 主函数，用于演示不同正则表达式模式的匹配效果
     * @param args 命令行参数数组
     */
    public static void main(String[] args) {
        // 定义三种不同的正则表达式模式
        // regex1: 正向先行断言，匹配后面跟着12或4的java
        // regex2: 普通分组匹配，匹配java12或java4
        // regex3: 非捕获分组匹配，匹配java12或java4但不保存分组信息
        String regex1="((?i)JAva)(?=12|4)";
        String regex2="java(12|4)";
        String regex3="java(?:12|4)";
        //加个?好就是非贪婪爬取
        String regex4="ab+";

        // 定义待匹配的字符串
        String string =
                "java123javaabbbbbbbbjava456java789java0abcejavafghijkjava";

        // 编译正则表达式模式（注意：此处代码不完整，缺少具体的regex参数）
        Pattern p = Pattern.compile(regex4);

        // 创建匹配器并执行匹配操作
        Matcher m=p.matcher(string);
        while (m.find()){
            // 获取匹配到的字符串并输出
            String s=m.group();
            System.out.println(s);
        }
    }

}

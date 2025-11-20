package org.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo1 {
    /**
     * 主函数，用于解析日期字符串并输出时间戳
     * @param args 命令行参数数组
     * @throws ParseException 当日期解析失败时抛出此异常
     */
    public static void main(String[] args) throws ParseException {
        // 定义日期字符串
        String str="2023-11-11 11:11:11";
        // 创建日期格式化对象，指定日期格式为 yyyy-MM-dd HH:mm:ss
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // 将日期字符串解析为Date对象
        Date date=sdf.parse(str);
        // 输出日期对应的时间戳（毫秒数）
        System.out.println(date.getTime());


    }


    /**
     * 演示SimpleDateFormat类的使用方法
     * 通过不同的日期格式模式来格式化日期对象，并输出结果
     * 无参数
     * 无返回值
     */
    private static void method() {
        // 使用默认构造函数创建SimpleDateFormat对象，并格式化日期
        SimpleDateFormat sdf1=new SimpleDateFormat();
        Date d1=new Date(0L);
        String str1=sdf1.format(d1);
        System.out.println(str1);

        // 使用指定格式"yyyy年MM月dd日 HH:mm:ss"创建SimpleDateFormat对象，并格式化日期
        SimpleDateFormat sdf2=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String str2= sdf2.format(d1);
        System.out.println(str2);

        // 使用指定格式"yyyy年MM月dd日 HH:mm:ss EE"创建SimpleDateFormat对象，并格式化日期
        SimpleDateFormat sdf3=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss EE");
        String str3= sdf3.format(d1);
        System.out.println(str3);
    }

}

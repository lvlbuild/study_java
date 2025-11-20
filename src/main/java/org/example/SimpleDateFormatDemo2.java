package org.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo2 {
    /**
     * 主函数，用于演示日期格式转换功能
     * 将字符串格式的日期从"yyyy-MM-dd"转换为"yyyy年MM月dd日"格式并输出
     *
     * @param args 命令行参数数组
     * @throws ParseException 当日期解析失败时抛出此异常
     */
    public static void main(String[] args) throws ParseException {
        String str="2000-11-11";

        // 创建日期解析器，指定输入日期格式为yyyy-MM-dd
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd");
        Date date=sdf.parse(str);

        // 创建日期格式化器，指定输出日期格式为yyyy年MM月dd日
        SimpleDateFormat sdf1=new SimpleDateFormat("yyyy年MM月dd日");
        String res=sdf1.format(date);
        System.out.println(res);

    }

}

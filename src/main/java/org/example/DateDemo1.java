package org.example;

import java.util.Date;

public class DateDemo1 {
          /**
      * 主函数，用于演示Date类的基本使用方法
      * @param args 命令行参数数组
      */
     public static void main(String[] args) {
          // 创建当前时间的Date对象并输出
          Date d1 =new Date();
          System.out.println(d1);

          // 创建指定时间戳的Date对象并输出（时间戳为0，表示1970年1月1日）
          Date d2=new Date(0L);
          System.out.println(d2);

          // 设置Date对象的时间戳为1000毫秒并输出
          d2.setTime(1000L);
          System.out.println(d2);

          // 获取Date对象的时间戳并输出
          long time = d2.getTime();
          System.out.println(time);
     }

}

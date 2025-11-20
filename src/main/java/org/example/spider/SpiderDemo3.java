package org.example.spider;

public class SpiderDemo3 {
        /**
     * 主函数，演示字符串正则表达式替换和分割操作
     * 该函数使用正则表达式处理包含中文和英文字符的字符串，
     * 展示了replaceAll和split方法的使用效果
     *
     * @param args 命令行参数数组
     */
    public static void main(String[] args) {
        String s="鹰asdfghjklasdfg虎hjklasdfghjkl龙";
        // 使用正则表达式将连续的字母数字字符替换为"vs"
        String res=s.replaceAll("[\\w&&[^_]]+","vs");
        System.out.println(res);

        // 按照连续的字母数字字符进行分割，获取分割后的字符串数组
        String[] arr=s.split("[\\w&&[^_]]+");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}

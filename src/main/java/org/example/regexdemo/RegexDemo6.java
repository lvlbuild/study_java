package org.example.regexdemo;

/**
 * @author 32032
 */
public class RegexDemo6 {
        /**
     * 主函数，用于测试正则表达式匹配功能
     * 该函数演示了使用正则表达式进行字符串匹配的操作
     *
     * @param args 命令行参数数组
     */
    public static void main(String[] args) {
        // 定义正则表达式，匹配以"a"开头，后跟不区分大小写的"b"，再跟"cd"结尾的字符串
        String regex="a((?i)b)cd";

        // 测试不同的字符串是否匹配正则表达式
        System.out.println("aBcd".matches(regex));
        System.out.println("aBCD".matches(regex));
        System.out.println("aBcD".matches(regex));
    }

}

package org.example.regexdemo;

public class Demo1 {
        /**
     * 主函数，用于演示Java正则表达式匹配功能
     * 通过一系列的字符串匹配测试，展示不同正则表达式的匹配规则
     * @param args 命令行参数数组
     */
    public static void main(String[] args) {
        // 测试单个字符是否在指定字符集合中
        System.out.println("a".matches("[abc]"));

        // 测试两个字符的组合匹配，第一个字符在a-c范围内，第二个字符为c或d
        System.out.println("cd".matches("[a-c][cd]"));

        // 测试字符c是否不在包含d的字符集合中（即是否不等于d）
        System.out.println("c".matches("[^d]"));

        // 测试两个字符的组合是否都不在各自排除的字符集合中
        System.out.println("cx".matches("[^c][^x]"));

        // 测试字符a是否在a-z范围内但排除b和c字符的集合中
        System.out.println("a".matches("[a-z&&[^bc]]"));
    }

}

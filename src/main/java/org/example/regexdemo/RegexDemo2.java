package org.example.regexdemo;

/**
 * @author 32032
 */
public class RegexDemo2 {
    /**
     * 主函数，用于演示Java正则表达式匹配功能
     * 该函数通过一系列的正则表达式匹配测试，展示不同模式匹配的效果
     * @param args 命令行参数数组
     */
    public static void main(String[] args) {
        // 测试单个字符匹配
        System.out.println("吕".matches("."));
        // 测试数字字符匹配
        System.out.println("8".matches("\\d"));
        // 测试非数字字符匹配
        System.out.println("8".matches("\\D"));
        // 测试单词字符匹配（字母、数字、下划线）
        System.out.println("8".matches("\\w"));
        // 测试指定长度的字母数字组合匹配
        System.out.println("23df".matches("[a-zA-Z0-9]{5}"));
        // 测试排除下划线的单词字符匹配，限定4个字符
        System.out.println("23df".matches("[\\w&&[^_]]{4}"));
        // 测试排除下划线的单词字符匹配，长度在4-20个字符之间
        System.out.println("23df".matches("[\\w&&[^_]]{4,20}"));

    }

}

package org.example.spider;

import java.util.regex.Pattern;

/**
 * @author 32032
 */
public class SpiderDemo4 {


    // 匹配首尾字符相同，中间有任意字符的字符串
    private static final String REGEX_1_STR = "(.).+\\1";
    private static final Pattern REGEX_1 = Pattern.compile(REGEX_1_STR);

    // 匹配首尾都有相同字符组，中间有任意字符的字符串
    private static final String REGEX_2_STR = "(.+).+\\1";
    private static final Pattern REGEX_2 = Pattern.compile(REGEX_2_STR);

    // 匹配由重复字符组成的前缀和后缀，中间有任意字符的字符串
    private static final String REGEX_3_STR = "((.)\\2*).+\\1";
    private static final Pattern REGEX_3 = Pattern.compile(REGEX_3_STR);

    /**
     * 主函数，用于测试不同的正则表达式模式匹配效果
     * 该函数演示了三个不同的正则表达式模式，并测试它们对不同字符串的匹配结果
     *
     * @param args 命令行参数数组
     */
    public static void main(String[] args) {
        testRegex(REGEX_1, "regex1", new String[]{"abbba", "abbb", "abbbaaa"});
        testRegex(REGEX_2, "regex2", new String[]{"abbba", "abbb", "abbbbba"});
        testRegex(REGEX_3, "regex3", new String[]{"aaabbbaaa", "abbb", "aaabbbaaa"});
    }

    /**
     * 统一执行正则匹配测试的方法
     *
     * @param pattern 正则表达式 Pattern 实例
     * @param label   标签名，用于标识当前测试项
     * @param inputs  待测试的输入字符串数组
     */
    private static void testRegex(Pattern pattern, String label, String[] inputs) {
        for (String input : inputs) {
            boolean result = input != null && pattern.matcher(input).matches();
            System.out.printf("%s: \"%s\" => %b%n", label, input, result);
        }
    }
}




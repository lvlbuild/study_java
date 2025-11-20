package org.example.regexdemo;

public class RegexDemo4 {
    private static final String USER_REGEX="\\w{4,16}";
    /**
     * 主函数，用于测试用户正则表达式匹配功能
     * 该函数通过多个测试用例验证USER_REGEX正则表达式的匹配规则
     * @param args 命令行参数数组
     */
    public static void main(String[] args) {
        // 测试用户名匹配规则：纯字母"MAN"是否符合规则
        System.out.println("MAN".matches(USER_REGEX));
        // 测试用户名匹配规则：字母加数字"MAN123"是否符合规则
        System.out.println("MAN123".matches(USER_REGEX));
        // 测试用户名匹配规则：字母加下划线"MAN____"是否符合规则
        System.out.println("MAN____".matches(USER_REGEX));
        // 测试用户名匹配规则：混合格式"MANmaa33___"是否符合规则
        System.out.println("MANmaa33___".matches(USER_REGEX));
    }

}

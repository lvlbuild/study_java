package org.example.regexdemo;

public class RegexDemo5 {
    private static String ID_REGEX = "[1-9]\\d{16}(\\d|X|x)";

    //    private static String ID_REGEX="[1-9]\\d{16}[\\dXx]";
    private static String ID_REGEX_STRICT =
            "^[1-9]\\d{5}(?:19|20)\\d{2}(?:0\\d|10|11|12)(?:0[1-9]|[1-2]\\d|30|31)\\d{3}[\\dXx]$";

    /**
     * 主函数，程序入口点
     * 用于测试身份证号码格式匹配功能
     *
     * @param args 命令行参数数组
     */
    public static void main(String[] args) {
        // 测试指定的身份证号码是否符合正则表达式规则
        System.out.println("511323200807271866".matches(ID_REGEX));
        System.out.println("511323200807271866".matches(ID_REGEX_STRICT));
        System.out.println("511323200807271866".matches(ID_REGEX_STRICT));

        // 定义严格的身份证号码正则表达式规则
        String regex1 =
                "^[1-9]\\d{5}(?:18|19|20)\\d{2}(?:0[1-9]|10|11|12)(?:0[1-9]|[1-2]\\d|30|31)\\d{3}[\\dXx]$";
    }


}

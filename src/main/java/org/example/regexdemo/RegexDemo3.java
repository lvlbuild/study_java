package org.example.regexdemo;

public class RegexDemo3 {
    /**
     * 主函数，用于测试手机号码正则表达式匹配功能
     * 该函数通过多个测试用例验证手机号码和固定电话号码格式是否符合规范
     * 手机号码规则：以1开头，第二位为3-9之间的数字，后面跟9位数字，共11位
     * 固定电话规则：以0开头，2-3位区号后可选连字符，再跟5-10位号码
     *
     * @param args 命令行参数数组
     */
    public static void main(String[] args) {
        String regex0 = "^1[3-9]\\d{9}$";
        // 测试手机号码格式匹配
        System.out.println("15208174472".matches(regex0));
        System.out.println("1508174472rwt".matches(regex0));
        System.out.println("1508174472625".matches(regex0));

        String regex1 = "^0\\d{2,3}-?\\d{5,10}$";
        // 测试固定电话号码格式匹配
        System.out.println("0150-8174472".matches(regex1));
        System.out.println("01508174".matches(regex1));
        System.out.println("015-25".matches(regex1));

        String regex3 = "^\\w+@[\\w&&[^_]]{2,6}(\\.[a-zA-Z]{2,3}){1,2}$";
        System.out.println("3203287759@qq.com".matches(regex3));
        System.out.println("    32759@qq.commmm".matches(regex3));
        System.out.println("3203287759q.com".matches(regex3));

        String regex4="^(?:[01]\\d|2[0-3]):[0-5]\\d:[0-5]\\d$";
        System.out.println("21:22:21".matches(regex4));

    }


}
package org.example.regexdemo;

public class EmailValidator {

    // 最推荐：准确率最高、误伤最低、性能好
    private static final String EMAIL_REGEX =
            "^[a-zA-Z0-9_+.-]+@([a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,}$";

    // 或者你常见到的另一种等价写法
    // private static final String EMAIL_REGEX = "^\\w+([.-]?\\w+)*@\\w+([.-]?\\w+)*(\\.\\w{2,})+$";

    public static boolean isEmail(String email) {
        if (email == null) {
            return false;
        }
        return email.matches(EMAIL_REGEX);
    }

    public static void main(String[] args) {
        String[] valid = {
                "abc@163.com",
                "123@qq.com",
                "a.b_c+123@sub.domain.co.uk",
                "user@company.io",
                // 支持中文域名（punycoded）
                "test123@xn--fiqs8s.cn",
                "admin@gmail.com.cn",
                // 新顶级域名 .top .xyz 等都支持
                "12345@top"
        };

        String[] invalid = {
                // 没有@
                "abc",
                "abc@",
                "@163.com",
                // 没有点
                "abc@163",
                // 点后面没内容
                "abc@163.",
                // 两个@
                "abc@@163.com",
                // 空格
                "abc 123@163.com",
                // 用户名含中文（绝大部分邮箱不支持）
                "中文@163.com",
                // 顶级域名含中文（需punycode）
                "abc@163.com.中国"
        };

        for (String s : valid) {
            System.out.println(s + " → " + isEmail(s));
        }
        System.out.println("-------------------");
        for (String s : invalid) {
            System.out.println(s + " → " + isEmail(s));
        }
    }
}
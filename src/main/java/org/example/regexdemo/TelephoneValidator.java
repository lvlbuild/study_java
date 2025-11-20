package org.example.regexdemo;

public class TelephoneValidator {

    // 最推荐：支持 010-12345678 或 01012345678 这种最常见格式
    private static final String TEL_REGEX = "^0\\d{2,3}-?\\d{7,8}$";

    // 支持分机号：010-87654321-1234 或 01087654321-1234
    private static final String TEL_WITH_EXT_REGEX = "^0\\d{2,3}-?\\d{7,8}(-\\d{1,6})?$";

    public static boolean isTelephone(String tel) {
        if (tel == null) {
            return false;
        }
        return tel.matches(TEL_REGEX);
        // 根据需求换成带分机的版本
    }

    public static void main(String[] args) {
        String[] valid = {
                "010-12345678", "01012345678",
                "0371-1234567", "03711234567",
                "0411-87654321", "0755-12345678",
                "010-1234567",
                // 7位老号码也支持
        };

        String[] invalid = {
                "110-12345678",
                // 区号不能是110、119、120等特殊号
                "010-12345",
                // 号码太短
                "0101234567890",
                // 太长
                "12345678",
                // 没有区号
                "010-12345678-1234567"
                // 分机号太长（如果没用带分机正则）
        };

        for (String s : valid) {
            System.out.println(s + " → " + isTelephone(s));
        }
        for (String s : invalid) {
            System.out.println(s + " → " + isTelephone(s));
        }
    }
}
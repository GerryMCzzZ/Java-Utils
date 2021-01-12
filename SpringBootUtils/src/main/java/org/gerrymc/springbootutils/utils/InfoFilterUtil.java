package org.gerrymc.springbootutils.utils;

/**
 * @author GerryMC
 * @Description 正则过滤常用信息工具类
 * @date 2021/1/4
 */
public class InfoFilterUtil {
    //匹配用户名
    public static boolean checkUserName(String username) {
        String regExp = "^[a-zA-Z0-9]{4,16}$";
        if(username.matches(regExp)) {
            return true;
        }else {
            return false;
        }
    }

    //匹配密码
    public static boolean checkPassword(String password) {
        String regExp = "^[a-zA-Z0-9@/#.+=]{4,16}$";
        if(password.matches(regExp)) {
            return true;
        }else {
            return false;
        }
    }

    //匹配姓名
    public static boolean checkName(String name) {
        String regExp = "^[\\u4E00-\\u9FA5]{2,6}$";
        if(name.matches(regExp)) {
            return true;
        }else {
            return false;
        }
    }

    //匹配手机号
    public static boolean checkPhone(String phone) {
        String regExp = "^[1]([3-9])[0-9]{9}$";
        if(phone.matches(regExp)) {
            return true;
        }else {
            return false;
        }
    }

    //匹配手机验证码
    public static boolean checkCaptcha(String code) {
        String regExp = "^[0-9]{6}$";
        if(code.matches(regExp)) {
            return true;
        }else {
            return false;
        }
    }

    //匹配身份证
    public static boolean checkIdCard(String s) {
        String regExp = "^[1-9]\\d{5}(18|19|20|(3\\d))\\d{2}((0[1-9])|(1[0-2]))(([0-2][1-9])|10|20|30|31)\\d{3}[0-9Xx]$";
        if(s.matches(regExp)) {
            return true;
        }else {
            return false;
        }
    }

    //匹配0-200字符
    public static boolean check0_200Char(String s) {
        String regExp = "^[\\u4E00-\\u9FA5A-Za-z0-9_]{0,200}$";
        if(s.matches(regExp)) {
            return true;
        }else {
            return false;
        }
    }

    //匹配1-200字符加()
    public static boolean check1_200Char1(String s) {
        String regExp = "^[\\u4E00-\\u9FA5A-Za-z0-9_()（）]{1,200}$";
        if(s.matches(regExp)) {
            return true;
        }else {
            return false;
        }
    }


    //匹配0-400字符
    public static boolean check400Char(String s) {
        String regExp = "^([\\s\\S]*){0,400}$";
        if(s.matches(regExp)) {
            return true;
        }else {
            return false;
        }
    }
}

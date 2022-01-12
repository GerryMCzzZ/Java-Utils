package org.gerrymc.javautils.utils;

/**
 * @author GerryMC
 * @Description 清除特殊字符工具类
 * @date 2021/1/4
 */
public class CleanSpeCharUtil {
    //清除空格符
    public static String cleanSpace(String str) {
        return str.replaceAll("\\s","");
    }

    //清除回车符
    public static String cleanEnter(String str) {
        return str.replaceAll("\n","");
    }

    //清楚换行符
    public static String cleanLinefeed(String str) {
        return str.replaceAll("\r","");
    }
}

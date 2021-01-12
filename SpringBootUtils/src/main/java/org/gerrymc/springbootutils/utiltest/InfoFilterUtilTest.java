package org.gerrymc.springbootutils.utiltest;

import com.aliyuncs.exceptions.ClientException;
import org.gerrymc.springbootutils.utils.InfoFilterUtil;

/**
 * @author GerryMC
 * @Description 正则过滤常用信息测试类
 * @date 2021/1/12
 */
public class InfoFilterUtilTest {

    public static void main(String[] args){
        //过滤手机号
        System.out.println("12345678910是不是手机号:"+InfoFilterUtil.checkPhone("12345678910"));
    }
}

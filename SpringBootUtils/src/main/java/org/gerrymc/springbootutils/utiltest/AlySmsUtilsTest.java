package org.gerrymc.springbootutils.utiltest;

import com.aliyuncs.exceptions.ClientException;
import org.gerrymc.springbootutils.utils.AlySmsUtils;

/**
 * @author GerryMC
 * @Description 阿里云短信服务测试
 * @date 2021/1/12
 */
public class AlySmsUtilsTest {

    //发送短信验证码
    public static void SmsCode() throws ClientException {
        //发送信息的手机号
        String telephone = "12345678910";
        //发送的验证码
        String code = "666666";
        //发送的短信模板（阿里云平台设置）
        String templateCode = "SMS_132695077";

        AlySmsUtils.sendSms(telephone, code, templateCode);
    }


    public static void main(String[] args) throws ClientException {
        SmsCode();
    }
}

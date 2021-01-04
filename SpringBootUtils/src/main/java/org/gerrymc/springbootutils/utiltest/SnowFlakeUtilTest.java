package org.gerrymc.springbootutils.utiltest;

import org.gerrymc.springbootutils.utils.SnowFlakeUtil;

/**
 * @author CXD
 * @Description 雪花id测试类
 * @date 2020/12/18
 */
public class SnowFlakeUtilTest {


    public static void getIds(int num) {
        //初始化雪花id类，参数机器ID，数据中心ID（用于分布式扩展）
        SnowFlakeUtil snowFlake = new SnowFlakeUtil(1, 1);
        for (int i = 0; i < num; i++) {
            System.out.println(snowFlake.nextId());
        }

    }

    public static void main(String[] args) {
        //批量生成100万个雪花id
        long startTime = System.currentTimeMillis();
        getIds(1000000);
        long endTime = System.currentTimeMillis();
        System.out.println((endTime - startTime) / 1000.000);
    }


}

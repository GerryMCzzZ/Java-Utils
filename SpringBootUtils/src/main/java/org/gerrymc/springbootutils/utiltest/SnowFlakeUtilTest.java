package org.gerrymc.springbootutils.utiltest;

import org.gerrymc.springbootutils.utils.SnowFlakeUtil;

/**
 * @author GerryMC
 * @Description 雪花id测试类
 * @date 2020/12/18
 */
public class SnowFlakeUtilTest {


    //单个实例生成多个id
    public static void getIdsByOne(int num) {
        //初始化雪花id类，参数机器ID，数据中心ID（用于分布式扩展）
        SnowFlakeUtil snowFlake = new SnowFlakeUtil(1, 1);
        for (int i = 0; i < num; i++) {
            System.out.println(snowFlake.nextId());
        }

    }

    //多个实例生成多个id
    public static void getIdsBySome(int num) {
        for (int i = 0; i < num; i++) {
            //内部单个实例生成id方法（由于使用连续new同一个实例，所以这种方式是会产生相同的id的。）
            System.out.println(SnowFlakeUtil.getSnowflakeId());
        }

    }

    public static void main(String[] args) {
        //批量生成100万个雪花id
        long startTime = System.currentTimeMillis();
        getIdsByOne(1000000);
        //getIdsBySome(1000000);
        long endTime = System.currentTimeMillis();
        System.out.println((endTime - startTime) / 1000.000);
    }


}

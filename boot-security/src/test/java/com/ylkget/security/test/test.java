package com.ylkget.security.test;

import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * <p>
 *
 * </p>
 *
 * @author joe 2021/3/20 11:16
 */
public class test {
    @Test
    void test1() {
        // 创建密码解析器
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

        // 对密码进行加密
        String joe = bCryptPasswordEncoder.encode("ssssss");

        System.out.println("ssssss = " + joe);

        // 判断原字符加密后和加密之前是否匹配
        boolean b = bCryptPasswordEncoder.matches("admin", joe);

        // 打印比较结果
        System.out.println("b = " + b);
    }
}

package com.ylkget.junit5.utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Instant;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("时间工具类测试")
class TimeUtilsTest {

    @Test
    void hello() {
        Instant now = Instant.now();
        String expect = "现在时间是：" + now.toString();
        assertEquals(expect, TimeUtils.hello(now));
    }
}
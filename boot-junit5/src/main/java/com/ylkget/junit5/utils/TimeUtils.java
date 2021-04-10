package com.ylkget.junit5.utils;

import org.junit.Test;

import java.time.Instant;

/**
 * <p>
 * TimeUtils
 * </p>
 *
 * @author joe 2021/3/26 08:26
 */
public class TimeUtils {
    public static String hello(Instant now) {
        return "现在时间是：" + now.toString();
    }
}

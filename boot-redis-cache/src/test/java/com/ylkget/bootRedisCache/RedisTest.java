package com.ylkget.bootRedisCache;

import com.ylkget.bootRedisCache.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.io.Serializable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

/**
 * @author joe 2021-02-07 13
 */
@Slf4j
public class RedisTest extends BootRedisCacheApplicationTests {
    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @Autowired
    RedisTemplate<String, Serializable> redisCacheTemplate;

    /**
     * 测试 Redis 操作
     * opsForValue：对应 String（字符串）
     * opsForZSet：对应 ZSet（有序集合）
     * opsForHash：对应 Hash（哈希）
     * opsForList：对应 List（列表）
     * opsForSet：对应 Set（集合）
     * opsForGeo：** 对应 GEO（地理位置）
     */
    @Test
    public void get() {
        // 测试线程安全，程序结束查看redis中count的值是否为1000
        ExecutorService executorService = Executors.newFixedThreadPool(1000);
        IntStream.range(0, 1000).forEach(i -> executorService.execute(() -> stringRedisTemplate.opsForValue().increment("count", 1)));

        stringRedisTemplate.opsForValue().set("k1", "v1");
        String k1 = stringRedisTemplate.opsForValue().get("k1");
        log.debug("【k1】= {}", k1);

        // 以下演示整合，具体Redis命令可以参考官方文档
        String key = "xkcoding:user:1";
        redisCacheTemplate.opsForValue().set(key, new User(1L, "user1"));
        // 对应 String（字符串）
        User user = (User) redisCacheTemplate.opsForValue().get(key);
        log.debug("【user】= {}", user);
    }
}

# spring-boot-session

> 此 demo 主要演示了 Spring Boot 如何通过 Spring Session 实现Session共享、重启程序Session不失效。

## pom.xml

## application.yml

```yaml
server:
  port: 8080
  servlet:
    context-path: /demo
spring:
  session:
    store-type: redis
    redis:
      flush-mode: immediate
      namespace: "spring:session"
  redis:
    host: localhost
    port: 6379
    # 连接超时时间（记得添加单位，Duration）
    timeout: 10000ms
    # Redis默认情况下有16个分片，这里配置具体使用的分片
    # database: 0
    lettuce:
      pool:
        # 连接池最大连接数（使用负值表示没有限制） 默认 8
        max-active: 8
        # 连接池最大阻塞等待时间（使用负值表示没有限制） 默认 -1
        max-wait: -1ms
        # 连接池中的最大空闲连接 默认 8
        max-idle: 8
        # 连接池中的最小空闲连接 默认 0
        min-idle: 0
```

## 测试

> 测试 重启程序，Session 不失效的场景

1. 打开浏览器，访问首页：http://localhost:8080/demo/page/index
2. 最开始未登录，所以会跳转到登录页：http://localhost:8080/demo/page/login?redirect=true 然后点击登录按钮
3. 登录之后，跳转回首页，此时可以看到首页显示token信息。
4. 重启程序。不关闭浏览器，直接刷新首页，此时不跳转到登录页。测试成功！

## 参考

- Spring Session 官方文档：https://docs.spring.io/spring-session/docs/current/reference/html5/guides/boot-redis.html#updating-dependencies
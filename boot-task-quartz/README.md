### [【Java定时任务解决方案】SpringBoot整合Quartz实现任务调度](https://www.bilibili.com/video/BV1PK4y1H7mD)

- 课程大纲
- 小顶堆
- 时间轮算法
  - 链表或数组实现时间轮
  - round型时间轮
    - 任务上记录一个round，遍历到了round-1，为0时取出执行
    - 需要遍历所有任务，效率较低
  - 分层时间轮
    - 使用多个不同时间维度的轮
      - 天轮
      - 月轮
    - 月轮到了，将任务取出放到天轮里面
- timer解析
- 定时任务线程池
  - leader-follow模式
- quartz使用
- jobDataMap使用
- job并发及持久化
- 触发器
- springBoot整合Quartz
- Quartz集群


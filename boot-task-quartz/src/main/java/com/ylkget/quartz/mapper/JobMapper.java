package com.ylkget.quartz.mapper;

import com.ylkget.quartz.entity.domain.JobAndTrigger;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * <p>
 * JobMapper$
 * </p>
 *
 * @author joe 2021-03-13 11:20
 */
@Component
public interface JobMapper {
    /**
     * 查询定时作业和触发器列表
     *
     * @return 定时作业和触发器列表
     */
    List<JobAndTrigger> list();
}

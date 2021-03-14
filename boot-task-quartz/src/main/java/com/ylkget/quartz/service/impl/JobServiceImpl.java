package com.ylkget.quartz.service.impl;

import com.github.pagehelper.PageInfo;
import com.ylkget.quartz.entity.domain.JobAndTrigger;
import com.ylkget.quartz.entity.form.JobForm;
import com.ylkget.quartz.mapper.JobMapper;
import com.ylkget.quartz.service.JobService;
import lombok.extern.slf4j.Slf4j;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *
 * </p>
 *
 * @author joe 2021/3/13 11:18
 */
@Service
@Slf4j
public class JobServiceImpl implements JobService {
    @Autowired
    private Scheduler scheduler;
    @Autowired
    private JobMapper jobMapper;

    @Override
    public void addJob(JobForm form) throws Exception {

    }

    @Override
    public void deleteJob(JobForm form) throws SchedulerException {

    }

    @Override
    public void pauseJob(JobForm form) throws SchedulerException {

    }

    @Override
    public void resumeJob(JobForm form) throws SchedulerException {

    }

    @Override
    public void cronJob(JobForm form) throws Exception {

    }

    @Override
    public PageInfo<JobAndTrigger> list(Integer currentPage, Integer pageSize) {
        return null;
    }
}

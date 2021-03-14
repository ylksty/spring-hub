package com.ylkget.quartz.controller;

import com.ylkget.quartz.service.JobService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * JobController
 * </p>
 *
 * @author joe 2021/3/13 11:04
 */
@RestController
@RequestMapping("/job")
@Slf4j
public class JobController {
    @Autowired
    private JobService jobService;
}

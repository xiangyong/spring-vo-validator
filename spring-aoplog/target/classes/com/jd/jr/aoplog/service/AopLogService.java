package com.jd.jr.aoplog.service;

import com.jd.jr.aoplog.springbean.AoplogBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created with IntelliJ IDEA.
 * User: yangkuan
 * Date: 15-4-12
 * Time: 下午9:14
 * To change this template use File | Settings | File Templates.
 */
public class AopLogService {

    private static final Logger logger = LoggerFactory.getLogger(AopLogService.class);
    @Autowired
    AoplogBean logTest;
    public void excute(){
              logger.info(logTest.getMethod());
    }
}

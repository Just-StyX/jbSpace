package org.example.introduction;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.util.Date;
import java.util.logging.Logger;

public class HelloJob implements Job {
    private static final Logger logger = Logger.getLogger(HelloJob.class.getName());

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        var instanceId = jobExecutionContext.getFireInstanceId();
        logger.info(instanceId + " : " + "Hello World - " + new Date());
    }
}

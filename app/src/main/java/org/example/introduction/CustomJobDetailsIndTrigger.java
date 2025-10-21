package org.example.introduction;

import org.quartz.JobDetail;
import org.quartz.Trigger;

import java.util.Date;

import static org.quartz.DateBuilder.evenMinuteDate;
import static org.quartz.JobBuilder.newJob;
import static org.quartz.TriggerBuilder.newTrigger;

public class CustomJobDetailsIndTrigger {
    public static JobDetail jobDetail(String job, String group) {
        return newJob(HelloJob.class)
                .withIdentity(job, group)
                .build();
    }

    public static Trigger trigger(String triggerName, String group) {
        return newTrigger()
                .withIdentity(triggerName, group)
                .startAt(evenMinuteDate(new Date()))
                .build();
    }
}

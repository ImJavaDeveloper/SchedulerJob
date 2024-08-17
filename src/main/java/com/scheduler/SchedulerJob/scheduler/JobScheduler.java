package com.scheduler.SchedulerJob.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class JobScheduler {

    @Scheduled(fixedRate = 10000)
    private void fetchLogsFromCloudWatch()
    {
        System.out.println("fetchLogsFromCloudWatch");
    }
}

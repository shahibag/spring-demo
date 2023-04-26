package com.shahibag.schedulingtasks.scheduledtask;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Description:
 *
 * @author : King
 * @version : v1.0
 * @since : 2023-04-26
 */
@Component
@Slf4j
public class ScheduledTasks {
    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        log.info("Current time is {}", DATE_FORMAT.format(new Date()));
    }

    @Scheduled(cron = "${schedules.reportTime}")
    public void reportTime() {
        log.info("The time is now {}", DATE_FORMAT.format(new Date()));
    }
}

package org.yqj.schedule.demo.scheduled.task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName ScheduledTask
 * @Description
 * @Author yaoqijun
 * @Date 2018/10/11 下午11:57
 */
@Component
@Slf4j
public class ScheduledTask {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime(){
        log.info("[FixedRate] The time is now {}", dateFormat.format(new Date()));
    }

    @Scheduled(cron = "*/10 * * * * *")
    public void reportTimeCron(){
        log.info("[ScheduledCron] The time is now {}", dateFormat.format(new Date()));
    }

}

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
        try {
            Thread.sleep(500);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        log.info("[FixedRate] The time is now {}", dateFormat.format(new Date()));
    }

    @Scheduled(cron = "*/10 * * * * *")
    public void reportTimeCron10(){
        try {
            Thread.sleep(500);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        log.info("[ScheduledCron] The time is now {}", dateFormat.format(new Date()));
    }

    @Scheduled(cron = "*/9 * * * * *")
    public void reportTimeCron9(){
        try {
            Thread.sleep(500);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        log.info("[ScheduledCron] The time is now {}", dateFormat.format(new Date()));
    }

    @Scheduled(cron = "*/8 * * * * *")
    public void reportTimeCron8(){
        try {
            Thread.sleep(500);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        log.info("[ScheduledCron] The time is now {}", dateFormat.format(new Date()));
    }

    @Scheduled(cron = "*/7 * * * * *")
    public void reportTimeCron7(){
        try {
            Thread.sleep(500);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        log.info("[ScheduledCron] The time is now {}", dateFormat.format(new Date()));
    }

    @Scheduled(cron = "*/6 * * * * *")
    public void reportTimeCron6(){
        try {
            Thread.sleep(500);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        log.info("[ScheduledCron] The time is now {}", dateFormat.format(new Date()));
    }

}

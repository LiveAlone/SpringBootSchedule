package org.yqj.schedule.demo.scheduled.jdk;

import lombok.extern.slf4j.Slf4j;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Description:
 *
 * @author yaoqijun
 * @date 2018/10/12
 * Email: qijunyao@xiaohongshu.com
 */
@Slf4j
public class ScheduledTest {

    private static final AtomicInteger count = new AtomicInteger(0);

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(2);
        scheduledExecutorService.scheduleWithFixedDelay(
                ()->{
                    int c = count.incrementAndGet();
                    log.info("current time is " + dateFormat.format(new Date()));
                    try {
                        Thread.sleep(4000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if (c == 5){
                        throw new RuntimeException("test runtime exception");
                    }
                }, 0, 2, TimeUnit.SECONDS);
    }
}

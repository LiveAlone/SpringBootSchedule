package org.yqj.schedule.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Description:
 *
 * @author yaoqijun
 * @date 2018/10/16
 * Email: qijunyao@xiaohongshu.com
 */
@Configuration
public class ScheduleConfiguration {

    @Bean
    public SchedulingConfigurer schedulingConfigurer(){
        return taskRegistrar -> {

            // 设置线程池数量

            ThreadPoolTaskScheduler taskScheduler = new ThreadPoolTaskScheduler();
            taskScheduler.setPoolSize(6);
            taskScheduler.initialize();
            taskRegistrar.setTaskScheduler(taskScheduler);

        };
    }

//    private static AtomicInteger atomicInteger = new AtomicInteger(0);
//
//    /**
//     * Spring Schedule 定时任务, 默认单线程执行方式， 执行 到时间任务
//     * 提供线程池方式， 并行 cron 任务执行方式
//     * @return
//     */
//    @Bean
//    public ScheduledExecutorService scheduledExecutorService(){
//        return new ScheduledThreadPoolExecutor(6,
//                r -> new Thread(r, "LocalScheduleExecutorThread " + atomicInteger.incrementAndGet()));
//    }

}

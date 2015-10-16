package com.jp.listener;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.jp.action.TimeConver;

public class DownLoadTaskListener implements ServletContextListener{

    private TimeConver timeConver = new TimeConver();
    private Timer timer = new Timer(); // 定时器实例化
    private int SCHEDULE_HOUR = 15; // 设置执行小时点
    private boolean isRunning = false;// 设置运行状态开关
    private String[] text = new String[] { "Andy", "Jimmy", "Rice", "Tim",
            "Harry", "Arvin" };// 测试用例
    private static int index = 0;// 测试用例数组索引
 
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
        timer.cancel();
        System.out.println("contextDestroyed....");
	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		// TODO Auto-generated method stub
        System.out.println("contextInitialized....");
        new TimerManager();
		
	}
    class DownLoadTimerTask extends TimerTask {
 
        @Override
        public void run() {
            // TODO Auto-generated method stub
            Calendar c = Calendar.getInstance();
            if (!isRunning) {
                if (SCHEDULE_HOUR == c.get(Calendar.HOUR_OF_DAY)) {
                    isRunning = true;
                    System.out.println("CurrentTime = "
                            + timeConver.getCurrentTime());
                    System.out.println("CurrentPatientId[" + index + "] = " + text[index]);
                    index++;
                    index = (index == text.length) ? 0 : index;
                    System.out.println("...................");
                    isRunning = false;
                }
            }
        }
 
    }
 
    class TimerManager {
        private static final long PERIOD_DAY = 1 * 60 * 1000; // 每隔1分执行一次
 
        public TimerManager() {
            DownLoadTimerTask task = new DownLoadTimerTask(); // 要执行的任务
            // 安排指定的任务在指定的时间开始进行重复的固定延迟执行。
            try {
                timer.schedule(task,
                        timeConver.turnDate("2014-03-03 13:59:10"), PERIOD_DAY);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
    }

}

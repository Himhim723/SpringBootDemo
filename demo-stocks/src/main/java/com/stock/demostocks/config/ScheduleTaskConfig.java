package com.stock.demostocks.config;

import java.time.LocalDateTime;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
public class ScheduleTaskConfig {

  private static int i;

  @Scheduled(fixedRate = 1000) //10sec  1000ms = 1s
  public void autoUpdate(){
    System.out.println("updated: "+i++ + ".");
  }


  @Scheduled(fixedDelay = 4000L)
  public void fixedDelay(){
    System.out.println("Delay");
  }

  @Scheduled(cron = "0/30 * 9-23 * * MON-FRI")
  public void fixedTimeTask(){
    System.out.println(LocalDateTime.now());
  }
}


// Redex 服務降級 要 Set Timer(失效時間) can by key
// Section 
// Token


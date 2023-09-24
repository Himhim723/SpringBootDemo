package com.example.demok.model;

import java.time.LocalDateTime;
import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@Getter
@Setter
public class Station {
  private int status;
  private String message;
  private String sys_time;
  private String curr_time;
  private Data data;
  private String isdelay;

  @Getter
  @Setter
  @NoArgsConstructor
  public static class Data{
    private EAL Eal;

    @Getter
    @Setter
    @NoArgsConstructor
    public static class EAL{
      private String curr_time;
      private String sys_time;
      private List<Move> UP;

      @Getter
      @Setter
      @NoArgsConstructor
      public static class Move{
        private String seq;
        private String dest;
        private String plat;
        private String time;
        private String ttnt;
        private String valid;
        private String source;
        private String route;
        private String timeType;

      }
    }
  }
}
package pro.edu;
/*
  @author   george
  @project   vsem4
  @class  MyThread
  @version  1.0.0 
  @since 12.04.2021 - 18.36
*/

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class MyThread extends Thread{
     private LocalDate date;

    public MyThread(LocalDate date) {
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public void run() {
        LocalDateTime start = LocalDateTime.now();
        System.out.println(this.getName() + " has been started at " + start);
        try {
            LogsService.getLogsCountByDate(this.getDate());
        } catch (IOException e) {
            e.printStackTrace();
        }
        LocalDateTime finish = LocalDateTime.now();
        System.out.println(this.getName() + " has been finished at " + finish);
        System.out.println(this.getName() + " DURATION is  " +
                ChronoUnit.MILLIS.between(start, finish));

    }

}

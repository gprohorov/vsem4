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
        System.out.println(this.getName() + " has been started");
        try {
            LogsService.getLogsCountByDate(this.getDate());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(this.getName() + " has been finished");
    }

}

package pro.edu;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
    /*    LocalDateTime start = LocalDateTime.now();
        String logs = new String(Files.readAllBytes(Paths.get("/home/george/Desktop/logs.txt")));
        final String[] lines = logs.split("\n");
        System.out.println(lines.length);

        int counter = 0;
        for (int i = 0; i < lines.length ; i++) {
            if (lines[i].contains("ERROR")) counter++;
        }
        System.out.println("ERRORS  - " + counter);


        LocalDateTime finish = LocalDateTime.now();

        System.out.println(ChronoUnit.MILLIS.between( start, finish));

        System.out.println("----------------------------------------------");
        start = LocalDateTime.now();


        System.out.println(Files.readAllLines(Paths.get("/home/george/Desktop/logs.txt"))
                .stream().filter(line -> line.contains("ERROR")).count());

        System.out.println(Files.lines(Paths.get("/home/george/Desktop/logs.txt"))
                .filter(line -> line.contains("ERROR")).count());
        

        finish = LocalDateTime.now();

        System.out.println(ChronoUnit.MILLIS.between( start, finish));
*/
        System.out.println(" ---------------------   Threads -----------------");


        LocalDateTime start = LocalDateTime.now();


         LocalDate date = LocalDate.of(2020, Month.FEBRUARY, 14);
/*

        for (int i = 0; i < 5; i++) {
            System.out.print(date.plusDays(i) + " - ");
            System.out.println(LogsService.getLogsCountByDate(date.plusDays(i)));
        }
*/

        LocalDateTime finish = LocalDateTime.now();
        start = LocalDateTime.now();
        System.out.println(ChronoUnit.MILLIS.between(start, finish) + " msec");

        for (int i = 0; i < 5; i++) {
            new MyThread(date.plusDays(i)).start();
        }

    }
}

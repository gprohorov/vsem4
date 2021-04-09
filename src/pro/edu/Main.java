package pro.edu;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        LocalDateTime start = LocalDateTime.now();
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
/*

        System.out.println(Files.readAllLines(Paths.get("/home/george/Desktop/logs.txt"))
                .stream().filter(line -> line.contains("ERROR")).count());
*/
        System.out.println(Files.lines(Paths.get("/home/george/Desktop/logs.txt"))
                .filter(line -> line.contains("ERROR")).count());
        

        finish = LocalDateTime.now();

        System.out.println(ChronoUnit.MILLIS.between( start, finish));


    }
}

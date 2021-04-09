package pro.edu;
/*
  @author   george
  @project   vsem4
  @class  LogsService
  @version  1.0.0 
  @since 09.04.2021 - 18.22
*/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class LogsService {
    private String file;

    public LogsService() {
    }

    public LogsService(String file) {
        this.file = file;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }
  // 2021-03-11
    public static List<String> logsByDate(String file, LocalDate date) throws IOException {
         String dateAsString = date.toString();
         List<String> list = Files.lines(Paths.get(file))
                 .filter(log -> log.contains(dateAsString))
                 .collect(Collectors.toList());

        return list;
    }


}

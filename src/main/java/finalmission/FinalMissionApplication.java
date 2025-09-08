package finalmission;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.retry.annotation.EnableRetry;

@SpringBootApplication
@EnableRetry
public class FinalMissionApplication {

    public static void main(String[] args) {
        SpringApplication.run(FinalMissionApplication.class, args);
    }
}

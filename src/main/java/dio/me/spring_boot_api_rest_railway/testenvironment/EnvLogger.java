package dio.me.spring_boot_api_rest_railway.testenvironment;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class EnvLogger implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) {
        System.out.println("DEBUG >> PGHOST = " + System.getenv("PGHOST"));
        System.out.println("DEBUG >> PGPORT = " + System.getenv("PGPORT"));
    }
}

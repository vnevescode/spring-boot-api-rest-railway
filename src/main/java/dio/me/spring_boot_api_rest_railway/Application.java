package dio.me.spring_boot_api_rest_railway;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	//private static final Logger log = LoggerFactory.getLogger(Application.class);


	public static void main(String[] args) {

		// Log Environment Variables BEFORE starting Spring context
		// log.info("DATABASE_URL: {}", System.getenv("DATABASE_URL"));
		// log.info("DATABASE PGHOST: {}", System.getenv("PGHOST"));
		// log.info("PGUSER: {}", System.getenv("PGUSER"));
		// log.info("PGPASSWORD: {}", System.getenv("PGPASSWORD"));
		// log.info("PGPORT: {}", System.getenv("PGPORT"));
		// log.info("PORT: {}", System.getenv("PORT"));


		SpringApplication.run(Application.class, args);
	}

}

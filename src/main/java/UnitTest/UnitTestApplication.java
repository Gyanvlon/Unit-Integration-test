package UnitTest;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UnitTestApplication  implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(UnitTestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("this is application on test");
	}
}

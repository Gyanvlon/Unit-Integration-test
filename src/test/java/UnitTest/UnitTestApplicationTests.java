package UnitTest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UnitTestApplicationTests {

	@Test
	void contextLoads() {
		BookTest bookTest = new BookTest();
		System.out.println("Here is testing"+ bookTest);
	}

}

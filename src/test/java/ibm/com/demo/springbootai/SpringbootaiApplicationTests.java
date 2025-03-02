package ibm.com.demo.springbootai;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

// Use test properties to avoid requiring real API keys
@SpringBootTest
@TestPropertySource(properties = {
		"spring.ai.openai.enabled=false"
})
class SpringbootaiApplicationTests {

	@Test
	void contextLoads() {
	}

}

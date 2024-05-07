package com.nagarro.DevOps;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.system.CapturedOutput;
import org.springframework.boot.test.system.OutputCaptureExtension;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.springframework.test.util.AssertionErrors.assertTrue;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class DevOpsApplicationTests {


	@Test
	void contextLoads(ApplicationContext context) {
		assertNotNull(context);
	}

	@Test
	void mainMethodRuns(CapturedOutput output) {
		DevOpsApplication.main(new String[] {});
		assertTrue("Output doesn't contain 'Working'", output.toString().contains("Working"));
	}
}

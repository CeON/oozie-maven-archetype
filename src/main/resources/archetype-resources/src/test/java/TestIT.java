package $package;

import java.io.File;
import java.io.IOException;
import static org.junit.Assert.assertTrue;
import org.junit.*;
import pl.edu.icm.oozierunner.OozieRunner;

public class TestIT {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws IOException {
		OozieRunner or = new OozieRunner();
		File workflowOutputData = or.run();

		assertTrue(workflowOutputData.exists());
		assertTrue(workflowOutputData.isDirectory());
		assertTrue(workflowOutputData.listFiles().length > 0);

		// check if data in workflowOutputData directory is correct
	}
}

package exc4;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AAAPatternTest {
	AAAPattern obj;

	@BeforeEach
	void setUp() throws Exception {
		obj= new AAAPattern();
	}
	
	@AfterEach
	void teardown() {
		obj=null;
	}
	
	@Test
	void testcase1(){
		assertEquals(4, obj.add(2,2));
	}

	@Test
	void testcase2() {
		assertFalse(obj.add(2,1)==5);
	}

}

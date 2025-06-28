package exc1mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class MyServiceTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	public void testExternalApi() {
		 ExternalApi mockApi = Mockito.mock(ExternalApi.class);
		 when(mockApi.getData()).thenReturn("Mock Data");
		 MyService service = new MyService(mockApi);
		 String result = service.fetchData();
		 assertEquals("Mock Data", result);
		 }

}

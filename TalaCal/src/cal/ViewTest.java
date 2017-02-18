package cal;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class ViewTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void test() {
		View V=new View();
		V.setResult(10+"");
		double r= V.getResult();
		assertTrue(r==10);
	}

}

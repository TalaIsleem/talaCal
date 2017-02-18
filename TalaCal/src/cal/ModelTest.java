package cal;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class ModelTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void test() {
		Model m=new Model();
		m.calculate(99,99,'-');
		double result=m.get_Result();
		assertTrue(result==0);
		m.calculate(99,99,'/');
		 result=m.get_Result();
		assertTrue(result==1);
		m.calculate(99,99,'*');
		 result=m.get_Result();
		assertTrue(result==9801);
		m.calculate(99,99,'+');
		 result=m.get_Result();
		assertTrue(result==198);
		m.calculate(100,3,'%');
		 result=m.get_Result();
		assertTrue(result==1);
		m.calculate(99,2,'^');
		 result=m.get_Result();
		assertTrue(result==
				9801);
	}

}

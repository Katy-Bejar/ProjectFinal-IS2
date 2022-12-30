package onlinebookstore;

import java.io.IOException;
import static org.junit.Assert.assertTrue;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.TestCase;

public class JUnitViewBookServlet{
	private static JUnitViewBookServlet test;
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Antes de todas");
		test = new JUnitViewBookServlet();
	}
	
	@Before
	public void before() {
		System.out.println("Antes de cada una");
	}
	
	@Test
	public void serviceTest() {
		System.out.println("La Prueba");
		Object res;
		Object req;
		assertTrue("Assert", test);
	}
	
}
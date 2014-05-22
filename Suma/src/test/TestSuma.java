package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import codigo.Suma;

public class TestSuma {
	Suma s=new Suma();

	@Before
	public void setUp() throws Exception {
		s.setA(5);
		s.setB(10);
	}

	@Test
	public void test() {
		assertEquals("Testado del metodo suma",15,s.sumar());
	}

}

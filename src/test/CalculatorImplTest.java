package test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import main.CalculatorImpl;

class CalculatorImplTest {


	/*@Test
	void testMultiply() {
		fail("Not yet implemented");
	}*/
	
	

	@Test
	void testAdd() {
		CalculatorImpl c=new CalculatorImpl();
		int a, b, res;
		a=5;
		b=5;
		res=a+b;
		assertTrue("a et b positifs",c.add(a, b)==res);
		
		a=0;
		b=5;
		res=a+b;
		assertTrue("a est null",c.add(a, b)==res);

		
		a=5;
		b=0;
		res=a+b;
		/*if(c.add(a, b)!=res) {
			fail("b est null");
		}*/
		
		assertTrue("b est null",c.add(a, b)==res);

		
		a=0;
		b=0;
		res=a+b;
		/*if(c.add(a, b)!=res) {
			fail("a est b sont null");
		}*/
		assertTrue("a et b nulls",c.add(a, b)==res);
		
		a=-5;
		b=5;
		res=a+b;
		/*if(c.add(a, b)!=res) {
			fail("a est negatif");
		}*/
		
		assertTrue("a est negatif",c.add(a, b)==res);
		
		a=5;
		b=-5;
		res=a+b;
		/*if(c.add(a, b)!=res) {
			fail("b est negatif");
		}*/
		
		assertTrue("b est negatif",c.add(a, b)==res);

		
		a=-5;
		b=-5;
		res=a+b;
		/*if(c.add(a, b)!=res) {
			fail("a et b sont negatif");
		}*/
		
		assertTrue("a et b sont negatifs",c.add(a, b)==res);
		
	}

	/*@Test
	void testSubstract() {
		fail("Not yet implemented");
	}*/

}

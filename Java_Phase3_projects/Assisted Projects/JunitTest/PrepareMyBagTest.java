package JunitTest;

import static org.junit.Assert.*;


import org.junit.Test;

public class PrepareMyBagTest {
	FirstDayAtSchool school=new FirstDayAtSchool();
	String bag1[]={"Books","Notebooks","Pens"};
	

	@Test
	public void testPrepareMyBag() {
		System.out.println("Inside testPrepareMyBag");
		assertArrayEquals(bag1,school.prepareMyBag());
	}
	
}
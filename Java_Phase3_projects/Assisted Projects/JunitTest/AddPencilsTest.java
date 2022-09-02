package JunitTest;

import static org.junit.Assert.*;


import org.junit.Test;

public class AddPencilsTest {
	FirstDayAtSchool school=new FirstDayAtSchool();
	
	String bag2[]={"Books","Notebooks","Pens","Pencil"};

	
	@Test
	public void testAddPencils(){
		System.out.println("Inside testAddPencils");
		assertArrayEquals(bag2,school.addPencils());
	}

}
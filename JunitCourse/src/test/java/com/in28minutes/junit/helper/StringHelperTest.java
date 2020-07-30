package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest {

	StringHelper helper = new StringHelper();
	@Test
	public void truncateAInFirst2Positions_Ainfirst2Position() {
		
		////AACD ==>CD ACD ==>CD CDEE CDAA ==>CDAA
		assertEquals("CD",helper.truncateAInFirst2Positions("AACD"));
	}

	@Test
	public void testtruncateAInFirst2Positions_AinFirstPosition() {

		assertEquals("CD",helper.truncateAInFirst2Positions("ACD"));
	}
	
	//ABCD==>false, ABCD ==>true, AB ==> true, A==> false
	@Test
	public void testareFirstAndLastTwoCharactersTheSame_BasicNegativeScenerio() {
		
		//assertEquals(false, helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
		
		//assertFalse("The conditon false",true);
		assertFalse( helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
		assertTrue( helper.areFirstAndLastTwoCharactersTheSame("ABAB"));

		
	}
}

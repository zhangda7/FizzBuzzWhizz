package com.thoughtworks.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.thoughtworks.puzzle.BaseHandler;
import com.thoughtworks.puzzle.Constants;
import com.thoughtworks.puzzle.PuzzleMain;


public class TestPuzzle {
	
	private static BaseHandler handler = null;
	
	@BeforeClass
	public static void setup() {
		PuzzleMain main = new PuzzleMain();
		handler = main.constuctChain(3, 5, 7);
	}
	
	@After
	public void teardown() {
		
	}

	@Test
	public void testFizz() {
		assertEquals(Constants.FIZZ, handler.handle(3));
		assertEquals(Constants.FIZZ, handler.handle(6));
		assertEquals(Constants.FIZZ, handler.handle(9));
		assertEquals(Constants.FIZZ, handler.handle(12));
	}
	
	@Test
	public void testBuzz() {
		assertEquals(Constants.BUZZ, handler.handle(5));
		assertEquals(Constants.BUZZ, handler.handle(10));
		assertEquals(Constants.BUZZ, handler.handle(20));
		assertEquals(Constants.BUZZ, handler.handle(25));
	}
	
	@Test
	public void testWhizz() {
		assertEquals(Constants.WHIZZ, handler.handle(7));
		assertEquals(Constants.WHIZZ, handler.handle(14));
		assertEquals(Constants.WHIZZ, handler.handle(28));
	}
	
	@Test
	public void testFIZZBUZZ() {
		assertEquals(Constants.FIZZ + Constants.BUZZ, handler.handle(15));
		assertEquals(Constants.FIZZ + Constants.WHIZZ, handler.handle(21));
		//assertEquals(Constants.BUZZ + Constants.WHIZZ, handler.handle(35));
	}
	
	@Test
	public void testSpecial() {
		assertEquals(Constants.FIZZ, handler.handle(35));
		assertEquals(Constants.FIZZ, handler.handle(13));
		assertEquals(Constants.FIZZ, handler.handle(23));
		assertEquals(Constants.FIZZ, handler.handle(33));
	}
}

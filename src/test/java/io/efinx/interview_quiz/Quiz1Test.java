package io.efinx.interview_quiz;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Quiz1Test {

	@Test
	public void testBlankList() {
		assertEquals(Quiz1.equalChanceSearch(new int[] {}, 0), -1);
		assertEquals(Quiz1.equalChanceSearch(new int[] {}, -1), -1);
	}

	@Test
	public void testNotFound() {
		assertEquals(Quiz1.equalChanceSearch(new int[] { -7, 2, 3, 5, 2, 2, 9, -10, 3, 100 }, 4), -1);
		assertEquals(Quiz1.equalChanceSearch(new int[] { -7, 2, 3, 5, 2, 2, 9, -10, 3, 100 }, 0), -1);
	}

	@Test
	public void testFound() {
		assertEquals(Quiz1.equalChanceSearch(new int[] { -7, 2, 3, 5, 2, 2, 9, -10, 3, 100 }, 5), 3);

		for (int i = 0; i < 200; i++) {
			int x = Quiz1.equalChanceSearch(new int[] { -7, 2, 3, 5, 2, 2, 9, -10, 3, 100 }, 2);
			assertTrue(x == 1 || x == 4 || x == 5);
		}
	}

}

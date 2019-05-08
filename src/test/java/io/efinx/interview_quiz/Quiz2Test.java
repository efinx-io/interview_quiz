package io.efinx.interview_quiz;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Quiz2Test {

	@Test
	public void testBlank() {
		assertEquals(Quiz2.decompress(""), "");
	}

	@Test
	public void testSimple() {
		assertEquals(Quiz2.decompress("a"), "a");
		assertEquals(Quiz2.decompress("ab"), "ab");
		assertEquals(Quiz2.decompress("2[ab]"), "abab");
		assertEquals(Quiz2.decompress("2[ab]4[c]"), "ababcccc");
	}

	@Test
	public void testInterviewQuiz() {
		assertEquals(Quiz2.decompress("2[abc]3[ab]c"), "abcabcabababc");
		assertEquals(Quiz2.decompress("10[a]c2[ab]"), "aaaaaaaaaacabab");
		assertEquals(Quiz2.decompress("2[3[a]b]"), "aaabaaab");
	}

	@Test
	public void testComplex() {
		assertEquals(Quiz2.decompress("2[a2[b]10[c]]"), "abbccccccccccabbcccccccccc");
		assertEquals(Quiz2.decompress("a10[b]c2[d3[e2[f]2[gh]]]z"),
				"abbbbbbbbbbcdeffghgheffghgheffghghdeffghgheffghgheffghghz");
	}

}

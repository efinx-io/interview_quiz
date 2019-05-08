package io.efinx.interview_quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Quiz1 {

	public static int equalChanceSearch(int[] list, int x) {
		List<Integer> result = new ArrayList<Integer>();
		for (int i = 0; i < list.length; i++)
			if (list[i] == x)
				result.add(i);
		return result.size() <= 0 ? -1 : result.get(new Random().nextInt(result.size()));
	}

}

package io.efinx.interview_quiz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Quiz2 {

	public static String decompress(String s) {
		Pattern pattern = Pattern.compile("(\\d+)\\[([a-z]*)\\]");

		while (pattern.matcher(s).find()) {
			s = StringRegexReplacer.replace(s, pattern, (Matcher m) -> {
				int num = Integer.parseInt(m.group(1));
				String content = m.group(2);

				StringBuilder buf = new StringBuilder();
				for (int i = 0; i < num; i++)
					buf.append(content);
				return buf.toString();
			});
		}

		return s;
	}

}

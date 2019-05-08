package io.efinx.interview_quiz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;

public class Quiz2 {

	public static String decompress(String s) {
		Pattern pattern = Pattern.compile("(\\d+)\\[([a-z]*)\\]");

		while (pattern.matcher(s).find()) {
			s = StringRegexReplacer.replace(s, pattern, (Matcher m) -> {
				int num = Integer.parseInt(m.group(1));
				String content = m.group(2);

				return StringUtils.repeat(content, num);
			});
		}

		return s;
	}

}

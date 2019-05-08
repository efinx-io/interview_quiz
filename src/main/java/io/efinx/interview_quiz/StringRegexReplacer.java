package io.efinx.interview_quiz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringRegexReplacer {

	public static String replace(String input, Pattern pattern, StringRegexReplacerCallback callback) {
		StringBuffer buf = new StringBuffer();
		Matcher matcher = pattern.matcher(input);
		while (matcher.find()) {
			matcher.appendReplacement(buf, callback.replace(matcher));
		}
		matcher.appendTail(buf);

		return buf.toString();
	}

}
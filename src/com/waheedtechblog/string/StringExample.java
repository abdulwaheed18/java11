/**
 * 
 */
package com.waheedtechblog.string;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

/**
 * Example of new string method which was added with JDK 11
 * 
 * @author AbdulWahee18@gmail.com
 *
 */
public class StringExample {

	public static void main(String[] args) {

		// Java 8 Predefine Functional Interface
		// The best way to learn JAVA 8 is to implement it wherever you can...
		BiConsumer<String, String> display = (msg1, msg2) -> System.out.println(msg1 + msg2);

		// local variable type inference
		var msg = "Welcome to waheedtechblog page";
		// String msg = "Welcome to waheedtechblog page"; both are same

		// Will return true if string is empty or any white spaces
		if (msg.isBlank()) {
			display.accept("msg attribute is emty", msg);
		} else {
			display.accept("1. Hello, ", msg);
		}

		String emptyMsg = "";
		display.accept("2. Is msg Empty: ", String.valueOf(emptyMsg.isBlank()));

		String whitespacesMsg = "\n\t";
		display.accept("2. Is msg empty: ", String.valueOf(whitespacesMsg.isBlank()));

		String lineMsg = "Welcome\nto\nwaheedtechblog\npage";
		display.accept("3. Line Msg: \n", lineMsg);
		// line returns streams of line extracted from the String
		List<String> lines = lineMsg.lines().collect(Collectors.toList());
		System.out.println("4. line as list: " + lines);

		var stripMsg = "    Welcome to   \t Waheedtechblog page     ";
		display.accept("5. Normal Print: ", "$" + stripMsg + " $");
		// As the name suggests, Strip() methods are used to strip whitespaces from the
		// string.
		display.accept("6. Using Strip(): ", "$" + stripMsg.strip() + "$");
		display.accept("7. Using StripLeading(): ", "$" + stripMsg.stripLeading() + "$");
		display.accept("8. Using StripTrailing: ", "$" + stripMsg.stripTrailing() + "$");

		var repeatMessage = "Welcome";
		// returns a new string whose value is the concatenation of this string repeated
		// ‘n’ times.
		display.accept("9. Repeat msg: ", repeatMessage.repeat(5));
	}
}

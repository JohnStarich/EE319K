package util;

import java.util.LinkedList;

public class ListUtils {
	public static String stringByConcatListWithString(LinkedList<? extends Object> list, String concatString) {
		String string = "";
		for(Object o : list)
			if(o != null)
				string += o.toString()+concatString;
		return string;
	}
}

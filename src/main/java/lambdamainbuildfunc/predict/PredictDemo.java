package lambdamainbuildfunc.predict;

import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * @version 1.0.0
 * @auther Sandy.Hao
 * @date 2021-09-15
 * @Description
 */

public class PredictDemo {

	public static void main(String[] args) {

		Predicate<String> pre1 = (t) -> t.endsWith("s");
		Predicate<String> pre2 = (t) -> t.startsWith("s");

		boolean flag = check(pre1.or(pre2),"apples");
		System.out.println(flag);
	}

	public static boolean check(Predicate p, String s){
		return p.test(s);
	}
}

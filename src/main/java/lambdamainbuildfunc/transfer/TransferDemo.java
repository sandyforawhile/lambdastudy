package lambdamainbuildfunc.transfer;

import java.util.function.Function;

/**
 * @version 1.0.0
 * @auther Sandy.Hao
 * @date 2021-09-15
 * @Description
 */

public class TransferDemo {

	public static void main(String[] args) {

		Function<String, String> func1 = (t) -> {
			System.out.println(t);
			return t + " aaa ";
		};
		Function<String, String> func2 = (t) -> t + " bbb ";

		String s = "123";
		s = preHandler(func1.andThen(func2), s);
		System.out.println(s);
	}

	public static String preHandler(Function<String, String> f, String s){
		return f.apply(s);
	}

}

package lambdatest03;

/**
 * @version 1.0.0
 * @auther Sandy.Hao
 * @date 2021-09-15
 * @Description
 */

import java.util.ArrayList;
import java.util.List;

/**
 * 带多个参数的Lambda简化
 */
public class LambdaTest {
	public static void main(String[] args) {
		ILive live = null;

		//Lambda简化
		live = (int a, int b) -> {
			System.out.println("简化1：" + (a+b));
		};
		live.liveFunc(1,2);



		//Lambda简化参数类型
		live = (a, b) -> {
			System.out.println("简化2：" + (a+b));
		};
		live.liveFunc(2,2);


		//Lambda简化花括号（只有一套语句时）
		live = (a,b) -> System.out.println("简化3：" + (a+b));
		live.liveFunc(3,2);

	}
}

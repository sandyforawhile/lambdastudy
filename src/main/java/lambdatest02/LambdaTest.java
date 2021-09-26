package lambdatest02;

/**
 * @version 1.0.0
 * @auther Sandy.Hao
 * @date 2021-09-15
 * @Description
 */

/**
 * 带一个参数的Lambda简化
 */
public class LambdaTest {
	public static void main(String[] args) {
		ILive live = null;

		//Lambda简化
		live = (int a) -> {
			System.out.println("简化1：" + a);
		};
		live.liveFunc(1);



		//Lambda简化参数类型
		live = (a) -> {
			System.out.println("简化2：" + a);
		};
		live.liveFunc(2);


		//Lambda简化括号
		live = a -> {
			System.out.println("简化3： " + a);
		};
		live.liveFunc(3);


		//Lambda简化花括号（只有一套语句时）
//		live = a -> System.out.println("简化4：" + a);
		live = System.out::println;
		live.liveFunc(4);
	}
}

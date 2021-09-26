package lambdatest01;

/**
 * @version 1.0.0
 * @auther Sandy.Hao
 * @date 2021-09-15
 * @Description
 */

/**
 * Lambda入门
 */
public class LambdaTest {

	//静态内部类
	static class Like2 implements ILike{
		public void lambda() {
			System.out.println("Like2, Lambda2");
		}
	}

	public static void main(String[] args) {
		ILike like = new Like1();
		like.lambda();

		like = new Like2();
		like.lambda();

		//局部内部类
		class Like3 implements ILike{
			public void lambda() {
				System.out.println("Like3, Lambda3");
			}
		}
		like = new Like3();
		like.lambda();


		//匿名内部类
		like = new ILike() {
			public void lambda() {
				System.out.println("Like4, Lambda4");
			}
		};
		like.lambda();

		//Lambda表达式
		like = () -> {
			System.out.println("Like5, Lambda5");
		};
		like.lambda();
	}
}

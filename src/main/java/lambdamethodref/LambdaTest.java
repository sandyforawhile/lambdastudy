package lambdamethodref;

/**
 * @version 1.0.0
 * @auther Sandy.Hao
 * @date 2021-09-15
 * @Description
 */

public class LambdaTest {
	public static void main(String[] args) {

		InterfaceA labmdaA1 = a -> System.out.println(a);
		labmdaA1.show(100);
		//变形
		InterfaceA lambdaA2 = System.out::println;
		lambdaA2.show(120); //参数一致性



		InterfaceB lambdaB1 = s -> new String(s);
		String b1 = lambdaB1.show("b1");
		System.out.println(b1);
		//变形
		InterfaceB lambdaB2 = String::new;
		String b2 = lambdaB2.show("b2");
		System.out.println(b2);



		InterfaceC lambdaC1 = i ->  Math.abs(i);
		int c1 = lambdaC1.show(-3);
		System.out.println(c1);
		//变形
		InterfaceC lambdaC2 = Math::abs;
		int c2 = lambdaC2.show(-7);
		System.out.println(c2);
	}
}

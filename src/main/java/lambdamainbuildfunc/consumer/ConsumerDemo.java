package lambdamainbuildfunc.consumer;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

/**
 * @version 1.0.0
 * @auther Sandy.Hao
 * @date 2021-09-15
 * @Description
 */

public class ConsumerDemo {

	public static void main(String[] args) {

		Consumer<Map> consumer1 = (t) -> {
			t.put("c",3);
		};

		Consumer<Map> consumer2 = (t) -> {
			t.put("d",4);
		};


		Map map = new HashMap();
		func(consumer1, map);

		map.forEach((k,v) -> {
			System.out.println(k+": "+v);
		});
	}

	public static void func(Consumer c, Map<String,Integer> map){

		//公共处理逻辑
		map.put("a",1);
		map.put("b",2);

		c.accept(map);

	}

}

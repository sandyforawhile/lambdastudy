package lambdamainbuildfunc.supplier;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

/**
 * @version 1.0.0
 * @auther Sandy.Hao
 * @date 2021-09-15
 * @Description
 */

public class SupplierDemo {

	public static void main(String[] args) {
		Supplier supplier1 = () -> {
			Map map = new HashMap<>();
			map.put("a",1);
			map.put("b",2);
			return map;
		};

		Supplier supplier2 = () -> {
			List list = new ArrayList();
			list.add("sandy");
			list.add("coco");
			return list;
		};

		func(supplier2);
	}

	public static void func(Supplier s){
		//此处可以有一些公共处理逻辑
		Object o = s.get();
		System.out.println(o.toString());
	}
}

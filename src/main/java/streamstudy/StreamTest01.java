package streamstudy;

import javax.swing.plaf.synth.SynthEditorPaneUI;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @version 1.0.0
 * @auther Sandy.Hao
 * @date 2021-09-16
 * @Description
 */

public class StreamTest01 {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("apple");
		list.add("banana");
		list.add("orange");
		list.add("watermaleon");
		list.add("grape");

		System.out.println("==============Begin===============");

		list.stream()
				.filter(e -> Integer.valueOf(String.valueOf(e).length()).equals(5))
				.forEach(System.out::println);


		System.out.println("-----------华丽丽的分割符------------");

		Stream.of("apple", "banana", "orage", "mango", "grape")
				.map(String::length)
				.forEach(System.out::println);

		System.out.println("-----------华丽丽的分割符------------");

		Stream.of("apple", "banana", "orage", "mango", "grape")
				.mapToDouble(String::length)
				.forEach(System.out::println);

		System.out.println("-----------华丽丽的分割符------------");

		Stream.of("a-b-c-d-e-f", "g-h-i-j-k-l-m-n")
				.flatMap(e -> Stream.of(e.split("-")))
				.forEach(System.out::println);

		System.out.println("-----------华丽丽的分割符------------");

		Stream.of(1, 2, 3, 4, 5, 6)
				.limit(3)
				.forEach(System.out::println);

		System.out.println("-----------华丽丽的分割符------------");

		Stream.of(1,2,2,1,3,1,2,5,6,6,4)
				.distinct()
				.sorted()
				.forEach(System.out::println);

		System.out.println("-----------华丽丽的分割符------------");

		User a = new User("a",18);
		User b = new User("a",19);
		User c = new User("b",18);
		User d = new User("c",20);
		User f = new User("a",18);

		Stream.of(a,b,c,d,f)
				.distinct() //需要根据实体重写equals()方法
				.forEach(System.out::println);

		Stream.of(a,b,c,d)
				.peek(e -> {e.setName(e.getName()+e.getAge());})
				.forEach(System.out::println);

		Stream.of(a,b,c,d)
				.map(e -> {e.setName(e.getName()+e.getAge());return e;})
				.forEach(System.out::println);

		System.out.println("-----------华丽丽的分割符------------");

		Stream.of("apple","pear","grape","watermelon","banana")
				.collect(Collectors.toSet())
				.forEach(System.out::println);

		System.out.println("-----------华丽丽的分割符------------");

		int sum = Stream.of(1,8,5,9,-2,6,7)
				.reduce(1, (e1,e2) -> e1*e2);
		System.out.println(sum);

	}

	static class User{

		private String name;
		private int age;

		public User(String name, int age){
			this.name = name;
			this.age = age;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		@Override
		public String toString() {
			return "User{" +
					"name='" + name + '\'' +
					", age=" + age +
					'}';
		}


		@Override
		public boolean equals(Object user){
			User user1 = (User)user;
			if(this.getAge() == user1.getAge() && this.getName().equals(user1.getName())){
				return true;
			}else{
				return false;
			}
		}

		@Override
		public int hashCode() {
			return Objects.hash(name, age);
		}

	}

}

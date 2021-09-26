package optionalstudy;

import java.util.Optional;

/**
 * @version 1.0.0
 * @auther Sandy.Hao
 * @date 2021-09-17
 * @Description
 */

public class OptionalTest01 {

	public static void main(String[] args) {

		String n = new String();

		Optional<String> fullName = Optional.of(n);
		System.out.println("Full name is set? " + fullName.isPresent());
		System.out.println("Full Name: " + fullName.orElse("12345"));
	}

}

// 자바 더블콜론
// 1.8부터 제공되는 문법 (람다, 스트림, 더블콜론, optional)

// 매서드 참조 표현식(method reference expression) => ::
// 1. 스태틱 메서드인 경우 인스턴스 대신 클래스 이름으로 사용
// 2. 생성자를 참조
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

class Food {
	private String name;

	public Food(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
}

public class DoubleColonMain {
	public static void main(String[] args) {

		Function<String, Food> fun1 = (String name) -> new Food(name);

		Food food = fun1.apply("피자");
		System.out.println(food.getName());

		
		Function<String, Food> fun2 = Food::new;
		food = fun2.apply("라면");
		System.out.println(food.getName());

		///////////////////////////////////////////////////////////////////
		List<String> list = Arrays.asList("aaa", "bbb", "ccc", "ddd");

		list.stream().map(element -> element.toUpperCase())
				.forEach(System.out::println);

		System.out.println("AAA");
	}
}

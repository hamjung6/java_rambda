
@FunctionalInterface
interface Calculate2<T> {
	T cal(T a, T b);
}

public class LamdaMain3 {

	public static void main(String[] args) {

		Calculate2<Integer> cal = (a, b) -> a + b;

		System.out.println(cal.cal(4, 5));

		Calculate2<Character> cal2 = (Character a, Character b) -> {

			if ((int) a >= (int) b) {
				return a;
			}

			return b;
		};

		System.out.println(cal2.cal('A', 'a'));
	}
}
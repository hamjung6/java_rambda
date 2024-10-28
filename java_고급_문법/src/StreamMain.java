import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMain {
	public static void main(String[] args) {

		int[] ar = { 1, 2, 3, 4, 5 };

		// IntStream stm1 = Arrays.stream(ar);

		// IntPredicate predicate =Predicate<Integer> predicate
		// IntStream stm2 = stm1.filter(n-> n%2 ==1); //중간연산
		// int sum = stm2.sum(); //최종 연산

		int sum = Arrays.stream(ar) // 스트림 객체로 바꾼다.
				.filter(n -> n % 2 == 1) // 중간연산 함수
				.sum(); // 최종함수

		System.out.println(sum);

		String[] names = { "봄", "여름", "가을", "겨울" };

		Arrays.stream(names).forEach(s -> System.out.println(s));

		double[] ds = { 1.1, 2.2, 3.3, 4.4 };
		Arrays.stream(ds).forEach(d -> System.out.println(d));
		
		// filter 예제
		List<String> names2 = Arrays.asList("Sehoon", "Songwoo", "Chan", "Youngsuk", "Dajung");
		
		// list의 엘리먼트 값을 모두 대문자로 변경하여 출력.
		// R apply(T t);
		names2.stream()
				.map(name -> name.toUpperCase())
				.forEach(name -> System.out.println(name));

		names2.stream()
				.map((name) -> name.length())
				.forEach(name -> System.out.println(name));

		names2.stream()
				.mapToInt((name) -> name.length())
				.forEach(i -> System.out.println(i));

		int sum2 = names2.stream()
				.mapToInt((name) -> name.length())
				.sum();
		
		System.out.println("내부에 있는 숫자들을 더함 : " + sum2);

		// 'S'로 시작하는 이름을 출력.
		
		// boolean test(T t);
		names2.stream()
				.filter(s -> s.startsWith("S"))
				.forEach(name -> System.out.println(name));
		
		List<String> startsWithS = names2.stream()
				.filter(s -> s.startsWith("S"))
				.collect(Collectors.toList());
		
		System.out.println(
				names2.stream()
				.filter(s -> s.startsWith("S"))
				.collect(Collectors.joining(","))
		);
		
		System.out.println(startsWithS);
		
		// 중간연산

		// -필터링(distinct(), filter())
		// -매핑(map(), flatMap())
		// -정렬(sorted())
		// -연산 결과 확인(peek())

		// 최종연산
		// -연산 결과 확인(forEach())
		// - 매칭(match())
		// -기본 집계(sum(), count(), average(), max(), min())
		// -결과를 다른 종류로 반환(collect())

	}
}

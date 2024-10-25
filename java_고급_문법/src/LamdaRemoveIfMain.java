import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class LamdaRemoveIfMain {

	public static void main(String[] args) {

		List<Integer> ls = Arrays.asList(1, -2, 3, 4, 5);
		ls = new ArrayList<>(ls);
		
		Predicate<Number> p = n -> n.doubleValue() < 0.0; // 삭제 조건
		
		// boolean test(T t);
		Predicate<Integer> p1 = (Integer i) -> {	
			return (i < 0) ? true : false;
		};
		
		ls.removeIf(p1);
		System.out.println(ls);
		
		ls.removeIf(p);
		System.out.println(ls);
		
	}
	
	
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LamdaRemoveIfMain {

	public static void main(String[] args) {
		List<Student> sArr = new ArrayList<Student>();
		sArr.add(new Student(90, 80, 70, "홍길동"));
		sArr.add(new Student(90, 60, 70, "홍길순"));
		sArr.add(new Student(90, 60, 70, "홍말자"));
		sArr.add(new Student(50, 50, 50, "바둑이"));
		
		// 1. 수학점수 70점 밑으로 ~~
		// boolean test(T t);
		Predicate<Student> pStudent = (Student student) -> {
			
			int math = student.eng;
			return (math < 70) ? true : false;
		};
		
		// 2. 평균이 60점 밑으로
		
		pStudent = (Student student) -> {
			
			double avg = (student.eng + student.math + student.math + student.kor) / 3.0;
			return (avg < 60) ? true : false;
		};
		
		sArr.removeIf(pStudent);
		
		for (Student student2 : sArr) {
			System.out.println(student2.name);
		}

		// =====================================
		List<Integer> ls = Arrays.asList(1, -2, 3, 4, 5);
		ls = new ArrayList<>(ls);

		Predicate<Number> p = n -> n.doubleValue() < 0.0; // 삭제조건

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

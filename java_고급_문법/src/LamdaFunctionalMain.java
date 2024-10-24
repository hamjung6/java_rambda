import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

// Function<T, R>
// R apply(T)

class Student{
	int kor;
	int eng;
	int math;
	String name;
	
	public Student(int kor, int eng, int math, String name) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.name = name;
	}
}

public class LamdaFunctionalMain {
	public static void main(String[] args) {
		
		List<Student> sArr = new ArrayList<Student>();
		sArr.add(new Student(90, 80, 70, "홍길동"));
		sArr.add(new Student(90, 60, 70, "홍길순"));
		sArr.add(new Student(90, 60, 70, "홍말자"));
		
		Function<Student, Integer> sFun = (Student s) -> {
			return s.kor + s.eng + s.math;
		};
		
		Function<Student, Double> avgFun = (Student s)->{
			return (s.kor + s.eng + s.math)/ 3.0;
		};
		
		for (Student student : sArr) {
			System.out.println("총점" + sFun.apply(student) + "평균" + avgFun.apply(student));
		}
		
		Function<String, Integer> fun = s -> s.length();
		System.out.println(fun.apply("안녕하세요"));
	}	
}

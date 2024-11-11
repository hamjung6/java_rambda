import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ThreadEx1Main {

   public static void main(String[] args) {

      List<Student> sArr = new ArrayList<Student>();
      sArr.add(new Student(90, 80, 70, "홍길동"));
      sArr.add(new Student(80, 60, 70, "홍길순"));
      sArr.add(new Student(70, 60, 70, "홍말자"));
      sArr.add(new Student(50, 50, 50, "바둑이"));

      sArr.stream().filter(student -> student.name.startsWith("홍"))
            .mapToDouble(student -> (student.kor + student.eng + student.math) / 3.0)
            .forEach(avg -> System.out.println(avg));

      List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

      //Optional<Integer> sum = numbers.stream().reduce((x, y) -> x + y);
      Optional<Integer> sum = numbers.stream().reduce(Integer::sum);
      
      sum.ifPresent(s -> System.out.println("sum = " + s));
   }
}

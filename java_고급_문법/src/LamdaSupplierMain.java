import java.util.Set;
import java.util.TreeSet;
import java.util.function.Supplier;

//Supplier<T> 공급하다
//T get();

//Supplier 인터페이스를 통하여 로또 번호 6개를 리턴하시오.


public class LamdaSupplierMain {

   public static void main(String[] args) {
      Supplier<String> helloSupplier = () -> {
            return "hello";
      };
      
      System.out.println(helloSupplier.get());
      
      Supplier<Set<Integer>> lotto = () -> {
         
         Set<Integer> lottoSet = new TreeSet<>();
         final int LOTTO = 6;
         
         while(lottoSet.size() < LOTTO) {
            int num = (int) ((Math.random() * 45) +1); 
            lottoSet.add(num);
         }
         
         return lottoSet;         
         
      };
      
      System.out.println(lotto.get());

      
   }   
}

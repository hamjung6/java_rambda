//Optional은 if null 회피 하기 위해서 나온 문법
//null 체크 -> 프로그램을 죽이는 이유중에 가장큰 이유중에 하나
//NPE(NullPointerException) => null  체크를 함.

class Human{
   private Heart heart;
}
class Heart{
   private Blood blood;
}

public class OptionalMain {
   
   public static void isCheckNull(Human obj) {
      
      if(obj == null) {
         if(obj.heart ==null )
            if(obj.heart.blood == null)
         
               System.out.println("널입니다.");
         return; 
      }
      
      System.out.println(obj);
   }
   
   public static void main(String[] args) {
       Object obj = null;
       
       isCheckNull(obj);      
      isCheckNull(new Object());
   
               
   }   
}

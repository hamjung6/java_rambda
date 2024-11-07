import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FilterStreamMain {   
   public static void main(String[] args) {
      
      //InputStream in = new FileInputStream("data.dat");   // 입력 스트림 생성
      //DataInputStream fIn = new DataInputStream(in);   // 필터 스트림 생성 및 연결

      
      try(DataOutputStream out = new DataOutputStream(new FileOutputStream("data.dat"))  ) {
         
         out.writeInt(370);
         out.writeDouble(3.14);         
         
      } catch (Exception e) {
         e.printStackTrace();
      }
      
      try(DataInputStream in = new DataInputStream(new FileInputStream("data.dat"))  ) {
         
         int num1 = in.readInt();
         double num2 = in.readDouble();      
         
         System.out.println(num1);
         System.out.println(num2);
         
      } catch (Exception e) {
         e.printStackTrace();
      }
      
      
      
               
   }   
}

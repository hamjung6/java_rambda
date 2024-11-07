import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RWriterStreamMain {

	public static void writeAZ() {

		try (Writer out = new FileWriter("data2.txt")) {

			for (int ch = (int) 'A'; ch < (int) ('z' + 1); ch++) {
				out.write(ch);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void bufferWrite() {
		String ks = "공부에 있어서 돈이 꼭 필요한 것은 아니다.";
		String es = "Life is long if you know how to use it.";

		try (BufferedWriter bw = new BufferedWriter(new FileWriter("String.txt"))) {

			bw.write(ks, 0, ks.length());

			bw.newLine(); // 줄 바꿈 문자를 삽입 (운영체제 별 줄 바꿈의 표시 방법이 다름)

			bw.write(es, 0, es.length());

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void bufferRead() {
		try (BufferedReader br = new BufferedReader(new FileReader("String.txt"))) {
			String str;
			while (true) {
				str = br.readLine(); // 한 문장 읽어 들이기
				if (str == null)
					break;
				System.out.println(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws Exception {

		bufferWrite();

		writeAZ();

		try (Writer out = new FileWriter("data.txt")) {
			out.write('A');
			out.write('한');

		} catch (Exception e) {
			e.printStackTrace();
		}

		try (Reader in = new FileReader("data.txt")) {
			int ch;

			while (true) {
				ch = in.read(); // 문자를 하나씩 읽는다. //2바이트 단위로
				if (ch == -1) // 더 이상 읽을 문자가 없다면,
					break;
				System.out.print((char) ch); // 문자를 하나씩 출력한다.
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

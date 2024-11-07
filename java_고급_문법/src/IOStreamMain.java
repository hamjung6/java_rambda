import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class IOStreamMain {
	public static void outStreamFuction() throws Exception {

		OutputStream out = new FileOutputStream("data.dat");
		out.write(7);
		out.close();
	}

	public static void inputStreamFuction() throws Exception {

		InputStream in = new FileInputStream("data.dat");

		int dat = in.read();
		in.close();

		System.out.println(dat);

	}

	public static void fileCopy() {
		Scanner sc = new Scanner(System.in);

		System.out.println("대상파일");
		String src = sc.nextLine();

		System.out.println("사본이름");
		String dst = sc.nextLine();

		try (InputStream in = new FileInputStream(src); OutputStream out = new FileOutputStream(dst)) {

			int data;
			while (true) {
				data = in.read();

				if (data == -1) {
					break;
				}
				out.write(data);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) throws Exception {

		fileCopy();
		// outStreamFuction();
		// inputStreamFuction();

	}
}

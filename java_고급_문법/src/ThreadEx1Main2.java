import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

class MyThread1 extends Thread {

	@Override
	public void run() {
		// 음악 듣기
		for (int i = 0; i < 300; i++) {
			System.out.print("-");
		}
	}
}

class MyThread2 extends Thread {

	@Override
	public void run() {
		// 비디오 보기
		for (int i = 0; i < 300; i++) {
			System.out.print("+");
		}
	}
}

public class ThreadEx1Main2 {

	public static void main(String[] args) {

		MyThread1 th1 = new MyThread1();
		MyThread2 th2 = new MyThread2();

		th1.start();
		th2.start();
	}
}

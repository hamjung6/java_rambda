import javax.swing.JOptionPane;

class CountThread2 implements Runnable {
	
	@Override
	public void run() {
		
		for (int i = 10; i > 0; i--) {
			System.out.println(i);

			try {
				Thread.sleep(1000); // 1초 뒤에 다시 실행 = 다른 프로그램(다른 쓰레드)에 실행권을 양보
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}

class CountThread extends Thread {

	@Override
	public void run() {
		
		for (int i = 10; i > 0; i--) {
			System.out.println(i);

			try {
				Thread.sleep(1000); // 1초 뒤에 다시 실행 = 다른 프로그램(다른 쓰레드)에 실행권을 양보
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}

public class ThreadEx3Main {

	public static void main(String[] args) {

		Thread th2 = new Thread(new CountThread2());
		th2.start();
		
		CountThread th = new CountThread();
		th.start();

		String input = JOptionPane.showInputDialog("아무 값이나 입력");
		System.out.println("입력 값:" + input);
	}
}

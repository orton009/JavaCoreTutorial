package optum.day3;

public class MyThread  extends Thread{
	public MyThread(String s) {
		super(s) ;
	}
	public void run() {
	System.out.println("New Thread	:	" + Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		MyThread m = new MyThread("A1") ;
		System.out.println(Thread.currentThread().getName());
		m.start();
	}
}

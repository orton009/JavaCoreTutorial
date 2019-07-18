package optum.day3;

public class MyThread  extends Thread{
	public MyThread(String s) {
		super(s) ;
	}
	public void run() {
		System.out.println("New Thread	:	" + Thread.currentThread().getName());
		for(int i =0; i <10 ; i ++ ) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
			try {
				Thread.sleep(500) ;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) throws InterruptedException {
		MyThread m1 = new MyThread("Tiger") ;
		MyThread m2 = new MyThread("Mouse") ;
//		System.out.println(Thread.currentThread().getName());
		for(int i=0 ; i<5 ; i ++) {
			m1.start();
			Thread.sleep(1000);
			m2.start();
		}

//		
//		m1.join();
//		m2.join();
		
	}
}

/*
 * Synchronization in JAva
 *  synchronized function
 *  synchronized(){}  -> block
 * 
 * 
 * */
 
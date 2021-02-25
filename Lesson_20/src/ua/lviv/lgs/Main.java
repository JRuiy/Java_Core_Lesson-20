package ua.lviv.lgs;

public class Main {

	public static void main(String[] args) {
		
		MyThread m = new MyThread(1000);
		m.run();
		
		RunnableThread rt = new RunnableThread(1000);
		
		
	}
	
}

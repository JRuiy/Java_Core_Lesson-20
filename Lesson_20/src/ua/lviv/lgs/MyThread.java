package ua.lviv.lgs;

import java.util.Scanner;

public class MyThread extends Thread {

	private int delay;

	public MyThread(int delay) {
		super();
		this.delay = delay;
	}
	
	@Override
	public void run() {
		System.out.println("¬вед≥ть к≥льк≥сть цифр");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		int a = 1;
		int b = 1;
		System.out.println(a);
		System.out.println(b);
		for (int i = 2; i <= number; i++) {
			int c = a+b;
			System.out.println(c);
			a = b;
			b = c;
			try {
				Thread.sleep(delay);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

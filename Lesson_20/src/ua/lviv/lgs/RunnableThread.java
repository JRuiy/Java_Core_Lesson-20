package ua.lviv.lgs;

import java.util.Scanner;

public class RunnableThread implements Runnable {

	private int delay;
	private Thread thread;

	public RunnableThread(int delay) {
		super();
		this.delay = delay;
		this.thread = new Thread(this);
		thread.start();
	}

	@Override
	public void run() {
		System.out.println("¬вед≥ть к≥льк≥сть цифр");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int [] array = new int[number];
		array[0] = 1;
		array[1] = 1;
		for (int i = 2; i < array.length; i++) {
			array[i] = array[i-1]+array[i-2];
		}
		for (int i = array.length-1; i >= 0; i--) {
			System.out.println(array[i]);
			try {
				Thread.sleep(delay);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

package com.estudo.java;

public class TestThreads {
	
	public static void main(String[] args) {
		
		Thread t = new MyThread() {
			public void run() {
				System.out.println(" Foo ");
			}
		};
		t.start();

	}

}

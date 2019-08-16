package com.study.thread.itcast_07;

public class SetThread implements Runnable {

	private Student s;
	private int x = 0;

	public SetThread(Student s) {
		this.s = s;
	}

	@Override
	public void run() {
		while (true) {
			if (x % 2 == 0) {
				s.set("ÁÖÇàÏ¼", 27);
			} else {
				s.set("ÁõÒâ", 30);
			}
			x++;
		}
	}
}

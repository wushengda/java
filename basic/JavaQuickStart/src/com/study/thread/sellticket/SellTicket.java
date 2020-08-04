package com.study.thread.sellticket;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SellTicket implements Runnable {

	// ����Ʊ
	private int tickets = 1000;

	// ����������
	private Lock lock = new ReentrantLock();

	@Override
	public void run() {
		while (true) {
			try {
				// ����
				lock.lock();
				if (tickets > 0) {
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()
							+ "���ڳ��۵�" + (tickets--) + "��Ʊ");
				}
			} finally {
				// �ͷ���
				lock.unlock();
			}
		}
	}

}

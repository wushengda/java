package cn.itcast_01;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Point;

public class FrameDemo2 {
	public static void main(String[] args) {
		// 创建对象
		Frame f = new Frame("方法调用的前后关系");

		// f.setVisible(true);
		// try {
		// Thread.sleep(3000);
		// } catch (InterruptedException e) {
		// e.printStackTrace();
		// }

		// // f.setSize(400, 300);
		// // Dimension(int width, int height)
		// Dimension d = new Dimension(400, 300);
		// f.setSize(d);
		// // f.setLocation(400, 200);
		// // Point(int x, int y)
		// Point p = new Point(400, 200);
		// f.setLocation(p);
		// 一个方法搞定
		f.setBounds(400, 200, 400, 300);

		f.setVisible(true);
	}
}

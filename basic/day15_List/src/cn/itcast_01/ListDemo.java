package cn.itcast_01;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

/*
 * ����List���ϴ洢�ַ�����������
 */
public class ListDemo {
	public static void main(String[] args) {
		// �������϶���
		List list = new ArrayList();

		// �����ַ���������ַ���
		list.add("hello");
		list.add("world");
		list.add("java");

		// ��������
		Iterator it = list.iterator();
		while (it.hasNext()) {
			String s = (String) it.next();
			System.out.println(s);
		}
	}
}
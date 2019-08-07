package cn.itcast_05;

import java.util.Arrays;

/*
 * Arrays:���������в����Ĺ����ࡣ����˵����Ͳ��ҡ�
 * 1:public static String toString(int[] a) ������ת���ַ���
 * 2:public static void sort(int[] a) �������������
 * 3:public static int binarySearch(int[] a,int key) ���ֲ���
 */
public class ArraysDemo {
	public static void main(String[] args) {
		// ����һ������
		int[] arr = { 24, 69, 80, 57, 13 };

		// public static String toString(int[] a) ������ת���ַ���
		System.out.println("����ǰ��" + Arrays.toString(arr));

		// public static void sort(int[] a) �������������
		Arrays.sort(arr);
		System.out.println("�����" + Arrays.toString(arr));

		// [13, 24, 57, 69, 80]
		// public static int binarySearch(int[] a,int key) ���ֲ���
		System.out.println("binarySearch:" + Arrays.binarySearch(arr, 57));
		System.out.println("binarySearch:" + Arrays.binarySearch(arr, 577));
	}
}
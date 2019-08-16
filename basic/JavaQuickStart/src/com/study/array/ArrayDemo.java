package com.study.array;

public class ArrayDemo
{
	public static void main(String[] args) throws Exception
	{
		// ����һ������
		int[] arr = { 24, 69, 80, 57, 13 };
		
		// ������飬��������
		printArray(arr);
		
		// ð������
		bubbleSort(arr);
		
		// �����
		int index = binarySearch(arr, 80);
		System.out.println("index:" + index);

		// ����һ���ַ���
		String s = "dacgebf";

		// ���ַ���ת��Ϊ�ַ�����
		char[] chs = s.toCharArray();

		// ð�����򣺰��ַ������������
		bubbleSort(chs);

		// ���������ַ�����ת���ַ���
		String result = String.valueOf(chs);

		// ��������ַ���
		System.out.println("result:"+result);

		/** ����һ������ **/
		int[] arr2 = { 24, 69, 80, 57, 13 };
		selectSort(arr2);//����ѡ������
	}

	//ð���������
	static void bubbleSort(int[] arr){
		for (int x = 0; x < arr.length - 1; x++) {
			for (int y = 0; y < arr.length - 1 - x; y++) {
				if (arr[y] > arr[y + 1]) {
					int temp = arr[y];
					arr[y] = arr[y + 1];
					arr[y + 1] = temp;
				}
			}
		}
	}

	// ð������ : ����Ԫ�������Ƚϣ��������ţ���һ����ϣ����ֵ�����������������
	static void bubbleSort(char[] chs) {
		for (int x = 0; x < chs.length - 1; x++) {
			for (int y = 0; y < chs.length - 1 - x; y++) {
				if (chs[y] > chs[y + 1]) {
					char temp = chs[y];
					chs[y] = chs[y + 1];
					chs[y + 1] = temp;
				}
			}
		}
	}
	
	// ѡ������ : ��0������ʼ�����κͺ���Ԫ�رȽϣ�С����ǰ�ţ���һ����ϣ���Сֵ����������С������
	public static void selectSort(int[] arr){
		for(int x=0; x<arr.length-1; x++){
			for(int y=x+1; y<arr.length; y++){
				if(arr[y] <arr[x]){
					int temp = arr[x];
					arr[x] = arr[y];
					arr[y] = temp;
				}
			}
		}
	}
	
	// ��������
	static void printArray(int[] arr) {
		System.out.print("[");
		for (int x = 0; x < arr.length; x++) {
			if (x == arr.length - 1) {
				System.out.print(arr[x]);
			} else {
				System.out.print(arr[x] + ", ");
			}
		}
		System.out.println("]");
	}
	
	// ���ַ�����
	public static int binarySearch(int[] arr, int value) {
		// ���������������С����
		int max = arr.length - 1;
		int min = 0;

		// ������м�����
		int mid = (max + min) / 2;

		// ���м�������ֵ��Ҫ���ҵ�ֵ���бȽ�
		while (arr[mid] != value) {
			if (arr[mid] > value) {
				max = mid - 1;
			} else if (arr[mid] < value) {
				min = mid + 1;
			}

			// �����ж�
			if (min > max) {
				return -1;
			}

			mid = (max + min) / 2;
		}

		return mid;
	}
}

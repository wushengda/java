package com.study.array;

public class ArrayDemo
{
	public static void main(String[] args) throws Exception
	{
		// 定义一个数组
		int[] arr = { 24, 69, 80, 57, 13 };
		
		// 输出数组，遍历数组
		printArray(arr);
		
		// 冒泡排序
		bubbleSort(arr);
		
		// 后查找
		int index = binarySearch(arr, 80);
		System.out.println("index:" + index);

		// 定义一个字符串
		String s = "dacgebf";

		// 把字符串转换为字符数组
		char[] chs = s.toCharArray();

		// 冒泡排序：把字符数组进行排序
		bubbleSort(chs);

		// 把排序后的字符数组转成字符串
		String result = String.valueOf(chs);

		// 输出最后的字符串
		System.out.println("result:"+result);

		/** 定义一个数组 **/
		int[] arr2 = { 24, 69, 80, 57, 13 };
		selectSort(arr2);//进行选择排序
	}

	//冒泡排序代码
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

	// 冒泡排序 : 相邻元素两两比较，大的往后放，第一次完毕，最大值出现在了最大索引处
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
	
	// 选择排序 : 从0索引开始，依次和后面元素比较，小的往前放，第一次完毕，最小值出现在了最小索引处
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
	
	// 遍历数组
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
	
	// 二分法查找
	public static int binarySearch(int[] arr, int value) {
		// 定义最大索引，最小索引
		int max = arr.length - 1;
		int min = 0;

		// 计算出中间索引
		int mid = (max + min) / 2;

		// 拿中间索引的值和要查找的值进行比较
		while (arr[mid] != value) {
			if (arr[mid] > value) {
				max = mid - 1;
			} else if (arr[mid] < value) {
				min = mid + 1;
			}

			// 加入判断
			if (min > max) {
				return -1;
			}

			mid = (max + min) / 2;
		}

		return mid;
	}
}

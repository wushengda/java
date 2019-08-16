package com.study.basic.character;

import java.util.Scanner;

/*
 * Character ���ڶ����а�װһ���������� char ��ֵ
 * ���⣬�����ṩ�˼��ַ�������ȷ���ַ������Сд��ĸ�����֣��ȵȣ��������ַ��Ӵ�дת����Сд����֮��Ȼ
 * 
 * ���췽����
 * 		Character(char value)
 */
public class CharacterDemo
{
	public static void main(String[] args) {
		// ��������
		// Character ch = new Character((char) 97);
		Character character = new Character('a');
		System.out.println("character:" + character);

		// public static boolean isUpperCase(char ch):�жϸ������ַ��Ƿ��Ǵ�д�ַ�
		System.out.println("isUpperCase:" + Character.isUpperCase('A'));
		System.out.println("isUpperCase:" + Character.isUpperCase('a'));
		System.out.println("isUpperCase:" + Character.isUpperCase('0'));
		System.out.println("-----------------------------------------");
		// public static boolean isLowerCase(char ch):�жϸ������ַ��Ƿ���Сд�ַ�
		System.out.println("isLowerCase:" + Character.isLowerCase('A'));
		System.out.println("isLowerCase:" + Character.isLowerCase('a'));
		System.out.println("isLowerCase:" + Character.isLowerCase('0'));
		System.out.println("-----------------------------------------");
		// public static boolean isDigit(char ch):�жϸ������ַ��Ƿ��������ַ�
		System.out.println("isDigit:" + Character.isDigit('A'));
		System.out.println("isDigit:" + Character.isDigit('a'));
		System.out.println("isDigit:" + Character.isDigit('0'));
		System.out.println("-----------------------------------------");
		// public static char toUpperCase(char ch):�Ѹ������ַ�ת��Ϊ��д�ַ�
		System.out.println("toUpperCase:" + Character.toUpperCase('A'));
		System.out.println("toUpperCase:" + Character.toUpperCase('a'));
		System.out.println("-----------------------------------------");
		// public static char toLowerCase(char ch):�Ѹ������ַ�ת��ΪСд�ַ�
		System.out.println("toLowerCase:" + Character.toLowerCase('A'));
		System.out.println("toLowerCase:" + Character.toLowerCase('a'));

		// ��������ͳ�Ʊ�����
		int bigCount = 0;
		int smallCount = 0;
		int numberCount = 0;

		// ����¼��һ���ַ�����
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ַ�����");
		String line = sc.nextLine();

		// ���ַ���ת��Ϊ�ַ����顣
		char[] chs = line.toCharArray();

		// ���ַ������ȡ��ÿһ���ַ�
		for (int x = 0; x < chs.length; x++) {
			char ch = chs[x];

			// �жϸ��ַ�
			if (Character.isUpperCase(ch)) {
				bigCount++;
			} else if (Character.isLowerCase(ch)) {
				smallCount++;
			} else if (Character.isDigit(ch)) {
				numberCount++;
			}
		}

		// ����������
		System.out.println("��д��ĸ��" + bigCount + "��");
		System.out.println("Сд��ĸ��" + smallCount + "��");
		System.out.println("�����ַ���" + numberCount + "��");
	}
}
package com.study.regex.itcast_05;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * ��ȡ����
 *		Pattern��Matcher���ʹ��
 *		
 *		ģʽ��ƥ�����Ļ���ʹ��˳��
 */
public class RegexDemo {
	public static void main(String[] args) {
		// ģʽ��ƥ�����ĵ��͵���˳��
		// ���������ʽ�����ģʽ����
		Pattern p = Pattern.compile("a*b");
		// ͨ��ģʽ����õ�ƥ�����������ʱ����Ҫ���Ǳ�ƥ����ַ���
		Matcher m = p.matcher("aaaaab");
		// ����ƥ��������Ĺ���
		boolean b = m.matches();
		System.out.println(b);
		
		//������жϹ��ܣ�����������жϣ����������е��鷳�ˣ�����ֱ�����ַ����ķ�����
		String s = "aaaaab";
		String regex = "a*b";
		boolean bb = s.matches(regex);
		System.out.println(bb);
	}
}
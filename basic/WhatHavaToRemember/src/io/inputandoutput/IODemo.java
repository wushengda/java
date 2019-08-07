package io.inputandoutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IODemo {
	public static void main(String[] args) {
		int b = 0;
		FileInputStream inputStream = null;
		FileOutputStream outputStream = null;
		
		try {
			inputStream = new FileInputStream("file.txt");
			outputStream = new FileOutputStream("file2.txt");
			
			while ((b=inputStream.read())!=-1) {
				outputStream.write(b);;
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println("文件以及复制");
	}
}

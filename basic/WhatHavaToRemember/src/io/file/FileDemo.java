package io.file;

import java.io.File;

public class FileDemo {
	public static void main(String[] args) {
		createMethod();
	}
	
	public static void createMethod(){
		File file = new File("a.txt");
		System.out.println(file);
	}
}

package cn.itcast_04;

/*
 * ��߿���Ч�ʣ�
 * A:���������Զ��ṩ���췽��
	a:�޲ι��췽�� 
		�ڴ��������Ҽ�--source--Generate Constructors from Superclass
	b:���ι��췽�� 
		�ڴ��������Ҽ�--source--Generate Constructors using fields.. -- finish
		
   B:�ɶԵ�getXxx()��setXxx()
   		�ڴ��������Ҽ�--source--Generate Getters and Setters...
 */
public class Student {
	// ��Ա����
	private String name;
	private int age;
	
	//���췽��
	public Student() {
		super();
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	//��Ա����
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}

package com.javaGG.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String configLocation1 = "classpath:applicationCTX1.xml";
		String configLocation2 = "classpath:applicationCTX2.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation1, configLocation2);
		
		Student student1 = ctx.getBean("student1", Student.class);
		System.out.println(student1.getName());
		System.out.println(student1.getAge());
		System.out.println(student1.getHobbies());
		System.out.println();
		
		StudentInfo studentInfo = ctx.getBean("studentInfo1", StudentInfo.class);
		Student studentHong = studentInfo.getStudent(); //student1과 studentHong은 같음
		System.out.println(studentHong.getName());
		System.out.println(studentHong.getAge());
		System.out.println(studentHong.getHobbies());
		System.out.println();
		
		if(student1.equals(studentHong)) {
			System.out.println("student1과 studentHong은 같은 객체입니다.");
			System.out.println();
		}
		
		Student student2 = ctx.getBean("student2", Student.class);
		System.out.println(student2.getName());
		System.out.println(student2.getAge());
		System.out.println(student2.getHobbies());
		System.out.println();
		
		if(student1.equals(student2)) {
			System.out.println("student1과 student2는 같은 객체입니다.");
			System.out.println();
		}else {
			System.out.println("student1과 student2는 다른 객체입니다.");
			System.out.println();
		}
		
		Family family = ctx.getBean("family", Family.class);
		System.out.println(family.getFather());
		System.out.println(family.getMother());
		System.out.println(family.getSister());
		System.out.println(family.getBrother());
		
		ctx.close();
	}

}

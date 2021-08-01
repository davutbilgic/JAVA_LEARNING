package com.refreshyourself._37_38_39_Inheritance.Ex1;

public class School {

	public static void main(String[] args) {
		

			Person person = new Person();
			Student student = new Student();
			
			person.name = "Mike";
			person.age = 35;
			person.gender = 'M';
			
			student.name = "Smith";
			student.age = 30;
			student.gender = 'M';
			
			student.studentID = 1000;
			
			person.eat("Steak");
			student.eat("Pizza");
			
			//person.code("Java");
			

	}

}

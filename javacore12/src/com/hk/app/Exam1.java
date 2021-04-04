package com.hk.app;

public class Exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		College student1 = new College();
		// 학점이 A, B, C, D 계산을 해주는 학생 (90,80 70, 60)
		student1.setScore(80);
		student1.computeGrade();
		System.out.println("student1의 학점은:"+student1.getGrade());
		
		Graduate student2 = new Graduate();
		// 학점이 PASS, FAIL 계산을 해주는 학생 (70점 기준)
		
		// 각각의 클래스 Student 클래스를 상속, 함수 재정의하시오
	}

}

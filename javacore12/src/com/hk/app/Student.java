package com.hk.app;

public abstract class Student {

	public String name; //학생명
	public int score; // 점수
	public String grade; // 학점
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	abstract public void computeGrade();
}

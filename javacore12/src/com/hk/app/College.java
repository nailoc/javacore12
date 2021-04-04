package com.hk.app;

public class College extends Student {

	@Override
	public void computeGrade() {
		// 90점 -> A로 계산 
		// 80점 -> B로 계산
		// C D
		if(score>=90) {
			grade = "A";
		}else if(score>=80) {
			grade = "B";
		}
		
		
	}

}

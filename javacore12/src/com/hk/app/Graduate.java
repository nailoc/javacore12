package com.hk.app;

public class Graduate extends Student {
	
	@Override
	public void computeGrade() {
		// TODO Auto-generated method stub
		if(score >= 70) {
			grade = "PASS";
		}else {
			
		}
	}

}

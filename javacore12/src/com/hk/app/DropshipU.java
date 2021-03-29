package com.hk.app;

// Unit 을 상속해서 추상메소드를 재정의 하시오
public class DropshipU extends Unit {
	
	// 오버라이딩 => 조건 리턴타입, 함수명, 매개변수 완전히 일치해야 됨
	public void move() {
		// 재정의
		System.out.println("x y방향으로 날아갑니다");
	}

}

package com.hk.app;

public abstract class AudioPlayer { // 추상 메소드를 가지고 있는 클래스가 된다 => 추상 클래스라고 함 
	
	// 추상메소드를 작성 - 음악재생 - 재생구현이 여러가지라서 함수이름 설정 (예시)
	public abstract void playmusic(); //{  }; => 구현부를 작성하지 않는 메소드 : 추상메소드라고 함
	// 일반메소드 - 여기에다 구현해야 됨 -> 구현 방법이 달라서 하위 클래서 상속

}

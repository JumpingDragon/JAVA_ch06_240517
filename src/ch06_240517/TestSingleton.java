package ch06_240517;

public class TestSingleton {
	
	private static TestSingleton single1 = new TestSingleton();
	
	private TestSingleton() {
		
	}
	
	// private이면 한개도 못만들잖아, 목표가 딱 1개 만드는 건데. 그래서 public 메소드를 하나 만든다.
	public static TestSingleton getInstance() {
		return single1;
	}
}

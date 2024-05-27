package ch06_240517;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal1 = new Calculator(10, 20);
		Calculator cal2 = new Calculator();
		
		int result1 = cal1.add();  // 10+20=30 이 반환
		
		System.out.println(cal1.firstnum); // 10
		
		Calculator.thirdNum = 10;
		cal1.thirdNum = 10;
		
		Calculator.minus(10,20); // 위에서 선언하지 않아도 객체를 따로 만들지 않아도 멤버 변수를 쓸 수 있다.
		
		// TestSingleton test1 = new TestSingleton(); 
		//생성자가 private이므로 new 연산자로 객체 선언 불가
		TestSingleton testSingle = TestSingleton.getInstance(); // 마침내, testSingle 객체 하나 선언 성공!
		TestSingleton testSingle2 = TestSingleton.getInstance(); // 계속 만들어봤자, 메모리에는 single1 하나만 존재하게 된다.
		
		System.out.println(Calculator.PI); // final로 선언된 상수 불러오기
		
	}
		
}

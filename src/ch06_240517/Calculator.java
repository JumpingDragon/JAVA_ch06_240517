package ch06_240517;

public class Calculator {

	int firstnum;  // 인스턴스 멤버
	int secondnum;  // 인스턴스 멤버
	
	static int thirdNum; // 정적 멤버
	
	static final double PI = 3.141592 ;
	
	public Calculator() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Calculator(int firstnum, int secondnum) {
		super();
		this.firstnum = firstnum;
		this.secondnum = secondnum;
	}
	
	public int add() {
		return this.firstnum + this.secondnum;
	}
	
	public static int minus(int firstnum, int secondnum) {
		// return this.firstnum - this.secondnum; -> 외부와 상관없이 만들어지는 게 정적 멤버
		return firstnum - secondnum;
	}
	
	
}

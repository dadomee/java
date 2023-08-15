package ch02.sec01;

public class VariableInitializationExample {

	public static void main(String[] args) {
		// 변수 int 선언
		int value;
		
		//연산결과를 변수 result의 초기 값으로 대입
		int result = value + 10;
		//value 오류. 초기화 되지 않은 변수를 연산식에 사용할 경우 컴파일 에러.
		// 선언 할 때 값을 지정해 줘야함.
		//변수 result 값을 읽고 콘솔에 출력
		System.out.println(result);

	}

}

/*
작성자: 김동영
작성일: 2018.10.04
프로그램 설명: 덧셈 연산하는 함수를 만들과 값을 받아와서 출력하는 프로그램
*/

#include <stdio.h> //표준라이브러리 포함시킴

int SumTwo(int a, int b); //함수를 미리 선언

int main(void) { //메인 함수 시작
	int x = 10; y = 5; //값을 저장하는 변수 선언
	int value; //값을 저장하는 변수 선언

	value = SumTwo(x, y); //함수를 호출하고 반환값을 저장
	printf("두 수의 합은 : %d\n", value); //저장된 값을 출력
	return 0; //함수의 종료
}

int SumTwo(int a, int b) { //함수를 더하고 반환하는 함수
	int result; //연산 결과를 저장하는 변수 선언

	result = a + b; //덧셈연산 수행
	return result; //연산결과 반환
}

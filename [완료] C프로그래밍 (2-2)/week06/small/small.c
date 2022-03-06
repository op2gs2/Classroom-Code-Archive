/*
실습3
작성자: 김동영
작성일: 2018.10.11
프로그램 설명: 표준 입력을 받고, 1. 큰 값을 찾아 출력 2. 작은 값을 찾아 출력
*/

#include <stdio.h> //표준입출력라이브러리 불러오기
int big(int num1, int num2); //함수를 미리 선언
int small(int num1, int num2); //함수를 미리 선언

int main(int argc, char*argv[]) { //main 함수의 시작
	int num1, num2; //변수 선언
	printf("값을 입력해주세요\t"); //입력을 위한 메시지 출력
	scanf_s("%d", &num1); //값을 불러들이기
	printf("값을 입력해주세요\t"); //입력을 위한 메시지 출력
	scanf_s("%d", &num2); //값을 불러들이기
	printf("큰 값은 %d 작은 값은 %d\n", big(num1, num2), small(num1, num2)); //비교 결과 값 출력
	return 0; //함수의 종료
}

int big(int num1, int num2) { //큰 값을 반환
	int result; //결과 변수 선언
	result = num1 > num2 ? num1 : num2; //비교 연산 실행
	return result; //결과 반환
}
int small(int num1, int num2) { //작은 값을 반환
	int result; //결과 변수 선언
	result = num1 < num2 ? num1 : num2; //비교 연산 실행
	return result; //결과 반환
}
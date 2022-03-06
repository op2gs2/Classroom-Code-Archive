/*
실습4
작성자: 김동영
작성일: 2018.10.11
프로그램 설명: 표준 입력을 받고, 0보다 크거나 같은 양수면 1. 음수면 -1을 반환 받는 프로그램
*/

#include <stdio.h> //표준입출력라이브러리 불러오기
int sign(int num); //함수를 미리 선언

int main(int argc, char*argv[]) { //main 함수의 시작
	int num = 0; //변수 선언
	printf("값을 입력해주세요\t"); //입력을 위한 메시지 출력
	scanf_s("%d", &num); //값을 불러들이기
	printf("input value = %d\n", num);// 결과 확인
	printf("input value sign = %d\n", sign(num));// 결과 확인
	return 0; //함수의 종료
}

int sign(int num) { //0보다 크거나 같은 양수면 1. 음수면 -1을 반환하는 함수
	int result; //결과 변수
	result = num >= 0 ? 1 : -1; //비교연산 실행
	return result; //결과값 반환
}
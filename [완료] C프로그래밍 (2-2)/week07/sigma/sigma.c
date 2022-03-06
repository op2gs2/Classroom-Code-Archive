/*
실습4
작성자: 김동영
작성일: 2018.10.18
프로그램 설명: 문제에 주어진 수식을 계산하는 프로그램
*/

#include <stdio.h> //표준 입출력 라이브러리

int calc(int num); //수식 계산 함수

int main(int argc, char* argv) { //main 함수
	int num; //계산 할 값 저장
	printf("어디까지 계산? :"); //입력을 위한 메시지 출력
	scanf_s("%d", &num); //입력 받기

	printf("계산 결과 : %d\n", calc(num)); //계산 결과 출력

	return 0; //프로그램 종료
}

int calc(int num) { //수식 계산 함수
	int cnt; //반복 횟수
	int result; //누적 합 저장
	result = 0; //0으로 초기화
	for (cnt = 1; cnt <= num; cnt++) { //반복문
		result += (cnt*cnt) + 1; //누적합 연산
	}
	return result; //누적합 결과 반환
}
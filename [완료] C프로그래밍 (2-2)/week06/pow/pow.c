/*
실습1
작성자: 김동영
작성일: 2018.10.11
프로그램 설명: 표준 입력을 받고, 그 값을 제곱
*/

#include <stdio.h> //표준입출력라이브러리 불러오기
float pow(float); //함수를 미리 선언

int main(int argc, char*argv[]) { //main 함수의 시작
	float input=0, result; //변수 선언
	printf("값을 입력해주세요\t"); //입력을 위한 메시지 출력
	scanf_s("%f", &input); //값을 불러들이기

	result = pow(input); //함수 호출 및 값을 반환 받기
	printf("%f의 제곱은 %f입니다.\n", input, result); //변수의 값을 출력
	return 0; //함수의 종료
}

float pow(float num) { //제곱으로 만드는 함수
	float result; //결과값 저장
	result = num*num; //계산 결과 저장
	return result; //계산 결과 반환
}
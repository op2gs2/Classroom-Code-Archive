/*
실습2
작성자: 김동영
작성일: 2018.10.11
프로그램 설명: 표준 입력을 받고, 그 값을 바꿔 출력
*/

#include <stdio.h> //표준입출력라이브러리 불러오기

void swap(int num1, int num2); //함수를 미리 선언

int main(int argc, char*argv[]) { //main 함수의 시작
	int num1 = 0, num2 = 0; //변수 선언
	printf("값을 입력해주세요\t"); //입력을 위한 메시지 출력
	scanf_s("%d", &num1); //값을 불러들이기
	printf("값을 입력해주세요\t"); //입력을 위한 메시지 출력
	scanf_s("%d",&num2); //값을 불러들이기
	printf("m = %d / n = %d\n", num1, num2);// 입력값 확인
	swap(num1, num2); //함수 호출
	return 0; //함수의 종료
}

void swap(int num1, int num2) { //값에 대한 순서를 바꿔 출력하는 함수
	int temp; //임시 변수 선언
	temp = num1; //값을 교환
	num1 = num2; //값을 교환
	num2 = temp; //값을 교환
	printf("m = %d / n = %d\n", num1, num2); //값에 대한 순서를 바꿔 출력
}
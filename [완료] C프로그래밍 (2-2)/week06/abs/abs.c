/*
실습5
작성자: 김동영
작성일: 2018.10.11
프로그램 설명: 표준 입력을 받고, 그 값의 절대 값을 출력하는 프로그램
*/

#include <stdio.h> //표준입출력라이브러리 불러오기
int abs(int num); //함수를 미리 선언

int main(int argc, char*argv[]) { //main 함수의 시작
	int num = 0; //변수 선언
	printf("값을 입력해주세요\t"); //입력을 위한 메시지 출력
	scanf_s("%d", &num); //값을 불러들이기
	printf("input value = %d\n", num);// 결과 확인
	printf("abs value = %d\n", abs(num));// 결과 확인
	return 0; //함수의 종료
}

int abs(int num) { //입력받은 절대 값을을 반환하는 함수
	int result; //결과 변수
	result = num >= 0 ? num : (num*-1); //절대값 계산
	return result; //결과값 반환
}
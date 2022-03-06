/* 실습 3 : operatorExample3.c
작성일 : 2018년 09월 20일
작성자 : 김동영
프로그램 설명 : 키보드 입력 & 다항식 계산
*/

#include <stdio.h> //표준입출력 헤더파일

int main(int argc, char* argv[]) {
	int value_x = 0; //미지수에 들어갈 변수 선언

	puts("x의 값을 입력해주세요."); //값을 입력 받기 위한 메시지 출력
	scanf_s("%d", &value_x); //미지수 값을 입력 받기

	int result = (((value_x * value_x - 4)*(value_x * value_x - 10 * value_x + 21)) + 100); // 다항식을 계산하여 변수에 저장
	printf("다항식의 값은 %d 입니다. \n", result); //위 변수에 저장된 값을 출력

	return 0; //함수의 종료
}
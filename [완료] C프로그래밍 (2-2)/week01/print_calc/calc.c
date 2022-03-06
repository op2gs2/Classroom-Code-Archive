/*
실습 3: print_calc 프로젝트
소스 파일명: calc.c
작성일: 20180906
작성자: 김동영
프로그램 설명: 간단한 연산 수행과 결과값 출력 프로그램
*/

#include <stdio.h>

int main(int argc, char* agrv[]) {
	//선언문
	int a = 10, b = 3;
	float c = 10, d = 3;
	float res1, res2, res3;

	//계산
	res1 = a / b;   
	res2 = c / d;
	res3 = (float)a / b; 

	//출력문
	printf("%6.2f\n", res1);
	printf("%6.2f\n", res2);
	printf("%6.2f\n", res3);
}
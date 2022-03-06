/*
실습 7 : scanfExample.c
작성일 : 2018.09.13
작성자 : 김동영
프로그램 설명 : 자료형에 따른 scanf 형식지정자 사용
*/
#include <stdio.h>

int main()
{
	/*변수 선언*/
	short    s; //short 형 변수 s 선언
	long     l; //long 형 변수 l 선언
	unsigned u; //unsigned 형 변수 u 선언

	/*각 변수에 대한 값 입력 받기*/
	printf_s("Enter a short number : "); //입력을 받기 위한 안내문 출력
	scanf_s("%hd", &s); //short형 입력(사용자)
	printf_s("Enter a long number : "); //입력을 받기 위한 안내문 출력
	scanf_s("%ld", &l); //long형 입력(사용자)
	printf_s("Enter an unsigned number : "); //입력을 받기 위한 안내문 출력
	scanf_s("%u", &u); //unsigned형 입력(사용자)

	/*입력 받은 값 출력*/
	printf("\n%hd %ld %u \n", s, l, u);

	/*함수의 종료*/
	return 0;
}
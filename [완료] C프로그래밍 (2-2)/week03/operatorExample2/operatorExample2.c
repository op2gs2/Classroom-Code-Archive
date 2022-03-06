/* 실습 1 : operatorExample2.c
작성일 : 2018년 09월 20일
작성자 : 김동영
프로그램 설명 : 증감 연산자
*/
#include <stdio.h>

int main()
{
	int a, b, c; //int형 변수 a,b,c 선언

	a = 20; //변수 a에 20을 대입

	a++; //a에 대한 후위 연산
	++a; //a에 대한 전위 연산
	b = a++; //a에 대한 후위 연산, 따라서 b에는 a에 증가되기 전의 값이 저장됨
	c = ++a; //a에 대한 전위 연산, 따라서 b에는 a에 증가되고 난 뒤의 값이 저장됨

	printf("a=%d, b=%d, c=%d\n", a, b, c); //변수 a,b,c의 값을 출력
	return 0; //함수의 종료
}
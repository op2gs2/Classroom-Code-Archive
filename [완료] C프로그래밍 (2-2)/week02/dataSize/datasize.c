/*
실습 2: dataSize.c
작성일: 2018.09.13
작성자: 김동영
프로그램 설명: sizeof 연산자를 이용한 각 자료형의 크기 확인
*/

#include <stdio.h>

int main(int argc, char*argv[]) {
	//변수 선언
	char ch = 'a'; //char형 ch변수에 'a'를 저장
	int i = 65; //int형 i변수에 65를 저장
	double d = 3.14; //double형 d변수에 3.14를 저장

	printf("\n [THE SIZE OF DATATYPE]\n"); //제목 출력
	printf("char : %d\n", sizeof(char)); //char 크기 출력
	printf("char ch = \'A\': %d\n", sizeof(ch));//변수 ch의 크기 출력
	printf("int : %d\n", sizeof(int));//int의 크기 출력
	printf("int i=65: %d\n", sizeof(i));//변수 i의 크기 출력
	printf("short int : %d\n", sizeof(short int)); //short int의 크기 출력
	printf("long int : %d\n", sizeof(long int)); //long int의 크기 출력
	printf("float : %d\n ", sizeof(float)); //float의 크기 출력
	printf("double : %d\n ", sizeof(double)); //double의 크기 출력
	printf("double d = 3.14: %d\n", sizeof(d)); //변수 d의 크기 출력
	printf("long double : %d\n ", sizeof(long double)); //long double의 크기 출력
	printf("String \'Hello\' : %d\n", sizeof("Hello")); // "Hello"의 크기 출력
	printf("default constant 1 : %d\n", sizeof(7)); //상수 7의 크기 출력
	printf("default constant 2 : %d\n", sizeof(10.12)); //상수 10.12의 크기 출력

	//함수의 종료
	return 0;
}

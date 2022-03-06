/* 
실습 1 : print_value.c
작성일 : 2018.09.13
작성자 : 김동영
프로그램 설명 : 상수와 변수의 출력
*/
#include <stdio.h>

int main(int argc,  char* argv[]){
	//변수 선언과 동시에 초기화
	char  ch = 'M';
	int    iValue = 95;
	double dValue = 3.14;
	float fValue = 1.414f;

	//출력문에 값을 입력하고 출력
	printf("\n[ Print value ]\n");
	printf("char : %c \n", 'W');
	//선언한 변수를 일렬의 문자열과 함께 출력
	printf("char variable  : %c \n", ch);
	//출력문에 값을 입력하고 출력
	printf("int value : %d \n", 20);
	//출력문에 값을 입력하고 출력
	printf("int constants formula : %d \n", 10 + 20);
	//선언한 변수를 일렬의 문자열과 함께 출력
	printf("int variable  : %d \n", iValue);
	//출력문에 값을 입력하고 출력
	printf("double value : %f \n", 3.1415);
	//선언한 변수를 일렬의 문자열과 함께 출력
	printf("double variable : %f \n", dValue);
	//선언한 변수를 일렬의 문자열과 함께 출력
	printf("float variable : %f \n", fValue);
	//선언한 변수를 일렬의 문자열과 함께 출력
	printf("int variable : %d and float variable : %f \n", iValue, fValue);

	//함수의 종료
	return 0;
}

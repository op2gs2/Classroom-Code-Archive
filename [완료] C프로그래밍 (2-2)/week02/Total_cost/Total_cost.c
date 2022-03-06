/* 
실습 5 : Total_cost.c
작성일 : 2018.09.13
작성자 : 김동영
프로그램 설명 : cost라는 이름의 변수를 출력
*/

#include <stdio.h>

int main(int argv, char* argc[]) {
	long double cost = 172.530000; // long double형 cost변수 선언과 동시에 172.530000로 초기화

	printf("The sales total is : %f\n ", cost); //cost 출력
	
	//함수의 종료
	return 0;
}
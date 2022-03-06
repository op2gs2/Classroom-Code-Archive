/* 
실습 4 : save_n_print.c
작성일 : 2018.09.13
작성자 : 김동영
프로그램 설명 : 값에 대해 적절한 변수에 저장하고 출력하는 프로그램
*/

#include <stdio.h>

int main(int argv, char* argc[]) {
	int age = 128; //int형 변수 age에 128저장
	long long salary = 2500000000; //long형 변수 salary에 2500000000저장
	double pi = 3.14; //double형 변수 pi에 3.14저장
	char grade = 2; //char형 변수 grade에 2저장
	char credit = 'A'; //char형 변수 credit에 'A'저장

	printf("print age: %d\n", age); //age 출력
	printf("print salary: %lld\n", salary); //salary 출력
	printf("print pi: %d\n", pi); //pi 출력
	printf("print grade: %d\n", grade); //grade 출력
	printf("print credit: %c\n", credit); //credit 출력

	//함수의 종료
	return 0;
}
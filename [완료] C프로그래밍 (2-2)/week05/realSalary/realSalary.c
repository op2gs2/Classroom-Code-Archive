/*
작성자: 김동영
작성일: 2018.10.04
프로그램 설명: 
봉급을 기준으로
소득세를 계산하는 함수와 
주민세를 계산하는 함수와
보험료를 계산하는 함수와
소득, 주민, 보험료를 제외한 값을 계산하는 함수로
이루어진 프로그램
*/

#include <stdio.h> //표준입출력라이브러리 불러오기
double getIncomeTax(double salary); //함수의 선언
double getLocalinhabitantsTax(double IncomeTax); //함수의 선언
double getInsurance(double salary); //함수의 선언
double getPay(double salary, double IncomeTax, double LocalinhabitantsTax, double Insurance); //함수의 선언

int main(int argc, char* argv[]) {
	double salary; //급여 변수 선언
	double IncomeTax; //소득세 변수 선언
	double LocalinhabitantsTax; //주민세 변수 선언
	double Insurance; //보험료 변수 선언
	double Pay; //실제 지급액 변수 선언

	printf("월 급여를 입력하세요 : "); //입력을 위한 메시지 출력
	scanf_s("%lf", &salary); //입력 받기
	printf(">> 총급여(+) : %d(원)\n", (int)salary); //입력 받은 값을 출력

	IncomeTax = getIncomeTax(salary); //함수를 호출하고 반환된 값을 저장
	printf(">> 소득세(-) : %d(원)\n", (int)IncomeTax); //저장된 값을 출력

	LocalinhabitantsTax = getIncomeTax(IncomeTax); //함수를 호출하고 반환된 값을 저장
	printf(">> 주민세(-) : %d(원)\n", (int)LocalinhabitantsTax); //저장된 값을 출력
	 
	Insurance = getInsurance(salary); //함수를 호출하고 반환된 값을 저장
	printf(">> 보험료(-) : %d(원)\n", (int)Insurance); //저장된 값을 출력

	Pay = getPay(salary, IncomeTax, LocalinhabitantsTax, Insurance); //함수를 호출하고 반환된 값을 저장
	printf(">> 지급액    : %d(원)\n", (int)Pay); //저장된 값을 출력

	return 0;
}

double getIncomeTax(double salary) { //급여의 10%를 계산하여 반환
	double result; //결과 저장 변수 선언
	result = salary * ((double)10 / 100); //계산하기
	return result; // 계산 결과 반환
}
double getLocalinhabitantsTax(double IncomeTax) { //소득세의 10%를 계산하여 반환
	double result; //결과 저장 변수 선언
	result = IncomeTax * ((double)10 / 100); //계산하기
	return result; // 계산 결과 반환
}
double getInsurance(double salary) { //급여의 5.89%를 보험료로 계산
	double result; //결과 저장 변수 선언
	result = salary * ((double)5.89 / 100); //계산하기
	return result; // 계산 결과 반환
}
double getPay(double salary, double IncomeTax,
	double LocalinhabitantsTax, double Insurance) { //위에서 구한 값을 급여에서 빼서 반환
	double result; //결과 저장 변수 선언
	result = salary - (IncomeTax+ LocalinhabitantsTax+ Insurance); //계산하기
	return result; // 계산 결과 반환
}


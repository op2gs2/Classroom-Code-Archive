/*
실습 8 : operatorExample8.c
작성일 : 2018년 09월 20일
작성자 : 김동영
프로그램 설명 :  급여를 입력받아 소득세와 주민세와 보험료를 제외한 급여를 출력하는 프로그램
*/

#include <stdio.h> //표준입출력 헤더파일

int main(int argc, char* argv[]) {
	double salary = 0; //급여 변수
	double income_tax = 0; //소득세 변수
	double resident_tax = 0; //주민세 변수
	double insurance = 0; //보험 변수
	double real_salary = 0; //실제 급여 지급액
	
	/*입력받기*/
	puts("월 급여를 입력하세요 : ");
	scanf_s("%lf", &salary);

	/*계산하기*/
	income_tax = salary *(10.0 / 100.0); //소득세 = 급여에 10%에 해당하는 값
	resident_tax = income_tax *(10.0 / 100.0); // 주민세 = 소득세에 대한 10%에 해당하는 값
	insurance = salary * (589.0 / 10000.0); //보험료 = 급여에 5.89% 
	real_salary = salary - (income_tax + resident_tax + insurance); //실제 급여액은 급여에서 소득,주민세와 보험료를 제외한 값

	/*출력하기*/
	printf(">> 총급여(+)  : %lf\n", salary); //급여에 대한 출력
	printf(">> 소득세(-)  : %lf\n", income_tax); //소득세에 대한 출력
	printf(">> 주민세(-)  : %lf\n", resident_tax); //주민세에 대한 출력
	printf(">> 보험료(-)  : %lf\n", insurance); //보험료에 대한 출력
	printf(">> 지급액  : %lf\n", real_salary); //지급액에 대한 출력

	return 0; //함수 종료
}